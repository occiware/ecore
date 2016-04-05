package org.occiware.clouddesigner.occi.cloud.design.services;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.cloud.CloudFactory;
import org.occiware.clouddesigner.occi.cloud.Machine;
import org.occiware.clouddesigner.occi.cloud.connector.ExecutableCloudFactory;
import org.occiware.clouddesigner.occi.cloud.connector.ExecutableCloudModel;

@SuppressWarnings("all")
public class CloudServices {
  private final CloudFactory init = ExecutableCloudFactory.init();
  
  /**
   * Popup menu Start action.
   */
  public void start(final EObject eo) {
    try {
      IRunnableWithProgress runnable = new IRunnableWithProgress() {
        @Override
        public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
          if ((eo instanceof Machine)) {
            Machine machine = ((Machine) eo);
            final ExecutableCloudModel main = new ExecutableCloudModel(machine);
            main.start();
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
  
  /**
   * Popup menu importModel cation.
   */
  public void importModel(final Configuration conf) {
    try {
      IRunnableWithProgress runnable = new IRunnableWithProgress() {
        @Override
        public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
          final ExecutableCloudModel main = new ExecutableCloudModel(conf);
          main.importModel();
        }
      };
      Shell _shell = this.getShell();
      ProgressMonitorDialog dialog = new ProgressMonitorDialog(_shell);
      dialog.run(false, true, runnable);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Popup menu stop action.
   */
  public void stop(final EObject eo) {
    try {
      IRunnableWithProgress runnable = new IRunnableWithProgress() {
        @Override
        public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
          if ((eo instanceof Machine)) {
            Machine machine = ((Machine) eo);
            final ExecutableCloudModel main = new ExecutableCloudModel(machine);
            main.stop();
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
  
  /**
   * Popup menu restart action.
   */
  public void restart(final EObject eo) {
    try {
      IRunnableWithProgress runnable = new IRunnableWithProgress() {
        @Override
        public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
          if ((eo instanceof Machine)) {
            Machine machine = ((Machine) eo);
            final ExecutableCloudModel main = new ExecutableCloudModel(machine);
            main.restart();
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
