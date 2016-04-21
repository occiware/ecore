/*******************************************************************************
 * Copyright (c) 2015-2016 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	   William Piers <william.piers@obeo.fr>
 *     Philippe Merle <philippe.merle@inria.fr>
 *******************************************************************************/
package org.occiware.clouddesigner.occi.emfgen.ui.popup.actions;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.pde.internal.core.project.PDEProject;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.sirius.ui.tools.api.project.ViewpointSpecificationProject;
import org.eclipse.ui.PlatformUI;
import org.occiware.clouddesigner.occi.emfgen.ConverterUtils;

public class GenUtils {

	public static IProject genDesignProject(String projectName, String modelFileName, ProgressMonitorDialog dialog)
			throws CoreException, IOException {
		final IPath projectLocationPath = ResourcesPlugin.getWorkspace().getRoot().getLocation();
		IProject project = ViewpointSpecificationProject.createNewViewpointSpecificationProject(
				PlatformUI.getWorkbench(), projectName, projectLocationPath, modelFileName,
				ViewpointSpecificationProject.INITIAL_OBJECT_NAME, ViewpointSpecificationProject.ENCODING_DEFAULT,
				dialog);

		// add dependency to the metamodel
		IFile manifest = PDEProject.getManifest(project);
		StringBuilder buffer = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(manifest.getContents()));
		String inputLine;
		while ((inputLine = in.readLine()) != null) {
			buffer.append(inputLine + "\n");
			if (inputLine.startsWith("Require-Bundle:")) {
				buffer.append(" org.occiware.clouddesigner.occi,\n");
				buffer.append(" org.occiware.clouddesigner.occi.design,\n");
			}
		}
		in.close();
		manifest.setContents(new ByteArrayInputStream(buffer.toString().getBytes()), 0, dialog.getProgressMonitor());

		String modelName = modelFileName.substring(0, modelFileName.indexOf('.'));

		// add extension to plugin.xml
		IFile pluginXml = PDEProject.getPluginXml(project);
		buffer = new StringBuilder();
		in = new BufferedReader(new InputStreamReader(pluginXml.getContents()));
		while ((inputLine = in.readLine()) != null) {
			if (inputLine.startsWith("</plugin>")) {
				buffer.append("  <extension point=\"org.eclipse.ui.newWizards\">\n");
				buffer.append("    <category\n");
				buffer.append("        id=\"org.occiware.clouddesigner\"\n");
				buffer.append("        name=\"Cloud Designer\">\n");
				buffer.append("    </category>\n");
				buffer.append("    <wizard\n");
				buffer.append("        category=\"org.occiware.clouddesigner\"\n");
				buffer.append("        class=\"").append(projectName).append(".wizard.NewConfigurationWizard\"\n");
				buffer.append("        icon=\"images/Configuration.gif\"\n");
				buffer.append("        id=\"").append(projectName).append(".wizard.NewConfigurationWizard\"\n");
				buffer.append("        name=\"").append(modelName).append(" Configuration File\">\n");
				buffer.append("    </wizard>\n");
				buffer.append("  </extension>\n");
			}
			buffer.append(inputLine + "\n");
		}
		in.close();
		pluginXml.setContents(new ByteArrayInputStream(buffer.toString().getBytes()), 0, dialog.getProgressMonitor());		

		buffer = new StringBuilder();
		buffer.append("/*******************************************************************************\n");
		buffer.append(" * Copyright (c) 2015-2016 Obeo, Inria\n");
		buffer.append(" * All rights reserved. This program and the accompanying materials\n");
		buffer.append(" * are made available under the terms of the Eclipse Public License v1.0\n");
		buffer.append(" * which accompanies this distribution, and is available at\n");
		buffer.append(" * http://www.eclipse.org/legal/epl-v10.html\n");
		buffer.append(" *\n");
		buffer.append(" * Contributors:\n");
		buffer.append(" * - William Piers <william.piers@obeo.fr>\n");
		buffer.append(" * - Philippe Merle <philippe.merle@inria.fr>\n");
		buffer.append(" *******************************************************************************/\n");
		buffer.append("\n");
		buffer.append("package ").append(projectName).append(".wizard;\n");
		buffer.append("\n");
		buffer.append("import org.occiware.clouddesigner.occi.design.utils.NewDiagramWizard;\n");
		buffer.append("\n");
		buffer.append("/**\n");
		buffer.append(" * This is a simple wizard for creating a new ").append(modelName).append(" model file.\n");
		buffer.append(" */\n");
		buffer.append("\n");

