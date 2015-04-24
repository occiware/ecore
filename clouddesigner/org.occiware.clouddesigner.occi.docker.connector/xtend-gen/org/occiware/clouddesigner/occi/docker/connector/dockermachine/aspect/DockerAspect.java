package org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect;

import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.DockerFactory;
import org.occiware.clouddesigner.occi.docker.Machine;
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
import org.occiware.clouddesigner.occi.docker.impl.Machine_Amazon_EC2Impl;
import org.occiware.clouddesigner.occi.docker.impl.Machine_Digital_OceanImpl;
import org.occiware.clouddesigner.occi.docker.impl.Machine_Google_Compute_EngineImpl;
import org.occiware.clouddesigner.occi.docker.impl.Machine_IBM_SoftLayerImpl;
import org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl;
import org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_Hyper_VImpl;
import org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl;
import org.occiware.clouddesigner.occi.docker.impl.Machine_RackspaceImpl;
import org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vSphereImpl;
import org.occiware.clouddesigner.occi.docker.impl.Machine_VirtualBoxImpl;

@SuppressWarnings("all")
public class DockerAspect {
  public Machine_VirtualBox machine_VirtualBox;
  
  public Machine_Amazon_EC2 machine_Amazon_EC2;
  
  public Machine_Digital_Ocean machine_Digital_Ocean;
  
  public Machine_Google_Compute_Engine machine_Google_Compute_Engine;
  
  public Machine_IBM_SoftLayer machine_IBM_SoftLayer;
  
  public Machine_Microsoft_Azure machine_Microsoft_Azure;
  
  public Machine_Microsoft_Hyper_V machine_Microsoft_Hyper_V;
  
  public Machine_OpenStack machine_OpenStack;
  
  public Machine_Rackspace machine_Rackspace;
  
  public Machine_VMware_Fusion machine_VMware_Fusion;
  
  public Machine_VMware_vCloud_Air machine_VMware_vCloud_Air;
  
  public Machine_VMware_vSphere machine_VMware_vSphere;
  
  public Container container;
  
  public static Map<String, Machine> register = new HashMap<String, Machine>();
  
  public DockerAspect() {
    this.initModel();
  }
  
