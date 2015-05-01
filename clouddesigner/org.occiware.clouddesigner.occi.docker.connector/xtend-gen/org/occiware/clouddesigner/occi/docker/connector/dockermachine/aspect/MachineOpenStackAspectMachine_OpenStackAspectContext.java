package org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect;

import java.util.Map;
import org.occiware.clouddesigner.occi.docker.Machine_OpenStack;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineOpenStackAspectMachine_OpenStackAspectProperties;

@SuppressWarnings("all")
public class MachineOpenStackAspectMachine_OpenStackAspectContext {
  public final static MachineOpenStackAspectMachine_OpenStackAspectContext INSTANCE = new MachineOpenStackAspectMachine_OpenStackAspectContext();
  
  public static MachineOpenStackAspectMachine_OpenStackAspectProperties getSelf(final Machine_OpenStack _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineOpenStackAspectMachine_OpenStackAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Machine_OpenStack, MachineOpenStackAspectMachine_OpenStackAspectProperties> map = new java.util.WeakHashMap<org.occiware.clouddesigner.occi.docker.Machine_OpenStack, org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineOpenStackAspectMachine_OpenStackAspectProperties>();
  
  public Map<Machine_OpenStack, MachineOpenStackAspectMachine_OpenStackAspectProperties> getMap() {
    return map;
  }
}
