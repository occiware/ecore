package org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect;

import com.google.common.base.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.occiware.clouddesigner.OCCI.Configuration;
import org.occiware.clouddesigner.OCCI.Link;
import org.occiware.clouddesigner.OCCI.Resource;
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
import org.occiware.clouddesigner.occi.docker.connector.ModelHandler;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAmazonEC2Aspect;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineDigitalOceanAspect;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineGoogleComputeEngineAspect;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineIBMSoftLayerAspect;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineMicrosoftAzureAspect;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineMicrosoftHyperVAspect;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineOpenStackAspect;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineRackspaceAspect;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVMwarevCloudAirAspect;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVMwarevSphereAspect;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspect;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.Machine_VMwareFusionAspect;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil;

@SuppressWarnings("all")
public class DockerAspect {
  public Machine machine;
  
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
  
  public Configuration configuration;
  
  public static Map<String, Machine> register = new HashMap<String, Machine>();
  
  public DockerAspect() {
    this.initModel();
  }
  
  public DockerAspect(final Container container) {
    this.container = container;
  }
  
  public DockerAspect(final Machine machine) {
    if ((machine instanceof Machine_VirtualBox)) {
      this.machine_VirtualBox = ((Machine_VirtualBox) machine);
    } else {
      if ((machine instanceof Machine_Amazon_EC2)) {
        this.machine_Amazon_EC2 = ((Machine_Amazon_EC2) machine);
      } else {
        if ((machine instanceof Machine_Digital_Ocean)) {
          this.machine_Digital_Ocean = ((Machine_Digital_Ocean) machine);
        } else {
          if ((machine instanceof Machine_Google_Compute_Engine)) {
            this.machine_Google_Compute_Engine = ((Machine_Google_Compute_Engine)machine);
          } else {
            if ((machine instanceof Machine_IBM_SoftLayer)) {
              this.machine_IBM_SoftLayer = ((Machine_IBM_SoftLayer)machine);
            } else {
              if ((machine instanceof Machine_Microsoft_Azure)) {
                this.machine_Microsoft_Azure = ((Machine_Microsoft_Azure)machine);
              } else {
                if ((machine instanceof Machine_Microsoft_Hyper_V)) {
                  this.machine_Microsoft_Hyper_V = ((Machine_Microsoft_Hyper_V)machine);
                } else {
                  if ((machine instanceof Machine_OpenStack)) {
                    this.machine_OpenStack = ((Machine_OpenStack)machine);
                  } else {
                    if ((machine instanceof Machine_Rackspace)) {
                      this.machine_Rackspace = ((Machine_Rackspace)machine);
                    } else {
                      if ((machine instanceof Machine_VMware_Fusion)) {
                        this.machine_VMware_Fusion = ((Machine_VMware_Fusion)machine);
                      } else {
                        if ((machine instanceof Machine_VMware_vCloud_Air)) {
                          this.machine_VMware_vCloud_Air = ((Machine_VMware_vCloud_Air)machine);
                        } else {
                          if ((machine instanceof Machine_VMware_vSphere)) {
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
  
  public DockerAspect(final Configuration conf) {
    this.configuration = conf;
  }
  
  public void start() {
    boolean _notEquals = (!Objects.equal(this.machine_VirtualBox, null));
    if (_notEquals) {
      MachineVirtualBoxAspect.machineStart(this.machine_VirtualBox);
      return;
    }
    boolean _notEquals_1 = (!Objects.equal(this.machine_Amazon_EC2, null));
    if (_notEquals_1) {
      MachineAmazonEC2Aspect.machineStart(this.machine_Amazon_EC2);
      return;
    }
    boolean _notEquals_2 = (!Objects.equal(this.machine_Digital_Ocean, null));
    if (_notEquals_2) {
      MachineDigitalOceanAspect.machineStart(this.machine_Digital_Ocean);
      return;
    }
    boolean _notEquals_3 = (!Objects.equal(this.machine_Google_Compute_Engine, null));
    if (_notEquals_3) {
      MachineGoogleComputeEngineAspect.machineStart(this.machine_Google_Compute_Engine);
      return;
    }
    boolean _notEquals_4 = (!Objects.equal(this.machine_IBM_SoftLayer, null));
    if (_notEquals_4) {
      MachineIBMSoftLayerAspect.machineStart(this.machine_IBM_SoftLayer);
      return;
    }
    boolean _notEquals_5 = (!Objects.equal(this.machine_Microsoft_Azure, null));
    if (_notEquals_5) {
      MachineMicrosoftAzureAspect.machineStart(this.machine_Microsoft_Azure);
      return;
    }
    boolean _notEquals_6 = (!Objects.equal(this.machine_Microsoft_Hyper_V, null));
    if (_notEquals_6) {
      MachineMicrosoftHyperVAspect.machineStart(this.machine_Microsoft_Hyper_V);
      return;
    }
    boolean _notEquals_7 = (!Objects.equal(this.machine_OpenStack, null));
    if (_notEquals_7) {
      MachineOpenStackAspect.machineStart(this.machine_OpenStack);
      return;
    }
    boolean _notEquals_8 = (!Objects.equal(this.machine_Rackspace, null));
    if (_notEquals_8) {
      MachineRackspaceAspect.machineStart(this.machine_Rackspace);
      return;
    }
    boolean _notEquals_9 = (!Objects.equal(this.machine_VMware_Fusion, null));
    if (_notEquals_9) {
      Machine_VMwareFusionAspect.machineStart(this.machine_VMware_Fusion);
      return;
    }
    boolean _notEquals_10 = (!Objects.equal(this.machine_VMware_vCloud_Air, null));
    if (_notEquals_10) {
      MachineVMwarevCloudAirAspect.machineStart(this.machine_VMware_vCloud_Air);
      return;
    }
    boolean _notEquals_11 = (!Objects.equal(this.machine_VMware_vSphere, null));
    if (_notEquals_11) {
      MachineVMwarevSphereAspect.machineStart(this.machine_VMware_vSphere);
      return;
    }
  }
  
  public void startAll() {
    boolean _notEquals = (!Objects.equal(this.machine_VirtualBox, null));
    if (_notEquals) {
      MachineVirtualBoxAspect.machineStartAll(this.machine_VirtualBox);
      return;
    }
    boolean _notEquals_1 = (!Objects.equal(this.machine_Amazon_EC2, null));
    if (_notEquals_1) {
      MachineAmazonEC2Aspect.machineStartAll(this.machine_Amazon_EC2);
      return;
    }
    boolean _notEquals_2 = (!Objects.equal(this.machine_Digital_Ocean, null));
    if (_notEquals_2) {
      MachineDigitalOceanAspect.machineStartAll(this.machine_Digital_Ocean);
      return;
    }
    boolean _notEquals_3 = (!Objects.equal(this.machine_Google_Compute_Engine, null));
    if (_notEquals_3) {
      MachineGoogleComputeEngineAspect.machineStartAll(this.machine_Google_Compute_Engine);
      return;
    }
    boolean _notEquals_4 = (!Objects.equal(this.machine_IBM_SoftLayer, null));
    if (_notEquals_4) {
      MachineIBMSoftLayerAspect.machineStartAll(this.machine_IBM_SoftLayer);
      return;
    }
    boolean _notEquals_5 = (!Objects.equal(this.machine_Microsoft_Azure, null));
    if (_notEquals_5) {
      MachineMicrosoftAzureAspect.machineStartAll(this.machine_Microsoft_Azure);
      return;
    }
    boolean _notEquals_6 = (!Objects.equal(this.machine_Microsoft_Hyper_V, null));
    if (_notEquals_6) {
      MachineMicrosoftHyperVAspect.machineStartAll(this.machine_Microsoft_Hyper_V);
      return;
    }
    boolean _notEquals_7 = (!Objects.equal(this.machine_OpenStack, null));
    if (_notEquals_7) {
      MachineOpenStackAspect.machineStartAll(this.machine_OpenStack);
      return;
    }
    boolean _notEquals_8 = (!Objects.equal(this.machine_Rackspace, null));
    if (_notEquals_8) {
      MachineRackspaceAspect.machineStartAll(this.machine_Rackspace);
      return;
    }
    boolean _notEquals_9 = (!Objects.equal(this.machine_VMware_Fusion, null));
    if (_notEquals_9) {
      Machine_VMwareFusionAspect.machineStartAll(this.machine_VMware_Fusion);
      return;
    }
    boolean _notEquals_10 = (!Objects.equal(this.machine_VMware_vCloud_Air, null));
    if (_notEquals_10) {
      MachineVMwarevCloudAirAspect.machineStartAll(this.machine_VMware_vCloud_Air);
      return;
    }
    boolean _notEquals_11 = (!Objects.equal(this.machine_VMware_vSphere, null));
    if (_notEquals_11) {
      MachineVMwarevSphereAspect.machineStartAll(this.machine_VMware_vSphere);
      return;
    }
  }
  
  public void register(final Machine machine) {
    String _name = machine.getName();
    DockerAspect.register.put(_name, machine);
  }
  
  public Machine loadMachine() {
    Machine _createMachine = DockerFactory.eINSTANCE.createMachine();
    this.machine = _createMachine;
    this.register(this.machine);
    return this.machine;
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
  
  public void importModel() {
    final Map<String, String> hosts = DockerUtil.getHosts();
    final ModelHandler instanceMH = new ModelHandler();
    InputOutput.<Map<String, String>>println(hosts);
    Set<Map.Entry<String, String>> _entrySet = hosts.entrySet();
    for (final Map.Entry<String, String> entry : _entrySet) {
      {
        String _key = entry.getKey();
        String _value = entry.getValue();
        Machine machine = instanceMH.getModel(_key, _value);
        boolean _containMachine = this.containMachine(machine);
        boolean _not = (!_containMachine);
        if (_not) {
          EList<Resource> _resources = this.configuration.getResources();
          _resources.add(machine);
          EList<Link> _links = machine.getLinks();
          boolean _notEquals = (!Objects.equal(_links, null));
          if (_notEquals) {
            EList<Link> _links_1 = machine.getLinks();
            final Procedure1<Link> _function = new Procedure1<Link>() {
              @Override
              public void apply(final Link elt) {
                EList<Resource> _resources = DockerAspect.this.configuration.getResources();
                Resource _target = elt.getTarget();
                _resources.add(((Container) _target));
              }
            };
            IterableExtensions.<Link>forEach(_links_1, _function);
          }
        }
      }
    }
  }
  
  public boolean containMachine(final Machine machine) {
    EList<Resource> _resources = this.configuration.getResources();
    for (final Resource r : _resources) {
      if ((r instanceof Machine)) {
        String _name = ((Machine) r).getName();
        String _name_1 = machine.getName();
        boolean _equals = Objects.equal(_name, _name_1);
        if (_equals) {
          return true;
        }
      }
    }
    return false;
  }
  
  public void synchronize() {
    MachineVirtualBoxAspect.synchronize(this.machine_VirtualBox);
  }
}
