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
              Machine machine = ((Machine) eo);
              final ExecutableDockerModel main = new ExecutableDockerModel(machine);
              main.start();
            }
          };
          Shell _shell_1 = this.getShell();
          ProgressMonitorDialog dialog = new ProgressMonitorDialog(_shell_1);
          dialog.run(false, true, runnable);
        }
      } else {
        if ((kind == 1)) {
          Container container = ((Container) eo);
          boolean _or_1 = false;
          String _name_2 = container.getName();
          boolean _equals_2 = Objects.equal(_name_2, null);
          if (_equals_2) {
            _or_1 = true;
          } else {
            String _name_3 = container.getName();
            String _trim_1 = _name_3.trim();
            boolean _equals_3 = Objects.equal(_trim_1, "");
            _or_1 = _equals_3;
          }
          if (_or_1) {
            Shell _shell_2 = this.getShell();
            MessageDialog.openInformation(_shell_2, "Warning", "Container name is required!");
          } else {
            IRunnableWithProgress runnable_1 = new IRunnableWithProgress() {
              @Override
              public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                Container container = ((Container) eo);
                final ExecutableDockerModel main = new ExecutableDockerModel(container);
                main.container.start();
              }
            };
            Shell _shell_3 = this.getShell();
            ProgressMonitorDialog dialog_1 = new ProgressMonitorDialog(_shell_3);
            dialog_1.run(false, true, runnable_1);
          }
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
              Machine machine = ((Machine) eo);
              final ExecutableDockerModel main = new ExecutableDockerModel(machine);
              main.startAll();
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
              Machine machine = ((Machine) eo);
              final ExecutableDockerModel main = new ExecutableDockerModel(machine);
              main.stop();
            }
          };
          Shell _shell_1 = this.getShell();
          ProgressMonitorDialog dialog = new ProgressMonitorDialog(_shell_1);
          dialog.run(false, true, runnable);
        }
      } else {
        if ((kind == 1)) {
          Container container = ((Container) eo);
          boolean _or_1 = false;
          String _name_2 = container.getName();
          boolean _equals_2 = Objects.equal(_name_2, null);
          if (_equals_2) {
            _or_1 = true;
          } else {
            String _name_3 = container.getName();
            String _trim_1 = _name_3.trim();
            boolean _equals_3 = Objects.equal(_trim_1, "");
            _or_1 = _equals_3;
          }
          if (_or_1) {
            Shell _shell_2 = this.getShell();
            MessageDialog.openInformation(_shell_2, "Warning", "Container name is required!");
          } else {
            IRunnableWithProgress runnable_1 = new IRunnableWithProgress() {
              @Override
              public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                Container container = ((Container) eo);
                final ExecutableDockerModel main = new ExecutableDockerModel(container);
                main.container.stop(StopMethod.GRACEFUL);
              }
            };
            Shell _shell_3 = this.getShell();
            ProgressMonitorDialog dialog_1 = new ProgressMonitorDialog(_shell_3);
            dialog_1.run(false, true, runnable_1);
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Popup menu restart action.
   */
  public void restart(final EObject eo) {
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
              Machine machine = ((Machine) eo);
              final ExecutableDockerModel main = new ExecutableDockerModel(machine);
              main.restart();
            }
          };
          Shell _shell_1 = this.getShell();
          ProgressMonitorDialog dialog = new ProgressMonitorDialog(_shell_1);
          dialog.run(false, true, runnable);
        }
      } else {
        if ((kind == 1)) {
          Container container = ((Container) eo);
          boolean _or_1 = false;
          String _name_2 = container.getName();
          boolean _equals_2 = Objects.equal(_name_2, null);
          if (_equals_2) {
            _or_1 = true;
          } else {
            String _name_3 = container.getName();
            String _trim_1 = _name_3.trim();
            boolean _equals_3 = Objects.equal(_trim_1, "");
            _or_1 = _equals_3;
          }
          if (_or_1) {
            Shell _shell_2 = this.getShell();
            MessageDialog.openInformation(_shell_2, "Warning", "Container name is required!");
          } else {
            IRunnableWithProgress runnable_1 = new IRunnableWithProgress() {
              @Override
              public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                Container container = ((Container) eo);
                final ExecutableDockerModel main = new ExecutableDockerModel(container);
                main.container.restart(RestartMethod.GRACEFUL);
              }
            };
            Shell _shell_3 = this.getShell();
            ProgressMonitorDialog dialog_1 = new ProgressMonitorDialog(_shell_3);
            dialog_1.run(false, true, runnable_1);
          }
        }
      }
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
