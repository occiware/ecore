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
package org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.thread;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
		if (org.eclipse.swt.widgets.Display.getCurrent() == null) {
			standaloneMode = true;
		} else {
			standaloneMode = false;
		}
	}

	/**
	 * Encapsulate in a thread the runnable with dialog progress if in cloud
	 * designer mode or in standalone a simple thread.
	 * 
	 * @param runnable
	 */
	public static void executeActionThread(Runnable runnable) {

		try {

			if (standaloneMode) {
				Thread thread = new Thread(runnable);
				thread.start();

			} else {
				IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

					@Override
					public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
						if (!monitor.isCanceled()) {
							monitor.beginTask("operation in progress...", 0);
							runnable.run();
							monitor.done();
						} else {
							return;
						}
					}
				};
				Shell shell = getCurrentShell();
				
				ProgressMonitorDialog dialog = new ProgressMonitorDialog(shell);
				dialog.setOpenOnRun(true);
				
				dialog.run(false, true, runnableWithProgress);

			}

		} catch (IllegalStateException | InvocationTargetException | InterruptedException ex) {
			LOGGER.error("Error while executing an action task : " + ex.getMessage());
			ex.printStackTrace();
		}

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
			result = true; // no confirmation in standalone mode.
		}
		return result;
	}

	/**
	 * Get the current shell of the current display.
	 * @return
	 */
	private static Shell getCurrentShell() {
		return Display.getCurrent().getActiveShell();
	}

}
