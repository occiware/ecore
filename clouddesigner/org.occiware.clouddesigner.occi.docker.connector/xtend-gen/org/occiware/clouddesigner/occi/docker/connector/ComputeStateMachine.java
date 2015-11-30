/**
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe MERLE
 * 	- Fawaz PARAISO
 */
package org.occiware.clouddesigner.occi.docker.connector;

import com.google.common.base.Objects;
import org.occiware.clouddesigner.occi.infrastructure.Compute;
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class implements the state machine of any Compute resource.
 */
@SuppressWarnings("all")
public class ComputeStateMachine<T extends Compute> {
  private static Logger LOGGER = LoggerFactory.getLogger(ComputeStateMachine.class);
  
  /**
   * Reference to the Compute resource.
   */
  protected T compute;
  
  /**
   * Construct a compute state machine for a given Compute resource.
   */
  public ComputeStateMachine(final T c) {
    this.compute = c;
  }
  
  /**
   * Start OCCI Action.
   */
  public void start() {
    Class<? extends ComputeStateMachine> _class = this.getClass();
    String _name = _class.getName();
    String _plus = (_name + ":start() - current state is ");
    ComputeStatus _state = this.compute.getState();
    String _plus_1 = (_plus + _state);
    ComputeStateMachine.LOGGER.info(_plus_1);
    ComputeStatus _state_1 = this.compute.getState();
    boolean _equals = Objects.equal(_state_1, ComputeStatus.INACTIVE);
    if (_equals) {
      Class<? extends ComputeStateMachine> _class_1 = this.getClass();
      String _name_1 = _class_1.getName();
      String _plus_2 = (_name_1 + ":start() - move from inactive to active state");
      ComputeStateMachine.LOGGER.info(_plus_2);
      this.start_from_inactive_state();
      this.compute.setState(ComputeStatus.ACTIVE);
    } else {
      ComputeStatus _state_2 = this.compute.getState();
      boolean _equals_1 = Objects.equal(_state_2, ComputeStatus.ACTIVE);
      if (_equals_1) {
        Class<? extends ComputeStateMachine> _class_2 = this.getClass();
        String _name_2 = _class_2.getName();
        String _plus_3 = (_name_2 + ":start() - already active state");
        ComputeStateMachine.LOGGER.info(_plus_3);
        this.start_from_active_state();
      } else {
        ComputeStatus _state_3 = this.compute.getState();
        boolean _equals_2 = Objects.equal(_state_3, ComputeStatus.SUSPENDED);
        if (_equals_2) {
          Class<? extends ComputeStateMachine> _class_3 = this.getClass();
          String _name_3 = _class_3.getName();
          String _plus_4 = (_name_3 + ":start() - move from suspended to active state");
          ComputeStateMachine.LOGGER.info(_plus_4);
          this.start_from_suspended_state();
          this.compute.setState(ComputeStatus.ACTIVE);
        } else {
          throw new RuntimeException("Must never happen!");
        }
      }
    }
    Class<? extends ComputeStateMachine> _class_4 = this.getClass();
    String _name_4 = _class_4.getName();
    String _plus_5 = (_name_4 + ":start() - final state is ");
    ComputeStatus _state_4 = this.compute.getState();
    String _plus_6 = (_plus_5 + _state_4);
    ComputeStateMachine.LOGGER.info(_plus_6);
    ComputeStatus _state_5 = this.compute.getState();
    boolean _notEquals = (!Objects.equal(_state_5, ComputeStatus.ACTIVE));
    if (_notEquals) {
      throw new RuntimeException("Must never happen!");
    }
  }
  
