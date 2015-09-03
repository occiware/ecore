package org.occiware.clouddesigner.occi2ecore.popup.actions;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.sirius.ui.tools.api.project.ViewpointSpecificationProject;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.occiware.clouddesigner.occi2ecore.gen.design.ui.common.GenerateAll;

public class DesignGenUtils {
	public static void genDesignModel(IFile model, IContainer target) throws CoreException {
		URI modelURI = URI.createPlatformResourceURI(model.getFullPath().toString(), true);
		try {
			GenerateAll generator = new GenerateAll(modelURI, target, new ArrayList<String>());
			generator.doGenerate(new NullProgressMonitor());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static IProject genDesignProject(String projectName, String modelName) throws CoreException, IOException {
		final IPath projectLocationPath = ResourcesPlugin.getWorkspace().getRoot().getLocation();
		final Shell activeShell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		final ProgressMonitorDialog monitorDialog = new ProgressMonitorDialog(activeShell);
		IProject project = ViewpointSpecificationProject.createNewViewpointSpecificationProject(
				PlatformUI.getWorkbench(), projectName, projectLocationPath, modelName,
				ViewpointSpecificationProject.INITIAL_OBJECT_NAME, ViewpointSpecificationProject.ENCODING_DEFAULT,
				monitorDialog);
		IFile file = project.getFile("META-INF/MANIFEST.MF");
		StringBuffer buffer = new StringBuffer();
		BufferedReader in = new BufferedReader(new InputStreamReader(file.getContents()));
		String inputLine;
		while ((inputLine = in.readLine()) != null) {
			buffer.append(inputLine + "\n");
			if (inputLine.startsWith("Require-Bundle:")) {
				buffer.append(" org.occiware.clouddesigner.occi,\n");
			}
		}
		in.close();
		file.setContents(new ByteArrayInputStream(buffer.toString().getBytes()), 0, null);
		return project;
	}

	public static IProject genDesignTestProject(IProject designProject) throws CoreException {
		NullProgressMonitor monitor = new NullProgressMonitor();
		final IPath projectLocationPath = ResourcesPlugin.getWorkspace().getRoot().getLocation();
		return ModelingProjectManager.INSTANCE.createNewModelingProject(designProject.getName() + ".tests",
				projectLocationPath, true, monitor);
	}
}
