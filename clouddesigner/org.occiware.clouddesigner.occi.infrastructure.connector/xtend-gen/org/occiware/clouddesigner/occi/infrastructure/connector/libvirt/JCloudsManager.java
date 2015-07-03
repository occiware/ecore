/**
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	- Fawaz PARAISO
 * 	- Philippe MERELE
 */
package org.occiware.clouddesigner.occi.infrastructure.connector.libvirt;

import com.google.common.base.Objects;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.occiware.clouddesigner.occi.infrastructure.Compute;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;
import org.occiware.clouddesigner.occi.infrastructure.connector.libvirt.ComputeStateMachine;

/**
 * This class implements an abstract JClouds node manager.
 */
@SuppressWarnings("all")
public abstract class JCloudsManager extends ComputeStateMachine<Compute> {
  /**
   * Construct a  machine manager for a given  machine.
   */
  public JCloudsManager(final Compute m) {
    super(m);
  }
  
  /**
   * Return the JClouds machine driver name.
   */
  public abstract String getDriverName();
  
  /**
   * Append specific JClouds machine driver parameters.
   */
  public abstract void appendDriverParameters(final StringBuilder sb);
  
  /**
   * Start JClouds node.
   */
  public void start_execute() {
  }
  
  /**
   * Stop a JClouds node.
   */
  public void stop_execute(final StopMethod method) {
    boolean _equals = Objects.equal(method, StopMethod.GRACEFUL);
    if (_equals) {
    }
    String _hostname = this.compute.getHostname();
    String _plus = ("EXECUTE COMMAND:  machine stop " + _hostname);
    InputOutput.<String>println(_plus);
  }
  
  /**
   * Restart a JClouds node.
   */
  public void restart_execute(final RestartMethod method) {
    String _hostname = this.compute.getHostname();
    String _plus = ("EXECUTE COMMAND:  machine restart " + _hostname);
    InputOutput.<String>println(_plus);
  }
  
  /**
   * Suspend a JClouds node.
   */
  public void suspend_execute(final SuspendMethod method) {
    String _hostname = this.compute.getHostname();
    String _plus = ("EXECUTE COMMAND:  machine suspend " + _hostname);
    InputOutput.<String>println(_plus);
  }
}
