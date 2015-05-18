/**
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	- Fawaz PARAISO
 */
package org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect;

import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspect;

/* @Aspect() */@SuppressWarnings("all")
public class MachineVMwarevCloudAirAspect extends MachineAspect {
  protected boolean isDeployed = false;
  
  /* @OverrideAspectMethod
   */public String createMachineCommand() {
    return null;
  }
  
  public void machineStartAll() {
  }
  
  public void machineStart() {
  }
}
