package org.occiware.clouddesigner.occi.emfgen.ui.popup.actions;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.presentation.GeneratorUIUtil;
import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelUtil;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.pde.internal.core.project.PDEProject;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.OCCIFactory;
import org.occiware.clouddesigner.occi.design.utils.WizardUtils;
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
			String extensionName = occieFile.getFullPath().removeFileExtension().lastSegment();
			String modelPath = occieFile.getParent().getLocation().toString();
			String ecoreLocation = modelPath + '/' + ConverterUtils.toU1Case(extensionName) + ".ecore";
			String modelPluginName = new Path(ecoreLocation).removeLastSegments(2).lastSegment().toString();
			String designName = extensionName + ".odesign";
			String designProjectName = modelPluginName + ".design";
			String genModelPath = modelPath + '/' + ConverterUtils.toU1Case(extensionName) + ".genmodel";
			String basePackage = "";
			if (!modelPluginName.equals(extensionName)) {
				basePackage = modelPluginName.substring(0, modelPluginName.length() - (extensionName.length() + 1));
			}

			generateEMFModels(extensionName, ecoreLocation, basePackage);
			generateEMFCode(genModelPath);

			IFile build = PDEProject.getBuildProperties(occieFile.getProject());
			String buildContent = "bin.includes = .,\\\n               model/,\\\n               META-INF/,\\\n               plugin.xml,\\\n               plugin.properties\njars.compile.order = .\nsource.. = src-gen/\noutput.. = bin/\n";
			build.setContents(new ByteArrayInputStream(buildContent.getBytes()), true, false,
					new NullProgressMonitor());

			// TODO the generation must be iterative (i.e. not with acceleo)
			// IProject project = generateDesignProject(ecoreLocation,
			// designName, designProjectName,
			// new NullProgressMonitor());// TODO fix monitor

			// TODO we must install model & restart the IDE first
			// generateDesignTestProject(project, extensionName, new
			// NullProgressMonitor());// TODO
			// fix
			// monitor
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

	private void generateEMFModels(String extensionName, String ecoreLocation, String basePackage) throws IOException {
		/*
		 * OCCIE => Ecore conversion
		 */
		EPackage.Registry.INSTANCE.put(ECORE_PLATFORM_URI, EcorePackage.eINSTANCE);
		resourceSet = new ResourceSetImpl();
		Extension ext = (Extension) ConverterUtils.getRootElement(resourceSet,
				"file:/" + ecoreLocation.substring(0, ecoreLocation.length() - 5) + "occie");
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

	private IProject generateDesignProject(String ecoreLocation, String designName, String designProjectName,
			final IProgressMonitor monitor) throws CoreException, IOException {
		/*
		 * Create design project
		 */
		IProject project = GenUtils.genDesignProject(designProjectName, designName, new ProgressMonitorDialog(shell));

		/*
		 * Create design model
		 */
		org.occiware.clouddesigner.occi.emfgen.design.main.Generate generator = new org.occiware.clouddesigner.occi.emfgen.design.main.Generate(
				URI.createFileURI(ecoreLocation), project.getFolder("description").getLocation().toFile(),
				new ArrayList<String>());
		generator.doGenerate(BasicMonitor.toMonitor(monitor));
		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
		return project;
	}

	private void generateDesignTestProject(IProject project, String extensionName, final IProgressMonitor monitor)
			throws CoreException, IOException, WorkbenchException {
		/*
		 * Create design test project
		 */
		IProject testProject = GenUtils.genDesignTestProject(project, monitor);

		/*
		 * Create design representation
		 */
		final Resource resource = resourceSet.createResource(URI.createURI(
				"platform:/resource/" + testProject.getFullPath() + "/sample." + extensionName.toLowerCase()));
		resource.getContents().add(OCCIFactory.eINSTANCE.createConfiguration());
		resource.save(Collections.EMPTY_MAP);

		// switch perspective
		PlatformUI.getWorkbench().showPerspective("org.eclipse.sirius.ui.tools.perspective.modeling",
				PlatformUI.getWorkbench().getActiveWorkbenchWindow());

		final Session session = ModelingProject.asModelingProject(testProject).get().getSession();
		session.getTransactionalEditingDomain().getCommandStack()
				.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
					@Override
					protected void doExecute() {
						session.addSemanticResource(resource.getURI(), monitor);
					}
				});

		WizardUtils.enableViewpoint(session,
				"viewpoint:/" + project.getName() + '/' + ConverterUtils.toU1Case(extensionName) + "Configuration");
		String diagramInstanceName = "Sample " + extensionName;
		EObject root = WizardUtils.getRoot(session, resource.getURI());
		WizardUtils.openDiagram(monitor, testProject, "Configuration Diagram", diagramInstanceName, root);

		project.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

}
