/**
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Fawaz PARAISO
 * - William PIERS
 */
package org.occiware.clouddesigner.occi.docker.design.services;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.occiware.clouddesigner.OCCI.Configuration;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.DockerFactory;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableDockerFactory;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableDockerModel;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;

@SuppressWarnings("all")
public class DockerServices {
  private final DockerFactory init = ExecutableDockerFactory.init();
  
  /**
   * Popup menu Start action.
   */
  public void start(final EObject eo) {
    try {
      IRunnableWithProgress runnable = new IRunnableWithProgress() {
        public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
          if ((eo instanceof Machine)) {
            Machine machine = ((Machine) eo);
            final ExecutableDockerModel main = new ExecutableDockerModel(machine);
            main.start();
          } else {
            if ((eo instanceof Container)) {
              Container container = ((Container) eo);
              final ExecutableDockerModel main_1 = new ExecutableDockerModel(container);
              main_1.container.start();
            }
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
        public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
          final ExecutableDockerModel main = new ExecutableDockerModel(conf);
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
   * Popum menu synchronize action.
   */
  public void synchronize(final EObject eo) {
    try {
      IRunnableWithProgress runnable = new IRunnableWithProgress() {
        public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
          if ((eo instanceof Machine)) {
            Machine machine = ((Machine) eo);
            final ExecutableDockerModel main = new ExecutableDockerModel(machine);
            main.synchronize();
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
   * Popup menu StartAll action
   */
  public void startAll(final EObject eo) {
    try {
      IRunnableWithProgress runnable = new IRunnableWithProgress() {
        public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
          if ((eo instanceof Machine)) {
            Machine machine = ((Machine) eo);
            final ExecutableDockerModel main = new ExecutableDockerModel(machine);
            main.startAll();
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
   * Popup menu stop action.
   */
  public void stop(final EObject eo) {
    try {
      IRunnableWithProgress runnable = new IRunnableWithProgress() {
        public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
          if ((eo instanceof Machine)) {
            Machine machine = ((Machine) eo);
            final ExecutableDockerModel main = new ExecutableDockerModel(machine);
            main.stop();
          } else {
            if ((eo instanceof Container)) {
              Container container = ((Container) eo);
              final ExecutableDockerModel main_1 = new ExecutableDockerModel(container);
              main_1.container.stop(StopMethod.GRACEFUL);
            }
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
