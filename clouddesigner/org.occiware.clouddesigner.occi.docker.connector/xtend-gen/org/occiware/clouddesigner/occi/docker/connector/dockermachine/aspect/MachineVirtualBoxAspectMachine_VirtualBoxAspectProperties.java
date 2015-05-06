package org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

@SuppressWarnings("all")
public class MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties {
  public boolean isDeployed = false;
  
  public Multimap<String, String> containerDependency = ArrayListMultimap.<String, String>create();
}
