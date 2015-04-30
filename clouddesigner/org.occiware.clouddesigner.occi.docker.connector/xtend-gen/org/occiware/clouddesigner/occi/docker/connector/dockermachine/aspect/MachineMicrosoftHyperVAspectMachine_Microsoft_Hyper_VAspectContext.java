package org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect;

import java.util.Map;
import org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineMicrosoftHyperVAspectMachine_Microsoft_Hyper_VAspectProperties;

@SuppressWarnings("all")
public class MachineMicrosoftHyperVAspectMachine_Microsoft_Hyper_VAspectContext {
  public final static MachineMicrosoftHyperVAspectMachine_Microsoft_Hyper_VAspectContext INSTANCE = new MachineMicrosoftHyperVAspectMachine_Microsoft_Hyper_VAspectContext();
  
  public static MachineMicrosoftHyperVAspectMachine_Microsoft_Hyper_VAspectProperties getSelf(final Machine_Microsoft_Hyper_V _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineMicrosoftHyperVAspectMachine_Microsoft_Hyper_VAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Machine_Microsoft_Hyper_V, MachineMicrosoftHyperVAspectMachine_Microsoft_Hyper_VAspectProperties> map = new java.util.WeakHashMap<org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V, org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineMicrosoftHyperVAspectMachine_Microsoft_Hyper_VAspectProperties>();
  
  public Map<Machine_Microsoft_Hyper_V, MachineMicrosoftHyperVAspectMachine_Microsoft_Hyper_VAspectProperties> getMap() {
    return map;
  }
}