  /**
   * StartAll Modeler Action.
   */
  public void startAll() {
    Class<? extends ComputeStateMachine> _class = this.getClass();
    String _name = _class.getName();
    String _plus = (_name + ":start() - current state is ");
    ComputeStatus _state = this.compute.getState();
    String _plus_1 = (_plus + _state);
    ComputeStateMachine.LOGGER.info(_plus_1);
    ComputeStatus _state_1 = this.compute.getState();
    boolean _equals = Objects.equal(_state_1, ComputeStatus.INACTIVE);
    if (_equals) {
      Class<? extends ComputeStateMachine> _class_1 = this.getClass();
      String _name_1 = _class_1.getName();
      String _plus_2 = (_name_1 + ":start() - move from inactive to active state");
      ComputeStateMachine.LOGGER.info(_plus_2);
      this.startAll_from_inactive_state();
      this.compute.setState(ComputeStatus.ACTIVE);
    } else {
      ComputeStatus _state_2 = this.compute.getState();
      boolean _equals_1 = Objects.equal(_state_2, ComputeStatus.ACTIVE);
      if (_equals_1) {
        Class<? extends ComputeStateMachine> _class_2 = this.getClass();
        String _name_2 = _class_2.getName();
        String _plus_3 = (_name_2 + ":start() - already active state");
        ComputeStateMachine.LOGGER.info(_plus_3);
        this.start_from_active_state();
      } else {
        ComputeStatus _state_3 = this.compute.getState();
        boolean _equals_2 = Objects.equal(_state_3, ComputeStatus.SUSPENDED);
        if (_equals_2) {
          Class<? extends ComputeStateMachine> _class_3 = this.getClass();
          String _name_3 = _class_3.getName();
          String _plus_4 = (_name_3 + ":start() - move from suspended to active state");
          ComputeStateMachine.LOGGER.info(_plus_4);
          this.start_from_suspended_state();
          this.compute.setState(ComputeStatus.ACTIVE);
        } else {
          throw new RuntimeException("Must never happen!");
        }
      }
    }
    Class<? extends ComputeStateMachine> _class_4 = this.getClass();
    String _name_4 = _class_4.getName();
    String _plus_5 = (_name_4 + ":start() - final state is ");
    ComputeStatus _state_4 = this.compute.getState();
    String _plus_6 = (_plus_5 + _state_4);
    ComputeStateMachine.LOGGER.info(_plus_6);
    ComputeStatus _state_5 = this.compute.getState();
    boolean _notEquals = (!Objects.equal(_state_5, ComputeStatus.ACTIVE));
    if (_notEquals) {
      throw new RuntimeException("Must never happen!");
    }
  }
  
  /**
   * This method implements the transition from inactive state for the start action.
   * 
   * By default, this method calls the start_execute method.
   */
  public void start_from_inactive_state() {
    this.start_execute();
  }
  
  public void startAll_from_inactive_state() {
    this.startAll_execute();
  }
  
  /**
   * This method implements the transition from active state for the start action.
   * 
   * By default, this method does nothing.
   */
  public void start_from_active_state() {
    Class<? extends ComputeStateMachine> _class = this.getClass();
    String _name = _class.getName();
    String _plus = (_name + ":start_from_active_state() - DO NOTHING");
    ComputeStateMachine.LOGGER.info(_plus);
    this.startAll_execute();
  }
  
  /**
   * This method implements the transition from suspended state for the start action.
   * 
   * By default, this method calls the start_execute method.
   */
  public void start_from_suspended_state() {
    this.start_execute();
  }
  
  /**
   * This method is the default implementation of the start action.
   */
  public void start_execute() {
    Class<? extends ComputeStateMachine> _class = this.getClass();
    String _name = _class.getName();
    String _plus = (_name + ":start_execute() - DO NOTHING");
    ComputeStateMachine.LOGGER.info(_plus);
  }
  
  public void startAll_execute() {
    Class<? extends ComputeStateMachine> _class = this.getClass();
    String _name = _class.getName();
    String _plus = (_name + ":startAll_execute() - DO NOTHING");
    ComputeStateMachine.LOGGER.info(_plus);
  }
  
