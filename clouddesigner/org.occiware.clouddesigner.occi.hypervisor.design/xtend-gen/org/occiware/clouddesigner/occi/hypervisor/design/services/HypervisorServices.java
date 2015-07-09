package org.occiware.clouddesigner.occi.hypervisor.design.services;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.occiware.clouddesigner.occi.AbstractOCCIKindResolver;
import org.occiware.clouddesigner.occi.hypervisor.HypervisorFactory;
import org.occiware.clouddesigner.occi.hypervisor.Machine;
import org.occiware.clouddesigner.occi.hypervisor.connector.libvirt.ExecutableHypervisorFactory;

@SuppressWarnings("all")
public class HypervisorServices extends AbstractOCCIKindResolver {
  private final HypervisorFactory init = ExecutableHypervisorFactory.init();
  
  public void start(final EObject eo) {
    try {
      IRunnableWithProgress runnable = new IRunnableWithProgress() {
        @Override
        public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
          if ((eo instanceof Machine)) {
            Machine machine = ((Machine) eo);
            InputOutput.<String>println("Start button is activated ...");
          }
        }
      };
      Shell _shell = this.getShell();
      ProgressMonitorDialog dialog = new ProgressMonitorDialog(_shell);
      dialog.run(false, true, runnable);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Shell getShell() {
    Display _current = Display.getCurrent();
    return _current.getActiveShell();
  }
}
