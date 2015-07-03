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
package org.occiware.clouddesigner.occi.hypervisor.connector.libvirt;

import com.google.common.base.Objects;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.occiware.clouddesigner.occi.hypervisor.Machine;
import org.occiware.clouddesigner.occi.hypervisor.connector.libvirt.ComputeStateMachine;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class implements an abstract Libvirt node manager.
 */
@SuppressWarnings("all")
public abstract class LibvirtManager extends ComputeStateMachine<Machine> {
  private static Logger LOGGER = LoggerFactory.getLogger(LibvirtManager.class);
  
  /**
   * Construct a  machine manager for a given  machine.
   */
  public LibvirtManager(final Machine m) {
    super(m);
  }
  
  /**
   * Return the  machine driver name.
   */
  public abstract String getDriver();
  
  /**
   * Append specific libvirt hypervisor driver parameters.
   */
  public abstract void appendHypervisorParameters(final String sb);
  
  /**
   * Start Libvirt node.
   */
  public void start_execute() {
    throw new Error("Unresolved compilation problems:"
      + "\nDomainMarshaller cannot be resolved."
      + "\nloadUri cannot be resolved"
      + "\nuri cannot be resolved"
      + "\nget cannot be resolved"
      + "\ncreateComputeDescription cannot be resolved"
      + "\nasString cannot be resolved"
      + "\ngetUuid cannot be resolved");
  }
  
  /**
   * Stop a libvirt node.
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
   * Restart a libvirt node.
   */
  public void restart_execute(final RestartMethod method) {
    String _hostname = this.compute.getHostname();
    String _plus = ("EXECUTE COMMAND:  machine restart " + _hostname);
    InputOutput.<String>println(_plus);
  }
  
  /**
   * Suspend a libvirt node.
   */
  public void suspend_execute(final SuspendMethod method) {
    String _hostname = this.compute.getHostname();
    String _plus = ("EXECUTE COMMAND:  machine suspend " + _hostname);
    InputOutput.<String>println(_plus);
  }
}
