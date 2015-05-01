package org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect;

import java.util.Map;
import org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineIBMSoftLayerAspectMachine_IBM_SoftLayerAspectProperties;

@SuppressWarnings("all")
public class MachineIBMSoftLayerAspectMachine_IBM_SoftLayerAspectContext {
  public final static MachineIBMSoftLayerAspectMachine_IBM_SoftLayerAspectContext INSTANCE = new MachineIBMSoftLayerAspectMachine_IBM_SoftLayerAspectContext();
  
  public static MachineIBMSoftLayerAspectMachine_IBM_SoftLayerAspectProperties getSelf(final Machine_IBM_SoftLayer _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineIBMSoftLayerAspectMachine_IBM_SoftLayerAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Machine_IBM_SoftLayer, MachineIBMSoftLayerAspectMachine_IBM_SoftLayerAspectProperties> map = new java.util.WeakHashMap<org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer, org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineIBMSoftLayerAspectMachine_IBM_SoftLayerAspectProperties>();
  
  public Map<Machine_IBM_SoftLayer, MachineIBMSoftLayerAspectMachine_IBM_SoftLayerAspectProperties> getMap() {
    return map;
  }
}
