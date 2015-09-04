package org.occiware.clouddesigner.occi.emfgen.ui.popup.actions;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.presentation.GeneratorUIUtil;
import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.occiware.clouddesigner.occi.emfgen.ConverterUtils;

public final class EMFGenUtils {

	public static GenPackage createGenModel(final EPackage rootPackage, final String ecoreLocation, String basePackage,
			Collection<GenPackage> usedGenPackages) throws IOException {
		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		genModel.setComplianceLevel(GenJDKLevel.JDK70_LITERAL);
		String modelPluginId = new Path(ecoreLocation).removeLastSegments(2).lastSegment().toString();
		String editPluginId = modelPluginId + ".edit";
		genModel.setModelDirectory('/' + modelPluginId + "/src-gen");
		genModel.setEditDirectory('/' + editPluginId + "/src-gen");
		genModel.getForeignModel().add(new Path(ecoreLocation).lastSegment());
		genModel.setModelName(ConverterUtils.toU1Case(rootPackage.getName()));
		genModel.setModelPluginID(modelPluginId);
		genModel.setEditorPluginID(editPluginId);
		genModel.setRootExtendsInterface("org.eclipse.emf.ecore.EObject");
		genModel.getUsedGenPackages().addAll(usedGenPackages);
		genModel.initialize(Collections.singleton(rootPackage));
		GenPackage genPackage = genModel.getGenPackages().get(0);
		genPackage.setPrefix(rootPackage.getNsPrefix());
		genPackage.setBasePackage(basePackage);

		URI genModelURI = URI
				.createFileURI(new Path(ecoreLocation).removeFileExtension().addFileExtension("genmodel").toString());
		final XMIResourceImpl genModelResource = new XMIResourceImpl(genModelURI);
		genModelResource.getContents().add(genModel);
		genModelResource.save(Collections.EMPTY_MAP);
		return genPackage;
	}

	public static void regenEMF(ResourceSet resourceSet, String genModelPath)
			throws InvocationTargetException, InterruptedException {
		Shell shell = Display.getCurrent().getActiveShell();
		List<URI> uris = new ArrayList<URI>();
		uris.add(URI.createFileURI(genModelPath));
		List<GenModel> genModels = GeneratorUIUtil.loadGenModels(new org.eclipse.core.runtime.NullProgressMonitor(),
				uris, shell);

		GeneratorUIUtil.GeneratorOperation editOp = new GeneratorUIUtil.GeneratorOperation(shell);
		editOp.addGeneratorAndArguments(GenModelUtil.createGenerator(genModels.get(0)), genModels.get(0),
				"org.eclipse.emf.codegen.ecore.genmodel.generator.EditProject", "Edit");
		editOp.addGeneratorAndArguments(GenModelUtil.createGenerator(genModels.get(0)), genModels.get(0),
				"org.eclipse.emf.codegen.ecore.genmodel.generator.ModelProject", "Model");
		new ProgressMonitorDialog(shell).run(true, true, editOp);

	}
}
