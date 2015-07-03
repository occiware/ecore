package org.occiware.clouddesigner.occi.infrastructure.design.services

import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.operation.IRunnableWithProgress
import java.lang.reflect.InvocationTargetException
import org.eclipse.core.runtime.IProgressMonitor
import hypervisor.Machine
import org.eclipse.jface.dialogs.ProgressMonitorDialog
import org.eclipse.swt.widgets.Shell
import org.eclipse.swt.widgets.Display
import org.occiware.clouddesigner.occi.infrastructure.connector.libvirt.ExecutableInfrastructureFactory

class InfrastructureServices {
	// Initialize the executable Docker factory.
	val init = ExecutableInfrastructureFactory.init()
	
	def void start(EObject eo) {
		var runnable = new IRunnableWithProgress() {
			override run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
				if (eo instanceof Machine) {
					var machine = eo as Machine
					println("Start button is activated ...")
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
