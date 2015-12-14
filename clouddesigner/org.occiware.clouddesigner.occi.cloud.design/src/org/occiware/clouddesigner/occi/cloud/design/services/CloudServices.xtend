package org.occiware.clouddesigner.occi.cloud.design.services

import java.lang.reflect.InvocationTargetException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.dialogs.ProgressMonitorDialog
import org.eclipse.jface.operation.IRunnableWithProgress
import org.eclipse.swt.widgets.Display
import org.eclipse.swt.widgets.Shell
import org.occiware.clouddesigner.occi.Configuration
import org.occiware.clouddesigner.occi.cloud.Machine
import org.occiware.clouddesigner.occi.cloud.connector.ExecutableCloudFactory
import org.occiware.clouddesigner.occi.cloud.connector.ExecutableCloudModel

class CloudServices {
	// Initialize the executable Docker factory.
	val init = ExecutableCloudFactory.init()

	/**
	 * Popup menu Start action.
	 */
	def void start(EObject eo) {
		var runnable = new IRunnableWithProgress() {
			override run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
				if (eo instanceof Machine) {
					var machine = eo as Machine
					val main = new ExecutableCloudModel(machine)
					main.start

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
				val main = new ExecutableCloudModel(conf)
				main.importModel
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
					val main = new ExecutableCloudModel(machine)
					main.stop
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
					val main = new ExecutableCloudModel(machine)
					main.restart

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