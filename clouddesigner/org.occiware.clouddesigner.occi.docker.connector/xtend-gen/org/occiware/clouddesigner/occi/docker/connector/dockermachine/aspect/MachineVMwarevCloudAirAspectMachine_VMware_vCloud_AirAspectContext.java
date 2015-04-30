package org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect;

import java.util.Map;
import org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVMwarevCloudAirAspectMachine_VMware_vCloud_AirAspectProperties;

@SuppressWarnings("all")
public class MachineVMwarevCloudAirAspectMachine_VMware_vCloud_AirAspectContext {
  public final static MachineVMwarevCloudAirAspectMachine_VMware_vCloud_AirAspectContext INSTANCE = new MachineVMwarevCloudAirAspectMachine_VMware_vCloud_AirAspectContext();
  
  public static MachineVMwarevCloudAirAspectMachine_VMware_vCloud_AirAspectProperties getSelf(final Machine_VMware_vCloud_Air _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVMwarevCloudAirAspectMachine_VMware_vCloud_AirAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Machine_VMware_vCloud_Air, MachineVMwarevCloudAirAspectMachine_VMware_vCloud_AirAspectProperties> map = new java.util.WeakHashMap<org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air, org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVMwarevCloudAirAspectMachine_VMware_vCloud_AirAspectProperties>();
  
  public Map<Machine_VMware_vCloud_Air, MachineVMwarevCloudAirAspectMachine_VMware_vCloud_AirAspectProperties> getMap() {
    return map;
  }
}
