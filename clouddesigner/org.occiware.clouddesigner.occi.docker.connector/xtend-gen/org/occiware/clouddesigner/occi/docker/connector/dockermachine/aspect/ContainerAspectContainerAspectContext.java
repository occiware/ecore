package org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect;

import java.util.Map;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspectContainerAspectProperties;

@SuppressWarnings("all")
public class ContainerAspectContainerAspectContext {
  public final static ContainerAspectContainerAspectContext INSTANCE = new ContainerAspectContainerAspectContext();
  
  public static ContainerAspectContainerAspectProperties getSelf(final Container _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspectContainerAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Container, ContainerAspectContainerAspectProperties> map = new java.util.WeakHashMap<org.occiware.clouddesigner.occi.docker.Container, org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspectContainerAspectProperties>();
  
  public Map<Container, ContainerAspectContainerAspectProperties> getMap() {
    return map;
  }
}
