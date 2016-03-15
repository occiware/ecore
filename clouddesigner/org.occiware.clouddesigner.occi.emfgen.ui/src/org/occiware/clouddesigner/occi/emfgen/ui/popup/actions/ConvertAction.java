package org.occiware.clouddesigner.occi.emfgen.ui.popup.actions;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.presentation.GeneratorUIUtil;
import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelUtil;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ocl.pivot.utilities.LabelUtil;
import org.eclipse.pde.internal.core.project.PDEProject;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.emfgen.ConverterUtils;
import org.occiware.clouddesigner.occi.emfgen.OCCIExtension2Ecore;

public class ConvertAction implements IObjectActionDelegate {

	private static final String ECORE_PLATFORM_URI = "platform:/plugin/org.eclipse.emf.ecore/model/Ecore.ecore";

	private static final String CORE_GEN_PACKAGE_URI = "platform:/plugin/org.occiware.clouddesigner.occi/model/OCCI.genmodel";

	private ISelection selection;

	private ResourceSet resourceSet = new ResourceSetImpl();

	private Shell shell = PlatformUI.getWorkbench().getDisplay().getActiveShell();;

	/**
	 * Constructor for Action1.
	 */
	public ConvertAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	@Override
	public void run(IAction action) {
		IFile occieFile = (IFile) ((IStructuredSelection) selection).getFirstElement();
		try {
			EPackage.Registry.INSTANCE.put(ECORE_PLATFORM_URI, EcorePackage.eINSTANCE);
			resourceSet = new ResourceSetImpl();
			Extension ext = (Extension) ConverterUtils.getRootElement(resourceSet,
					"file:/" + occieFile.getLocation().toString());

			Map<Object, Object> validationContext = LabelUtil.createDefaultContext(Diagnostician.INSTANCE);
			BasicDiagnostic diagnostics = Diagnostician.INSTANCE.createDefaultDiagnostic(ext);
			if (!Diagnostician.INSTANCE.validate(ext, diagnostics, validationContext)) {
				StringBuilder message = null;
				for (Diagnostic diagnostic : diagnostics.getChildren()) {
					if (message == null) {
						message = new StringBuilder();
					} else {
						message.append("\n");
					}
					message.append(diagnostic.getMessage());
				}
				if (message != null) {
					MessageDialog.openError(shell, "Invalid Extension", message.toString());
					return;
				}
			}

			// set a base package if necessary
			String basePackage = "";
			String projectName = occieFile.getProject().getName();
			String extensionName = ext.getName();
			if (projectName.toLowerCase().endsWith(extensionName.toLowerCase())
					&& projectName.length() > extensionName.length()) {
				basePackage = projectName.substring(0, projectName.length() - (extensionName.length() + 1))
						.toLowerCase();
			}

			try {
				generateEMFModels(ext,
						occieFile.getLocation().removeFileExtension().addFileExtension("ecore").toString(),
						basePackage);
			} catch (IllegalArgumentException e) {
				MessageDialog.openError(shell, "Invalid Extension", e.getMessage());
				return;
			}
			occieFile.getParent().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			generateEMFCode(occieFile.getLocation().removeFileExtension().addFileExtension("genmodel ").toString());

			IFile build = PDEProject.getBuildProperties(occieFile.getProject());
			String buildContent = "bin.includes = .,\\\n               model/,\\\n               META-INF/,\\\n               plugin.xml,\\\n               plugin.properties\njars.compile.order = .\nsource.. = src-gen/\noutput.. = bin/\n";
			build.setContents(new ByteArrayInputStream(buildContent.getBytes()), true, false,
					new NullProgressMonitor());
		} catch (InvocationTargetException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		} catch (IOException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		} catch (InterruptedException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		} catch (CoreException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

	private void generateEMFModels(Extension ext, String ecoreLocation, String basePackage) throws IOException {
		/*
		 * OCCIE => Ecore conversion
		 */
		EPackage ePackage = new OCCIExtension2Ecore().convertExtension(ext);
		resourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
		ConverterUtils.persistMetamodel(resourceSet, ePackage, ecoreLocation);

		/*
		 * Fetching ext genmodels
		 */
		Collection<GenPackage> usedPackages = new ArrayList<GenPackage>();
		for (Extension extension : ext.getImport()) {
			if (!extension.getName().equals("core")) {
				GenModel genModel = (GenModel) resourceSet
						.getResource(
								URI.createURI(
										extension.eResource().getURI().toString().replaceAll(".occie", ".genmodel")),
								true)
						.getContents().get(0);
				usedPackages.add(genModel.getGenPackages().get(0));
			}
		}

		/*
		 * Create genmodel
		 */
		GenPackage coreGenPackage = (GenPackage) ConverterUtils.getRootElement(resourceSet, CORE_GEN_PACKAGE_URI)
				.eContents().get(1);
		usedPackages.add(coreGenPackage);
		GenUtils.createGenModel(ePackage, ecoreLocation, basePackage, usedPackages);
	}

	/**
	 * TODO merge monitor
	 */
	private void generateEMFCode(String genModelPath) throws InvocationTargetException, InterruptedException {
		/*
		 * Generate model & edit
		 */
		List<URI> uris = new ArrayList<URI>();
		uris.add(URI.createFileURI(genModelPath));
		List<GenModel> genModels = GeneratorUIUtil.loadGenModels(new NullProgressMonitor(), uris, shell);
		GeneratorUIUtil.GeneratorOperation editOp = new GeneratorUIUtil.GeneratorOperation(shell);
		editOp.addGeneratorAndArguments(GenModelUtil.createGenerator(genModels.get(0)), genModels.get(0),
				"org.eclipse.emf.codegen.ecore.genmodel.generator.EditProject", "Edit");
		editOp.addGeneratorAndArguments(GenModelUtil.createGenerator(genModels.get(0)), genModels.get(0),
				"org.eclipse.emf.codegen.ecore.genmodel.generator.ModelProject", "Model");
		ProgressMonitorDialog progressMonitorDialog = new ProgressMonitorDialog(shell);
		progressMonitorDialog.run(true, true, editOp);
	}

}