		buffer.append("public class NewConfigurationWizard extends NewDiagramWizard\n");
		buffer.append("{\n");
		buffer.append("\tpublic NewConfigurationWizard()\n");
		buffer.append("\t{\n");
		String tmp = modelName.substring(0,1).toUpperCase() + modelName.substring(1);
		buffer.append("\t\tsuper(\"viewpoint:/").append(projectName).append("/").append(tmp).append("Configuration\", \"").append(modelName).append("\", \"").append(tmp).append("Configuration Diagram\");\n");
		buffer.append("\t}\n");
		buffer.append("}\n");
		IFolder folder = project.getFolder("src/" + projectName.replaceAll("\\.",  "/") + "/wizard");
		folder.create(false, false, dialog.getProgressMonitor());
		IFile newConfigurationWizard = folder.getFile("NewConfigurationWizard.java");
		newConfigurationWizard.create(new ByteArrayInputStream(buffer.toString().getBytes()), 0, dialog.getProgressMonitor());		
		return project;
	}

	public static IProject genDesignTestProject(IProject designProject, IProgressMonitor monitor) throws CoreException {
		final IPath projectLocationPath = ResourcesPlugin.getWorkspace().getRoot().getLocation();
		return ModelingProjectManager.INSTANCE.createNewModelingProject(designProject.getName() + ".tests",
				projectLocationPath, true, monitor);
	}

	public static GenPackage createGenModel(final EPackage rootPackage, final String ecoreLocation, String basePackage,
			Collection<GenPackage> usedGenPackages) throws IOException {
		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		genModel.setComplianceLevel(GenJDKLevel.JDK70_LITERAL);
		genModel.setCopyrightText(
				"Copyright (c) 2015-2016 Obeo, Inria\n" +
				"All rights reserved. This program and the accompanying materials\n" +
				"are made available under the terms of the Eclipse Public License v1.0\n" +
				"which accompanies this distribution, and is available at\n" +
				"http://www.eclipse.org/legal/epl-v10.html\n" +
				"	\n" +
				"Contributors:\n" +
				"- William Piers <william.piers@obeo.fr>\n" +
				"- Philippe Merle <philippe.merle@inria.fr>"
		);
		String modelPluginId = new Path(ecoreLocation).removeLastSegments(2).lastSegment().toString();
		String editPluginId = modelPluginId + ".edit";
		String editorPluginId = modelPluginId + ".editor";
		String testsPluginId = modelPluginId + ".tests";
		genModel.setModelDirectory('/' + modelPluginId + "/src-gen");
		genModel.setEditDirectory('/' + editPluginId + "/src-gen");
		genModel.setEditorDirectory('/' + editorPluginId + "/src-gen");
		genModel.setTestsDirectory('/' + testsPluginId + "/src");
		genModel.getForeignModel().add(new Path(ecoreLocation).lastSegment());
		genModel.setModelName(ConverterUtils.toU1Case(rootPackage.getName()));
		genModel.setModelPluginID(modelPluginId);
		genModel.setEditPluginID(editPluginId);
		genModel.setEditorPluginID(editorPluginId);
		genModel.setTestsPluginID(testsPluginId);
		genModel.setRootExtendsInterface("org.eclipse.emf.ecore.EObject");
		// Activate code generation for Ecore reflective and dynamic invocation of OCCI actions.
		genModel.setOperationReflection(true);
		genModel.getUsedGenPackages().addAll(usedGenPackages);
		genModel.initialize(Collections.singleton(rootPackage));
		GenPackage genPackage = genModel.getGenPackages().get(0);
		genPackage.setPrefix(ConverterUtils.toU1Case(rootPackage.getNsPrefix()));
		genPackage.setBasePackage(basePackage);
		URI genModelURI = URI
				.createFileURI(new Path(ecoreLocation).removeFileExtension().addFileExtension("genmodel").toString());
		final XMIResourceImpl genModelResource = new XMIResourceImpl(genModelURI);
		genModelResource.getContents().add(genModel);
		genModelResource.save(Collections.EMPTY_MAP);
		return genPackage;
	}
}
