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
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspectMachineAspectProperties;

@SuppressWarnings("all")
public class MachineAspectMachineAspectContext {
  public final static MachineAspectMachineAspectContext INSTANCE = new MachineAspectMachineAspectContext();
  
  public static MachineAspectMachineAspectProperties getSelf(final Machine _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspectMachineAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Machine, MachineAspectMachineAspectProperties> map = new java.util.WeakHashMap<org.occiware.clouddesigner.occi.docker.Machine, org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspectMachineAspectProperties>();
  
  public Map<Machine, MachineAspectMachineAspectProperties> getMap() {
    return map;
  }
}
