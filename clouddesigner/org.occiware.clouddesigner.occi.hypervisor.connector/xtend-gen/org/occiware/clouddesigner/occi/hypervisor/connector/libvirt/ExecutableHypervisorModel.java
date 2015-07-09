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
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.hypervisor.Machine;
import org.occiware.clouddesigner.occi.hypervisor.Machine_VirtualBox;
import org.occiware.clouddesigner.occi.hypervisor.connector.libvirt.ExecutableMachine_VirtualBox;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class ExecutableHypervisorModel {
  private static Logger LOGGER = LoggerFactory.getLogger(ExecutableHypervisorModel.class);
  
  public Machine machine;
  
  public Configuration configuration;
  
  public Machine_VirtualBox machine_VirtualBox;
  
  public ExecutableHypervisorModel() {
  }
  
  public ExecutableHypervisorModel(final Machine machine) {
    this.machine = machine;
    if ((machine instanceof Machine_VirtualBox)) {
      this.machine_VirtualBox = ((Machine_VirtualBox)machine);
    }
  }
  
  public ExecutableHypervisorModel(final Configuration configuration) {
    this.configuration = configuration;
  }
  
  public void start() {
    boolean _notEquals = (!Objects.equal(this.machine_VirtualBox, null));
    if (_notEquals) {
      this.machine_VirtualBox.start();
      return;
    }
  }
  
  public void stop() {
    boolean _notEquals = (!Objects.equal(this.machine_VirtualBox, null));
    if (_notEquals) {
      ((ExecutableMachine_VirtualBox) this.machine_VirtualBox).stop(StopMethod.GRACEFUL);
      return;
    }
  }
}