  /**
   * Stop OCCI Action.
   */
  public void stop(final StopMethod method) {
    Class<? extends ComputeStateMachine> _class = this.getClass();
    String _name = _class.getName();
    String _plus = (_name + ":stop(");
    String _plus_1 = (_plus + method);
    String _plus_2 = (_plus_1 + ") - current state is ");
    ComputeStatus _state = this.compute.getState();
    String _plus_3 = (_plus_2 + _state);
    ComputeStateMachine.LOGGER.info(_plus_3);
    ComputeStatus _state_1 = this.compute.getState();
    boolean _equals = Objects.equal(_state_1, ComputeStatus.INACTIVE);
    if (_equals) {
      Class<? extends ComputeStateMachine> _class_1 = this.getClass();
      String _name_1 = _class_1.getName();
      String _plus_4 = (_name_1 + ":stop() - already inactive state");
      ComputeStateMachine.LOGGER.info(_plus_4);
      this.stop_from_inactive_state(method);
    } else {
      ComputeStatus _state_2 = this.compute.getState();
      boolean _equals_1 = Objects.equal(_state_2, ComputeStatus.ACTIVE);
      if (_equals_1) {
        Class<? extends ComputeStateMachine> _class_2 = this.getClass();
        String _name_2 = _class_2.getName();
        String _plus_5 = (_name_2 + ":stop() - move from active to inactive state");
        ComputeStateMachine.LOGGER.info(_plus_5);
        this.stop_from_active_state(method);
        this.compute.setState(ComputeStatus.INACTIVE);
      } else {
        ComputeStatus _state_3 = this.compute.getState();
        boolean _equals_2 = Objects.equal(_state_3, ComputeStatus.SUSPENDED);
        if (_equals_2) {
          Class<? extends ComputeStateMachine> _class_3 = this.getClass();
          String _name_3 = _class_3.getName();
          String _plus_6 = (_name_3 + ":stop() - move from suspended to inactive state");
          ComputeStateMachine.LOGGER.info(_plus_6);
          this.stop_from_suspended_state(method);
          this.compute.setState(ComputeStatus.INACTIVE);
        } else {
          throw new RuntimeException("Must never happen!");
        }
      }
    }
    Class<? extends ComputeStateMachine> _class_4 = this.getClass();
    String _name_4 = _class_4.getName();
    String _plus_7 = (_name_4 + ":stop() - final state is ");
    ComputeStatus _state_4 = this.compute.getState();
    String _plus_8 = (_plus_7 + _state_4);
    ComputeStateMachine.LOGGER.info(_plus_8);
    ComputeStatus _state_5 = this.compute.getState();
    boolean _notEquals = (!Objects.equal(_state_5, ComputeStatus.INACTIVE));
    if (_notEquals) {
      throw new RuntimeException("Must never happen!");
    }
  }
  
  /**
   * This method implements the transition from inactive state for the stop action.
   * 
   * By default, this method does nothing.
   */
  public void stop_from_inactive_state(final StopMethod method) {
    Class<? extends ComputeStateMachine> _class = this.getClass();
    String _name = _class.getName();
    String _plus = (_name + ":stop_from_inactive_state() - DO NOTHING");
    ComputeStateMachine.LOGGER.info(_plus);
  }
  
  /**
   * This method implements the transition from active state for the stop action.
   * 
   * By default, this method calls the stop_execute method.
   */
  public void stop_from_active_state(final StopMethod method) {
    this.stop_execute(method);
  }
  
  /**
   * This method implements the transition from suspended state for the stop action.
   * 
   * By default, this method calls the stop_execute method.
   */
  public void stop_from_suspended_state(final StopMethod method) {
    this.stop_execute(method);
  }
  
  /**
   * This method is the default implementation of the stop action.
   */
  public void stop_execute(final StopMethod method) {
    Class<? extends ComputeStateMachine> _class = this.getClass();
    String _name = _class.getName();
    String _plus = (_name + ":stop_execute(");
    String _plus_1 = (_plus + method);
    String _plus_2 = (_plus_1 + ") - DO NOTHING");
    ComputeStateMachine.LOGGER.info(_plus_2);
  }
  