  public DockerAspect(final Machine machine) {
    if ((machine instanceof Machine_VirtualBoxImpl)) {
      this.machine_VirtualBox = ((Machine_VirtualBox)machine);
    } else {
      if ((machine instanceof Machine_Amazon_EC2Impl)) {
        this.machine_Amazon_EC2 = ((Machine_Amazon_EC2)machine);
      } else {
        if ((machine instanceof Machine_Digital_OceanImpl)) {
          this.machine_Digital_Ocean = ((Machine_Digital_Ocean)machine);
        } else {
          if ((machine instanceof Machine_Google_Compute_EngineImpl)) {
            this.machine_Google_Compute_Engine = ((Machine_Google_Compute_Engine)machine);
          } else {
            if ((machine instanceof Machine_IBM_SoftLayerImpl)) {
              this.machine_IBM_SoftLayer = ((Machine_IBM_SoftLayer)machine);
            } else {
              if ((machine instanceof Machine_Microsoft_AzureImpl)) {
                this.machine_Microsoft_Azure = ((Machine_Microsoft_Azure)machine);
              } else {
                if ((machine instanceof Machine_Microsoft_Hyper_VImpl)) {
                  this.machine_Microsoft_Hyper_V = ((Machine_Microsoft_Hyper_V)machine);
                } else {
                  if ((machine instanceof Machine_OpenStackImpl)) {
                    this.machine_OpenStack = ((Machine_OpenStack)machine);
                  } else {
                    if ((machine instanceof Machine_RackspaceImpl)) {
                      this.machine_Rackspace = ((Machine_Rackspace)machine);
                    } else {
                      if ((machine instanceof Machine_VMware_Fusion)) {
                        this.machine_VMware_Fusion = ((Machine_VMware_Fusion)machine);
                      } else {
                        if ((machine instanceof Machine_VMware_vCloud_Air)) {
                          this.machine_VMware_vCloud_Air = ((Machine_VMware_vCloud_Air)machine);
                        } else {
                          if ((machine instanceof Machine_VMware_vSphereImpl)) {
                            this.machine_VMware_vSphere = ((Machine_VMware_vSphere)machine);
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    this.register(machine);
  }
  
  public void register(final Machine machine) {
    String _name = machine.getName();
    DockerAspect.register.put(_name, machine);
  }
  
  public Machine_VirtualBox loadMachine_VirtualBox() {
    Machine_VirtualBox _createMachine_VirtualBox = DockerFactory.eINSTANCE.createMachine_VirtualBox();
    this.machine_VirtualBox = _createMachine_VirtualBox;
    this.register(this.machine_VirtualBox);
    return this.machine_VirtualBox;
  }
  
  public Machine_Amazon_EC2 loadMachine_Amazon_EC2() {
    Machine_Amazon_EC2 _createMachine_Amazon_EC2 = DockerFactory.eINSTANCE.createMachine_Amazon_EC2();
    this.machine_Amazon_EC2 = _createMachine_Amazon_EC2;
    this.register(this.machine_Amazon_EC2);
    return this.machine_Amazon_EC2;
  }
  
  public Machine_Google_Compute_Engine loadMachine_Google_Compute_Engine() {
    Machine_Google_Compute_Engine _createMachine_Google_Compute_Engine = DockerFactory.eINSTANCE.createMachine_Google_Compute_Engine();
    this.machine_Google_Compute_Engine = _createMachine_Google_Compute_Engine;
    this.register(this.machine_Google_Compute_Engine);
    return this.machine_Google_Compute_Engine;
  }
  
  public Machine_Digital_Ocean loadMachine_Digital_Ocean() {
    Machine_Digital_Ocean _createMachine_Digital_Ocean = DockerFactory.eINSTANCE.createMachine_Digital_Ocean();
    this.machine_Digital_Ocean = _createMachine_Digital_Ocean;
    this.register(this.machine_Digital_Ocean);
    return this.machine_Digital_Ocean;
  }
  
  public Machine_IBM_SoftLayer loadMachine_IBM_SoftLayer() {
    Machine_IBM_SoftLayer _createMachine_IBM_SoftLayer = DockerFactory.eINSTANCE.createMachine_IBM_SoftLayer();
    this.machine_IBM_SoftLayer = _createMachine_IBM_SoftLayer;
    this.register(this.machine_IBM_SoftLayer);
    return this.machine_IBM_SoftLayer;
  }
  
  public Machine_Microsoft_Azure loadMachine_Microsoft_Azure() {
    Machine_Microsoft_Azure _createMachine_Microsoft_Azure = DockerFactory.eINSTANCE.createMachine_Microsoft_Azure();
    this.machine_Microsoft_Azure = _createMachine_Microsoft_Azure;
    this.register(this.machine_Microsoft_Azure);
    return this.machine_Microsoft_Azure;
  }
  
  public Machine_Microsoft_Hyper_V loadMachine_Microsoft_Hyper_V() {
    Machine_Microsoft_Hyper_V _createMachine_Microsoft_Hyper_V = DockerFactory.eINSTANCE.createMachine_Microsoft_Hyper_V();
    this.machine_Microsoft_Hyper_V = _createMachine_Microsoft_Hyper_V;
    this.register(this.machine_Microsoft_Hyper_V);
    return this.machine_Microsoft_Hyper_V;
  }
  
  public Machine_OpenStack loadMachine_OpenStack() {
    Machine_OpenStack _createMachine_OpenStack = DockerFactory.eINSTANCE.createMachine_OpenStack();
    this.machine_OpenStack = _createMachine_OpenStack;
    this.register(this.machine_OpenStack);
    return this.machine_OpenStack;
  }
  
  public Machine_Rackspace loadMachine_Rackspace() {
    Machine_Rackspace _createMachine_Rackspace = DockerFactory.eINSTANCE.createMachine_Rackspace();
    this.machine_Rackspace = _createMachine_Rackspace;
    this.register(this.machine_Rackspace);
    return this.machine_Rackspace;
  }
  
  public Machine_VMware_Fusion loadMachine_VMware_Fusion() {
    Machine_VMware_Fusion _createMachine_VMware_Fusion = DockerFactory.eINSTANCE.createMachine_VMware_Fusion();
    this.machine_VMware_Fusion = _createMachine_VMware_Fusion;
    this.register(this.machine_VMware_Fusion);
    return this.machine_VMware_Fusion;
  }
  
  public Machine_VMware_vCloud_Air loadMachine_VMware_vCloud_Air() {
    Machine_VMware_vCloud_Air _createMachine_VMware_vCloud_Air = DockerFactory.eINSTANCE.createMachine_VMware_vCloud_Air();
    this.machine_VMware_vCloud_Air = _createMachine_VMware_vCloud_Air;
    this.register(this.machine_VMware_vCloud_Air);
    return this.machine_VMware_vCloud_Air;
  }
  
  public Machine_VMware_vSphere loadMachine_VMware_vSphere() {
    Machine_VMware_vSphere _createMachine_VMware_vSphere = DockerFactory.eINSTANCE.createMachine_VMware_vSphere();
    this.machine_VMware_vSphere = _createMachine_VMware_vSphere;
    this.register(this.machine_VMware_vSphere);
    return this.machine_VMware_vSphere;
  }
  
  public Container loadContainer() {
    Container _createContainer = DockerFactory.eINSTANCE.createContainer();
    return this.container = _createContainer;
  }
  
  public EClass initModel() {
    return DockerFactory.eINSTANCE.eClass();
  }
}
