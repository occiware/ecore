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

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties {
  public static Logger LOGGER = LoggerFactory.getLogger(MachineVirtualBoxAspect.class);
  
  public boolean isDeployed = false;
  
  public Multimap<String, String> containerDependency = ArrayListMultimap.<String, String>create();
}
