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
import org.occiware.clouddesigner.occi.docker.Machine_Digital_Ocean;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineDigitalOceanAspectMachine_Digital_OceanAspectProperties;

@SuppressWarnings("all")
public class MachineDigitalOceanAspectMachine_Digital_OceanAspectContext {
  public final static MachineDigitalOceanAspectMachine_Digital_OceanAspectContext INSTANCE = new MachineDigitalOceanAspectMachine_Digital_OceanAspectContext();
  
  public static MachineDigitalOceanAspectMachine_Digital_OceanAspectProperties getSelf(final Machine_Digital_Ocean _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineDigitalOceanAspectMachine_Digital_OceanAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Machine_Digital_Ocean, MachineDigitalOceanAspectMachine_Digital_OceanAspectProperties> map = new java.util.WeakHashMap<org.occiware.clouddesigner.occi.docker.Machine_Digital_Ocean, org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineDigitalOceanAspectMachine_Digital_OceanAspectProperties>();
  
  public Map<Machine_Digital_Ocean, MachineDigitalOceanAspectMachine_Digital_OceanAspectProperties> getMap() {
    return map;
  }
}
