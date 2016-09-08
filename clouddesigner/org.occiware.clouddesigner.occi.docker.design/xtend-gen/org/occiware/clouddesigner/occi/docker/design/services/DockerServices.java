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

import com.google.common.base.Objects;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.DockerFactory;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableDockerFactory;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableDockerModel;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;

@SuppressWarnings("all")
public class DockerServices {
  private final DockerFactory init = ExecutableDockerFactory.init();
  
  /**
   * Popup menu Start action.
   */
  public void start(final EObject eo) {
    try {
      final int kind = this.eobjectKind(eo);
      if ((kind == 0)) {
        Machine machine = ((Machine) eo);
        boolean _or = false;
        String _name = machine.getName();
        boolean _equals = Objects.equal(_name, null);
        if (_equals) {
          _or = true;
        } else {
          String _name_1 = machine.getName();
          String _trim = _name_1.trim();
          boolean _equals_1 = Objects.equal(_trim, "");
          _or = _equals_1;
        }
        if (_or) {
          Shell _shell = this.getShell();
          MessageDialog.openInformation(_shell, "Warning", "Machine name is required!");
        } else {
          IRunnableWithProgress runnable = new IRunnableWithProgress() {
            @Override
            public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
              if ((kind == 0)) {
                Machine machine = ((Machine) eo);
                final ExecutableDockerModel main = new ExecutableDockerModel(machine);
                main.start();
              } else {
                if ((kind == 1)) {
                  Container container = ((Container) eo);
                  final ExecutableDockerModel main_1 = new ExecutableDockerModel(container);
                  main_1.container.start();
                }
              }
            }
          };
          Shell _shell_1 = this.getShell();
          ProgressMonitorDialog dialog = new ProgressMonitorDialog(_shell_1);
          dialog.run(false, true, runnable);
        }
      }
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
        @Override
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
      final int kind = this.eobjectKind(eo);
      if ((kind == 0)) {
        Machine machine = ((Machine) eo);
        boolean _or = false;
        String _name = machine.getName();
        boolean _equals = Objects.equal(_name, null);
        if (_equals) {
          _or = true;
        } else {
          String _name_1 = machine.getName();
          String _trim = _name_1.trim();
          boolean _equals_1 = Objects.equal(_trim, "");
          _or = _equals_1;
        }
        if (_or) {
          Shell _shell = this.getShell();
          MessageDialog.openInformation(_shell, "Warning", "Machine name is required!");
        } else {
          IRunnableWithProgress runnable = new IRunnableWithProgress() {
            @Override
            public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
              if ((eo instanceof Machine)) {
                Machine machine = ((Machine) eo);
                final ExecutableDockerModel main = new ExecutableDockerModel(machine);
                main.startAll();
              }
            }
          };
          Shell _shell_1 = this.getShell();
          ProgressMonitorDialog dialog = new ProgressMonitorDialog(_shell_1);
          dialog.run(false, true, runnable);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Popup menu stop action.
   */
  public void stop(final EObject eo) {
    try {
      long startTime = System.currentTimeMillis();
      IRunnableWithProgress runnable = new IRunnableWithProgress() {
        @Override
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
      long stopTime = System.currentTimeMillis();
      long diff = (stopTime - startTime);
      InputOutput.<String>println(("Stopped time = " + Long.valueOf(diff)));
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
            final ExecutableDockerModel main = new ExecutableDockerModel(machine);
            main.restart();
          } else {
            if ((eo instanceof Container)) {
              Container container = ((Container) eo);
              final ExecutableDockerModel main_1 = new ExecutableDockerModel(container);
              main_1.container.restart(RestartMethod.GRACEFUL);
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
  
  /**
   * Classify the EObject according to its kind (Machine/Container)
   */
  public int eobjectKind(final EObject eo) {
    int kind = 2;
    if ((eo instanceof Machine)) {
      kind = 0;
    } else {
      if ((eo instanceof Container)) {
        kind = 1;
      }
    }
    return kind;
  }
}