  /**
   * Restart OCCI Action.
   */
  public void restart(final RestartMethod method) {
    Class<? extends ComputeStateMachine> _class = this.getClass();
    String _name = _class.getName();
    String _plus = (_name + ":restart(");
    String _plus_1 = (_plus + method);
    String _plus_2 = (_plus_1 + ") - current state is ");
    ComputeStatus _state = this.compute.getState();
    String _plus_3 = (_plus_2 + _state);
    ComputeStateMachine.LOGGER.info(_plus_3);
    ComputeStatus _state_1 = this.compute.getState();
    boolean _equals = Objects.equal(_state_1, ComputeStatus.INACTIVE);
    if (_equals) {
      Class<? extends ComputeStateMachine> _class_1 = this.getClass();
      String _name_1 = _class_1.getName();
      String _plus_4 = (_name_1 + ":restart(");
      String _plus_5 = (_plus_4 + method);
      String _plus_6 = (_plus_5 + ")");
      String _plus_7 = (_plus_6 + " - move from inactive to active state");
      ComputeStateMachine.LOGGER.info(_plus_7);
      this.restart_from_inactive_state(method);
      this.compute.setState(ComputeStatus.ACTIVE);
    } else {
      ComputeStatus _state_2 = this.compute.getState();
      boolean _equals_1 = Objects.equal(_state_2, ComputeStatus.ACTIVE);
      if (_equals_1) {
        Class<? extends ComputeStateMachine> _class_2 = this.getClass();
        String _name_2 = _class_2.getName();
        String _plus_8 = (_name_2 + ":restart(");
        String _plus_9 = (_plus_8 + method);
        String _plus_10 = (_plus_9 + ")");
        String _plus_11 = (_plus_10 + " - move from active to active state");
        ComputeStateMachine.LOGGER.info(_plus_11);
        this.restart_from_active_state(method);
        this.compute.setState(ComputeStatus.ACTIVE);
      } else {
        ComputeStatus _state_3 = this.compute.getState();
        boolean _equals_2 = Objects.equal(_state_3, ComputeStatus.SUSPENDED);
        if (_equals_2) {
          Class<? extends ComputeStateMachine> _class_3 = this.getClass();
          String _name_3 = _class_3.getName();
          String _plus_12 = (_name_3 + ":stop() - move from suspended to active state");
          ComputeStateMachine.LOGGER.info(_plus_12);
          this.restart_from_suspended_state(method);
          this.compute.setState(ComputeStatus.ACTIVE);
        } else {
          throw new RuntimeException("Must never happen!");
        }
      }
    }
    Class<? extends ComputeStateMachine> _class_4 = this.getClass();
    String _name_4 = _class_4.getName();
    String _plus_13 = (_name_4 + ":restart(");
    String _plus_14 = (_plus_13 + method);
    String _plus_15 = (_plus_14 + ")");
    String _plus_16 = (_plus_15 + " - final state is ");
    ComputeStatus _state_4 = this.compute.getState();
    String _plus_17 = (_plus_16 + _state_4);
    ComputeStateMachine.LOGGER.info(_plus_17);
    ComputeStatus _state_5 = this.compute.getState();
    boolean _notEquals = (!Objects.equal(_state_5, ComputeStatus.ACTIVE));
    if (_notEquals) {
      throw new RuntimeException("Must never happen!");
    }
  }
  
  /**
   * This method implements the transition from inactive state for the restart action.
   * 
   * By default, this method calls the restart_execute method.
   */
  public void restart_from_inactive_state(final RestartMethod method) {
    this.restart_execute(method);
  }
  
  /**
   * This method implements the transition from active state for the restart action.
   * 
   * By default, this method calls the restart_execute method.
   */
  public void restart_from_active_state(final RestartMethod method) {
    this.restart_execute(method);
  }
  
  /**
   * This method implements the transition from suspended state for the restart action.
   * 
   * By default, this method calls the restart_execute method.
   */
  public void restart_from_suspended_state(final RestartMethod method) {
    this.restart_execute(method);
  }
  
  /**
   * This method is the default implementation of the restart action.
   */
  public void restart_execute(final RestartMethod method) {
    Class<? extends ComputeStateMachine> _class = this.getClass();
    String _name = _class.getName();
    String _plus = (_name + ":restart_execute(");
    String _plus_1 = (_plus + method);
    String _plus_2 = (_plus_1 + ") - DO NOTHING");
    ComputeStateMachine.LOGGER.info(_plus_2);
  }
  
