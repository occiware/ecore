package org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.occiware.clouddesigner.occi.docker.DockerFactory;
import org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2;
import org.occiware.clouddesigner.occi.docker.Machine_Digital_Ocean;
import org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine;
import org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer;
import org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Azure;
import org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V;
import org.occiware.clouddesigner.occi.docker.Machine_OpenStack;
import org.occiware.clouddesigner.occi.docker.Machine_Rackspace;
import org.occiware.clouddesigner.occi.docker.Machine_VMware_Fusion;
import org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air;
import org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere;
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspect;

@SuppressWarnings("all")
public class DockerAspect {
  public Machine_VirtualBox machine_VirtualBox;
  
  private Machine_Amazon_EC2 machine_Amazon_EC2;
  
  private Machine_Digital_Ocean machine_Digital_Ocean;
  
  private Machine_Google_Compute_Engine machine_Google_Compute_Engine;
  
  private Machine_IBM_SoftLayer machine_IBM_SoftLayer;
  
  private Machine_Microsoft_Azure machine_Microsoft_Azure;
  
  private Machine_Microsoft_Hyper_V machine_Microsoft_Hyper_V;
  
  private Machine_OpenStack machine_OpenStack;
  
  private Machine_Rackspace machine_Rackspace;
  
  private Machine_VMware_Fusion machine_VMware_Fusion;
  
  private Machine_VMware_vCloud_Air machine_VMware_vCloud_Air;
  
  private Machine_VMware_vSphere machine_VMware_vSphere;
  
  public DockerAspect() {
    this.initModel();
  }
  
  public Boolean callAnAspect() {
    Boolean _xblockexpression = null;
    {
      String _createMachineCommand = MachineVirtualBoxAspect.createMachineCommand(this.machine_VirtualBox);
      InputOutput.<String>println(_createMachineCommand);
      boolean _isDeployed = MachineVirtualBoxAspect.isDeployed(this.machine_VirtualBox);
      _xblockexpression = InputOutput.<Boolean>println(Boolean.valueOf(_isDeployed));
    }
    return _xblockexpression;
  }
  
  public Machine_VirtualBox loadMachine_VirtualBox() {
    Machine_VirtualBox _createMachine_VirtualBox = DockerFactory.eINSTANCE.createMachine_VirtualBox();
    return this.machine_VirtualBox = _createMachine_VirtualBox;
  }
  
  public Machine_Amazon_EC2 loadMachine_Amazon_EC2() {
    Machine_Amazon_EC2 _createMachine_Amazon_EC2 = DockerFactory.eINSTANCE.createMachine_Amazon_EC2();
    return this.machine_Amazon_EC2 = _createMachine_Amazon_EC2;
  }
  
  public Machine_Google_Compute_Engine loadMachine_Google_Compute_Engine() {
    Machine_Google_Compute_Engine _createMachine_Google_Compute_Engine = DockerFactory.eINSTANCE.createMachine_Google_Compute_Engine();
    return this.machine_Google_Compute_Engine = _createMachine_Google_Compute_Engine;
  }
  
  public Machine_Digital_Ocean loadMachine_Digital_Ocean() {
    Machine_Digital_Ocean _createMachine_Digital_Ocean = DockerFactory.eINSTANCE.createMachine_Digital_Ocean();
    return this.machine_Digital_Ocean = _createMachine_Digital_Ocean;
  }
  
  public Machine_IBM_SoftLayer loadMachine_IBM_SoftLayer() {
    Machine_IBM_SoftLayer _xblockexpression = null;
    {
      this.initModel();
      Machine_IBM_SoftLayer _createMachine_IBM_SoftLayer = DockerFactory.eINSTANCE.createMachine_IBM_SoftLayer();
      _xblockexpression = this.machine_IBM_SoftLayer = _createMachine_IBM_SoftLayer;
    }
    return _xblockexpression;
  }
  
  public Machine_Microsoft_Azure loadMachine_Microsoft_Azure() {
    Machine_Microsoft_Azure _createMachine_Microsoft_Azure = DockerFactory.eINSTANCE.createMachine_Microsoft_Azure();
    return this.machine_Microsoft_Azure = _createMachine_Microsoft_Azure;
  }
  
  public Machine_Microsoft_Hyper_V loadMachine_Microsoft_Hyper_V() {
    Machine_Microsoft_Hyper_V _createMachine_Microsoft_Hyper_V = DockerFactory.eINSTANCE.createMachine_Microsoft_Hyper_V();
    return this.machine_Microsoft_Hyper_V = _createMachine_Microsoft_Hyper_V;
  }
  
  public Machine_OpenStack loadMachine_OpenStack() {
    Machine_OpenStack _createMachine_OpenStack = DockerFactory.eINSTANCE.createMachine_OpenStack();
    return this.machine_OpenStack = _createMachine_OpenStack;
  }
  
  public Machine_Rackspace loadMachine_Rackspace() {
    Machine_Rackspace _xblockexpression = null;
    {
      this.initModel();
      Machine_Rackspace _createMachine_Rackspace = DockerFactory.eINSTANCE.createMachine_Rackspace();
      _xblockexpression = this.machine_Rackspace = _createMachine_Rackspace;
    }
    return _xblockexpression;
  }
  
  public Machine_VMware_Fusion loadMachine_VMware_Fusion() {
    Machine_VMware_Fusion _createMachine_VMware_Fusion = DockerFactory.eINSTANCE.createMachine_VMware_Fusion();
    return this.machine_VMware_Fusion = _createMachine_VMware_Fusion;
  }
  
  public Machine_VMware_vCloud_Air loadMachine_VMware_vCloud_Air() {
    Machine_VMware_vCloud_Air _createMachine_VMware_vCloud_Air = DockerFactory.eINSTANCE.createMachine_VMware_vCloud_Air();
    return this.machine_VMware_vCloud_Air = _createMachine_VMware_vCloud_Air;
  }
  
  public Machine_VMware_vSphere loadMachine_VMware_vSphere() {
    Machine_VMware_vSphere _createMachine_VMware_vSphere = DockerFactory.eINSTANCE.createMachine_VMware_vSphere();
    return this.machine_VMware_vSphere = _createMachine_VMware_vSphere;
  }
  
  public EClass initModel() {
    return DockerFactory.eINSTANCE.eClass();
  }
}
