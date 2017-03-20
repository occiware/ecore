package org.occiware.clouddesigner.occi.cloud.connector.cloudproviders;

import org.occiware.clouddesigner.occi.cloud.CloudFactory;
import org.occiware.clouddesigner.occi.cloud.CloudPackage;
import org.occiware.clouddesigner.occi.cloud.Machine_OpenStack;
import org.occiware.clouddesigner.occi.cloud.connector.ExecutableCloudFactory;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;

@SuppressWarnings("all")
public class OpenStackTest {
  public void initOnce() {
    throw new Error("Unresolved compilation problems:"
      + "\nComputeServiceContext cannot be resolved to a type."
      + "\nComputeServiceContext cannot be resolved to a type."
      + "\nThe method or field ContextBuilder is undefined"
      + "\nnewBuilder cannot be resolved"
      + "\ncredentials cannot be resolved"
      + "\nendpoint cannot be resolved"
      + "\nmodules cannot be resolved"
      + "\nbuildView cannot be resolved"
      + "\ncomputeService cannot be resolved"
      + "\nlistImages cannot be resolved"
      + "\nid cannot be resolved"
      + "\ncomputeService cannot be resolved"
      + "\nlistHardwareProfiles cannot be resolved");
  }
  
  public static void main(final String[] args) {
    ExecutableCloudFactory.init();
    final CloudFactory factory = CloudPackage.eINSTANCE.getCloudFactory();
    final Machine_OpenStack machine = factory.createMachine_OpenStack();
    machine.setName("jcloud");
    machine.setFlavor_id("RegionOne/2");
    machine.setProvider("openstack-nova");
    machine.setTenant("OCCIWARE");
    machine.setUsername("fparaiso");
    machine.setPassword("qWqr76Xx");
    machine.setFloating_ip_pool("public");
    machine.setSecurity_group("jclouds-graphical");
    machine.setKeypair("fparaiso-key");
    machine.setNetwork_id("63b7887b-2a8c-4c9f-85e2-a9a7eb5a3f85");
    machine.setEndpoint("http://ow2-04.xsalto.net:5000/v2.0");
    machine.start();
    machine.stop(StopMethod.GRACEFUL);
  }
}