  /**
   * Suspend OCCI Action.
   */
  public void suspend(final SuspendMethod method) {
    Class<? extends ComputeStateMachine> _class = this.getClass();
    String _name = _class.getName();
    String _plus = (_name + ":suspend(");
    String _plus_1 = (_plus + method);
    String _plus_2 = (_plus_1 + ") - current state is ");
    ComputeStatus _state = this.compute.getState();
    String _plus_3 = (_plus_2 + _state);
    ComputeStateMachine.LOGGER.info(_plus_3);
    ComputeStatus _state_1 = this.compute.getState();
    boolean _equals = Objects.equal(_state_1, ComputeStatus.INACTIVE);
    if (_equals) {
      Class<? extends ComputeStateMachine> _class_1 = this.getClass();
      String _name_1 = _class_1.getName();
      String _plus_4 = (_name_1 + ":suspend() - move from inactive to suspended state");
      ComputeStateMachine.LOGGER.info(_plus_4);
      this.suspend_from_inactive_state(method);
      this.compute.setState(ComputeStatus.SUSPENDED);
    } else {
      ComputeStatus _state_2 = this.compute.getState();
      boolean _equals_1 = Objects.equal(_state_2, ComputeStatus.ACTIVE);
      if (_equals_1) {
        Class<? extends ComputeStateMachine> _class_2 = this.getClass();
        String _name_2 = _class_2.getName();
        String _plus_5 = (_name_2 + ":suspend() - move from active to suspended state");
        ComputeStateMachine.LOGGER.info(_plus_5);
        this.suspend_from_active_state(method);
        this.compute.setState(ComputeStatus.SUSPENDED);
      } else {
        ComputeStatus _state_3 = this.compute.getState();
        boolean _equals_2 = Objects.equal(_state_3, ComputeStatus.SUSPENDED);
        if (_equals_2) {
          Class<? extends ComputeStateMachine> _class_3 = this.getClass();
          String _name_3 = _class_3.getName();
          String _plus_6 = (_name_3 + ":suspend() - already suspended state");
          ComputeStateMachine.LOGGER.info(_plus_6);
          this.suspend_from_suspended_state(method);
        } else {
          throw new RuntimeException("Must never happen!");
        }
      }
    }
    Class<? extends ComputeStateMachine> _class_4 = this.getClass();
    String _name_4 = _class_4.getName();
    String _plus_7 = (_name_4 + ":suspend() - final state is ");
    ComputeStatus _state_4 = this.compute.getState();
    String _plus_8 = (_plus_7 + _state_4);
    ComputeStateMachine.LOGGER.info(_plus_8);
    ComputeStatus _state_5 = this.compute.getState();
    boolean _notEquals = (!Objects.equal(_state_5, ComputeStatus.SUSPENDED));
    if (_notEquals) {
      throw new RuntimeException("Must never happen!");
    }
  }
  
  /**
   * This method implements the transition from inactive state for the suspend action.
   * 
   * By default, this method calls the suspend_execute method.
   */
  public void suspend_from_inactive_state(final SuspendMethod method) {
    this.suspend_execute(method);
  }
  
  /**
   * This method implements the transition from active state for the suspend action.
   * 
   * By default, this method calls the suspend_execute method.
   */
  public void suspend_from_active_state(final SuspendMethod method) {
    this.suspend_execute(method);
  }
  
  /**
   * This method implements the transition from suspended state for the suspend action.
   * 
   * By default, this method does nothing.
   */
  public void suspend_from_suspended_state(final SuspendMethod method) {
    Class<? extends ComputeStateMachine> _class = this.getClass();
    String _name = _class.getName();
    String _plus = (_name + ":suspend_from_suspended_state() - DO NOTHING");
    ComputeStateMachine.LOGGER.info(_plus);
  }
  
  /**
   * This method is the default implementation of the suspend action.
   */
  public void suspend_execute(final SuspendMethod method) {
    Class<? extends ComputeStateMachine> _class = this.getClass();
    String _name = _class.getName();
    String _plus = (_name + ":suspend_execute(");
    String _plus_1 = (_plus + method);
    String _plus_2 = (_plus_1 + ") - DO NOTHING");
    ComputeStateMachine.LOGGER.info(_plus_2);
  }
}
