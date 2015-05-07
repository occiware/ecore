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
import org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAmazonEC2AspectMachine_Amazon_EC2AspectProperties;

@SuppressWarnings("all")
public class MachineAmazonEC2AspectMachine_Amazon_EC2AspectContext {
  public final static MachineAmazonEC2AspectMachine_Amazon_EC2AspectContext INSTANCE = new MachineAmazonEC2AspectMachine_Amazon_EC2AspectContext();
  
  public static MachineAmazonEC2AspectMachine_Amazon_EC2AspectProperties getSelf(final Machine_Amazon_EC2 _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAmazonEC2AspectMachine_Amazon_EC2AspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Machine_Amazon_EC2, MachineAmazonEC2AspectMachine_Amazon_EC2AspectProperties> map = new java.util.WeakHashMap<org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2, org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAmazonEC2AspectMachine_Amazon_EC2AspectProperties>();
  
  public Map<Machine_Amazon_EC2, MachineAmazonEC2AspectMachine_Amazon_EC2AspectProperties> getMap() {
    return map;
  }
}
