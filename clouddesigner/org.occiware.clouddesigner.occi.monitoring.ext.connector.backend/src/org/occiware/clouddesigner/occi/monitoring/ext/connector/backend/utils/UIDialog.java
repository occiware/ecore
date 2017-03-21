/**
 * Copyright (c) 2016 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Christophe Gourdin <christophe.gourdin@inria.fr>
 *
 */
package org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.Bundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.log4j.Level;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * This class manage the ui dialog when embedded in cloud designer and
 * multithreading tasks in standalone mode.
 * 
 * 
 * @author Christophe Gourdin
 *
 */
public class UIDialog {

	private static Logger LOGGER = LoggerFactory.getLogger(UIDialog.class);
	private static final boolean standaloneMode;

	static {
		// Check headless environnement (from console or from ui)
		if (PlatformUI.isWorkbenchRunning()) {
			LOGGER.debug("UI mode.");
			standaloneMode = false;
		} else {
			LOGGER.debug("Headless mode.");
			standaloneMode = true;
		}
	}

	/**
	 * Encapsulate in a thread the runnable with dialog progress if in cloud
	 * designer mode
	 * 
	 * @param runnable
	 */
	public static void executeActionThread(final IRunnableWithProgress runnable, final String actionName) {

		try {
				IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

					@Override
					public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
						if (!monitor.isCanceled()) {
							monitor.beginTask("Operation in progress : " + actionName, 0);
							runnable.run(monitor);
							monitor.done();
						} else {
							return;
						}
					}
				};
				Shell shell = getCurrentShell();

				ProgressMonitorDialog dialog = new ProgressMonitorDialog(shell);
				
				dialog.setOpenOnRun(true);

				dialog.run(true, true, runnableWithProgress);


		} catch (IllegalStateException | InvocationTargetException | InterruptedException ex) {
			LOGGER.error("Error while executing an action task : " + ex.getMessage());
			ex.printStackTrace();
		}

	}
	
	/**
	 * Encapsulate the operation in a thread.
	 * @param runnable
	 * @param titleMessage
	 */
	public static void executeActionThread(final Runnable runnable, String titleMessage) {
		
		Thread actionThread = new Thread(runnable);
		actionThread.start();
	}

	/**
	 * True for ok false for cancel or not confirmed.
	 * 
	 * @return
	 */
	public static boolean showConfirmDialog() {
		boolean result = false;
		if (!standaloneMode) {
			Shell shell = getCurrentShell();
			result = MessageDialog.openConfirm(shell, "Confirm", "Please confirm the action");
		} else {
			result = false; // no confirmation in standalone mode.
		}
		return result;
	}
	
	/**
	 * Show a dialog dispatch by level message (information, error and warn).
	 * @param title
	 * @param message
	 * @param level {@link Level}
	 */
	public static void showUserMessage(final String title, final String message, final Level level) {
		switch (level.toInt()) {
		case Level.INFO_INT:
			showInformationDialog(title, message);
			break;
			
		case Level.ERROR_INT:
			showErrorDialog(title, message);
			break;
		case Level.WARN_INT:
			showWarningDialog(title, message);
			break;
		default:
			showInformationDialog(title, message);
			break;
		}
	}
	
	
	/**
	 * Show an information dialog.
	 * @param title
	 * @param message
	 */
	public static void showInformationDialog(final String title, final String message) {
		if (!standaloneMode) {
			Shell shell = getCurrentShell();
			MessageDialog.openInformation(shell, title, message);
		}
	}
	
	/**
	 * Show a warning dialog.
	 * @param message
	 */
	public static void showWarningDialog(final String title, final String message) {
		if (!standaloneMode) {
			Shell shell = getCurrentShell();
			MessageDialog.openWarning(shell, title, message);
		}
	}
	
	/**
	 * Show a basic error dialog.
	 * @param title
	 * @param message
	 */
	public static void showErrorDialog(final String title, final String message) {
		// TODO : Add stacktrace in a custom error dialog.
		if (!standaloneMode) {
			Shell shell = getCurrentShell();
			MessageDialog.openError(shell, title, message);
		}
	}
	
	/**
	 * Is this connector is used as a standalone library (true) or used in Cloud designer (false).
	 * @return
	 */
	public static boolean isStandAlone() {
		return standaloneMode;
	}

	/**
	 * Get the current shell of the current display.
	 * 
	 * @return
	 */
	private static Shell getCurrentShell() {
		return Display.getCurrent().getActiveShell();
	}

	

}
