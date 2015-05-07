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

import java.util.Map;
import org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVMwarevSphereAspectMachine_VMware_vSphereAspectProperties;

@SuppressWarnings("all")
public class MachineVMwarevSphereAspectMachine_VMware_vSphereAspectContext {
  public final static MachineVMwarevSphereAspectMachine_VMware_vSphereAspectContext INSTANCE = new MachineVMwarevSphereAspectMachine_VMware_vSphereAspectContext();
  
  public static MachineVMwarevSphereAspectMachine_VMware_vSphereAspectProperties getSelf(final Machine_VMware_vSphere _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVMwarevSphereAspectMachine_VMware_vSphereAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Machine_VMware_vSphere, MachineVMwarevSphereAspectMachine_VMware_vSphereAspectProperties> map = new java.util.WeakHashMap<org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere, org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVMwarevSphereAspectMachine_VMware_vSphereAspectProperties>();
  
  public Map<Machine_VMware_vSphere, MachineVMwarevSphereAspectMachine_VMware_vSphereAspectProperties> getMap() {
    return map;
  }
}
