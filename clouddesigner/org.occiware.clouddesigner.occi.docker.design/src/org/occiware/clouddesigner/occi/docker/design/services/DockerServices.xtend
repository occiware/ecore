/*******************************************************************************
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Fawaz PARAISO 
 * - William PIERS
 *******************************************************************************/
package org.occiware.clouddesigner.occi.docker.design.services

import java.lang.reflect.InvocationTargetException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.dialogs.ProgressMonitorDialog
import org.eclipse.jface.operation.IRunnableWithProgress
import org.eclipse.swt.widgets.Display
import org.eclipse.swt.widgets.Shell
import org.occiware.clouddesigner.occi.Configuration
import org.occiware.clouddesigner.occi.docker.Container
import org.occiware.clouddesigner.occi.docker.Machine
import org.occiware.clouddesigner.occi.docker.connector.ExecutableDockerFactory
import org.occiware.clouddesigner.occi.docker.connector.ExecutableDockerModel
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod
import org.occiware.clouddesigner.occi.infrastructure.StopMethod
import org.occiware.clouddesigner.occi.AbstractOCCIKindResolver

class DockerServices extends AbstractOCCIKindResolver{

	// Initialize the executable Docker factory.
	val init = ExecutableDockerFactory.init()

	/**
	 * Popup menu Start action.
	 */
	def void start(EObject eo) {
		var runnable = new IRunnableWithProgress() {
			override run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
				if (eo instanceof Machine) {
					var machine = eo as Machine
					val main = new ExecutableDockerModel(machine)
					main.start

				} else if (eo instanceof Container) {
					var container = eo as Container
					val main = new ExecutableDockerModel(container)
					main.container.start
				}
			}
		}
		var dialog = new ProgressMonitorDialog(getShell())
		dialog.run(false, true, runnable)
	}

	/**
	 * Popup menu importModel cation.
	 */
	def void importModel(Configuration conf) {
		var runnable = new IRunnableWithProgress() {
			override run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
				val main = new ExecutableDockerModel(conf)
				main.importModel
			}
		}
		var dialog = new ProgressMonitorDialog(getShell())
		dialog.run(false, true, runnable)
	}

	/**
	 * Popum menu synchronize action.
	 */
	def void synchronize(EObject eo) {
		var runnable = new IRunnableWithProgress() {
			override run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
				if (eo instanceof Machine) {
					var machine = eo as Machine
					val main = new ExecutableDockerModel(machine)
					main.synchronize
				}
			}
		}
		var dialog = new ProgressMonitorDialog(getShell())
		dialog.run(false, true, runnable)
	}

	/**
	 * Popup menu StartAll action
	 */
	def void startAll(EObject eo) {
		var runnable = new IRunnableWithProgress() {
			override run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
				if (eo instanceof Machine) {
					var machine = eo as Machine
					val main = new ExecutableDockerModel(machine)
					main.startAll
				}
			}
		}
		var dialog = new ProgressMonitorDialog(getShell())
		dialog.run(false, true, runnable)
	}

	/**
	 * Popup menu stop action.
	 */
	def void stop(EObject eo) {
		var runnable = new IRunnableWithProgress() {
			override run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
				if (eo instanceof Machine) {
					var machine = eo as Machine
					val main = new ExecutableDockerModel(machine)
					main.stop
				} else if (eo instanceof Container) {
					var container = eo as Container
					val main = new ExecutableDockerModel(container)
					main.container.stop(StopMethod.GRACEFUL)
				}
			}
		}
		var dialog = new ProgressMonitorDialog(getShell())
		dialog.run(false, true, runnable)
	}

	/**
	 * Popup menu restart action.
	 */
	def void restart(EObject eo) {
		var runnable = new IRunnableWithProgress() {
			override run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
				if (eo instanceof Machine) {
					var machine = eo as Machine
					val main = new ExecutableDockerModel(machine)
					main.restart

				} else if (eo instanceof Container) {
					var container = eo as Container
					val main = new ExecutableDockerModel(container)
					main.container.restart(RestartMethod.GRACEFUL)
				}
			}
		}
		var dialog = new ProgressMonitorDialog(getShell())
		dialog.run(false, true, runnable)
	}

	def Shell getShell() {
		return Display.current.activeShell
	}

}
