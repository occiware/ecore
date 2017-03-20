package org.occiware.clouddesigner.occi.cloud.connector.cloudproviders;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Module;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.jclouds.ContextBuilder;
import org.jclouds.compute.ComputeService;
import org.jclouds.compute.ComputeServiceContext;
import org.jclouds.compute.domain.Hardware;
import org.jclouds.compute.domain.Image;
import org.occiware.clouddesigner.occi.cloud.CloudFactory;
import org.occiware.clouddesigner.occi.cloud.CloudPackage;
import org.occiware.clouddesigner.occi.cloud.Machine_OpenStack;
import org.occiware.clouddesigner.occi.cloud.connector.ExecutableCloudFactory;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;

@SuppressWarnings("all")
public class OpenStackTest {
  public void initOnce() {
    final Iterable<Module> modules = ImmutableSet.<Module>of();
    final String provider = "openstack-nova";
    final String identity = "OCCIWARE:fparaiso";
    final String password = "qWqr76Xx";
    ContextBuilder _newBuilder = ContextBuilder.newBuilder(provider);
    ContextBuilder _credentials = _newBuilder.credentials(identity, password);
    ContextBuilder _endpoint = _credentials.endpoint("http://ow2-04.xsalto.net:5000/v2.0");
    ContextBuilder _modules = _endpoint.modules(modules);
    ComputeServiceContext context = _modules.<ComputeServiceContext>buildView(ComputeServiceContext.class);
    ComputeService _computeService = context.getComputeService();
    Set<? extends Image> _listImages = _computeService.listImages();
    for (final Image image : _listImages) {
      {
        InputOutput.<Image>println(image);
        String _id = image.getId();
        InputOutput.<String>println(_id);
      }
    }
    InputOutput.<String>println("###########################");
    ComputeService _computeService_1 = context.getComputeService();
    Set<? extends Hardware> _listHardwareProfiles = _computeService_1.listHardwareProfiles();
    for (final Hardware hardware : _listHardwareProfiles) {
      InputOutput.<Hardware>println(hardware);
    }
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
