package org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect;

import java.util.Map;
import org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Azure;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineMicrosoftAzureAspectMachine_Microsoft_AzureAspectProperties;

@SuppressWarnings("all")
public class MachineMicrosoftAzureAspectMachine_Microsoft_AzureAspectContext {
  public final static MachineMicrosoftAzureAspectMachine_Microsoft_AzureAspectContext INSTANCE = new MachineMicrosoftAzureAspectMachine_Microsoft_AzureAspectContext();
  
  public static MachineMicrosoftAzureAspectMachine_Microsoft_AzureAspectProperties getSelf(final Machine_Microsoft_Azure _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineMicrosoftAzureAspectMachine_Microsoft_AzureAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Machine_Microsoft_Azure, MachineMicrosoftAzureAspectMachine_Microsoft_AzureAspectProperties> map = new java.util.WeakHashMap<org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Azure, org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineMicrosoftAzureAspectMachine_Microsoft_AzureAspectProperties>();
  
  public Map<Machine_Microsoft_Azure, MachineMicrosoftAzureAspectMachine_Microsoft_AzureAspectProperties> getMap() {
    return map;
  }
}
