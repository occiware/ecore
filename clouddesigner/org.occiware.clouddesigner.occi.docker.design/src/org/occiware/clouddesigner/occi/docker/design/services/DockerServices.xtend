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
import org.eclipse.jface.dialogs.MessageDialog
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

class DockerServices {

	// Initialize the executable Docker factory.
	val init = ExecutableDockerFactory.init()

	/**
	 * Popup menu Start action.
	 */
	def void start(EObject eo) {
		val kind = eobjectKind(eo)

		if (kind == 0) { // This is a machine
			var machine = eo as Machine
			if (machine.name == null || machine.name.trim() == "") { // TODO improve the validation
				MessageDialog.openInformation(shell, "Warning", "Machine name is required!")
			} else {
				var runnable = new IRunnableWithProgress() {
					override run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
						var machine = eo as Machine
						val main = new ExecutableDockerModel(machine)
						main.start
					}
				}
				var dialog = new ProgressMonitorDialog(getShell())
				dialog.run(false, true, runnable)

			}
		} else if (kind == 1) { // This is a container
			var container = eo as Container
			if (container.name == null || container.name.trim() == "") { // TODO improve the validation
				MessageDialog.openInformation(shell, "Warning", "Container name is required!")
			} else {
				var runnable = new IRunnableWithProgress() {
					override run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
						var container = eo as Container
						val main = new ExecutableDockerModel(container)
						main.container.start
					}
				}
				var dialog = new ProgressMonitorDialog(getShell())
				dialog.run(false, true, runnable)

			}

		}

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
		val kind = eobjectKind(eo)
		if (kind == 0) {
			var machine = eo as Machine
			// TODO the validation should be specific to the machine
			if (machine.name == null || machine.name.trim() == "") { // TODO improve the validation
				MessageDialog.openInformation(shell, "Warning", "Machine name is required!")
			} else {
				var runnable = new IRunnableWithProgress() {
					override run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
						var machine = eo as Machine
						val main = new ExecutableDockerModel(machine)
						main.startAll
					}
				}
				var dialog = new ProgressMonitorDialog(getShell())
				dialog.run(false, true, runnable)
			}
		}
	}

	/**
	 * Popup menu stop action.
	 */
	def void stop(EObject eo) {
		val kind = eobjectKind(eo)

		if (kind == 0) { // This is a machine
			var machine = eo as Machine
			if (machine.name == null || machine.name.trim() == "") { // TODO improve the validation
				MessageDialog.openInformation(shell, "Warning", "Machine name is required!")
			} else {
				var runnable = new IRunnableWithProgress() {
					override run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
						var machine = eo as Machine
						val main = new ExecutableDockerModel(machine)
						main.stop
					}
				}
				var dialog = new ProgressMonitorDialog(getShell())
				dialog.run(false, true, runnable)

			}
		} else if (kind == 1) { // This is a container
			var container = eo as Container
			if (container.name == null || container.name.trim() == "") { // TODO improve the validation
				MessageDialog.openInformation(shell, "Warning", "Container name is required!")
			} else {
				var runnable = new IRunnableWithProgress() {
					override run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
						var container = eo as Container
						val main = new ExecutableDockerModel(container)
						main.container.stop(StopMethod.GRACEFUL)
					}
				}
				var dialog = new ProgressMonitorDialog(getShell())
				dialog.run(false, true, runnable)

			}

		}

	}

	/**
	 * Popup menu restart action.
	 */
	def void restart(EObject eo) {

		val kind = eobjectKind(eo)

		if (kind == 0) { // This is a machine
			var machine = eo as Machine
			if (machine.name == null || machine.name.trim() == "") { // TODO improve the validation
				MessageDialog.openInformation(shell, "Warning", "Machine name is required!")
			} else {
				var runnable = new IRunnableWithProgress() {
					override run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
						var machine = eo as Machine
						val main = new ExecutableDockerModel(machine)
						main.restart
					}
				}
				var dialog = new ProgressMonitorDialog(getShell())
				dialog.run(false, true, runnable)

			}
		} else if (kind == 1) { // This is a container
			var container = eo as Container
			if (container.name == null || container.name.trim() == "") { // TODO improve the validation
				MessageDialog.openInformation(shell, "Warning", "Container name is required!")
			} else {
				var runnable = new IRunnableWithProgress() {
					override run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
						var container = eo as Container
						val main = new ExecutableDockerModel(container)
						main.container.restart(RestartMethod.GRACEFUL)
					}
				}
				var dialog = new ProgressMonitorDialog(getShell())
				dialog.run(false, true, runnable)

			}

		}
	}

	def Shell getShell() {
		return Display.current.activeShell
	}

	/**
	 * Classify the EObject according to its kind (Machine/Container)
	 */
	def int eobjectKind(EObject eo) {
		var int kind = 2
		if (eo instanceof Machine) {
			kind = 0 // Machine kind
		} else if (eo instanceof Container) {
			kind = 1 // Container kind
		}

		return kind
	}

}
