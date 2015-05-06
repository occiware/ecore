package org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.CreateContainerResponse;
import com.google.common.base.Objects;
import com.google.common.collect.Multimap;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.occiware.clouddesigner.OCCI.Link;
import org.occiware.clouddesigner.OCCI.Resource;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.Contains;
import org.occiware.clouddesigner.occi.docker.DockerFactory;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.connector.ModelHandler;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.DockerContainerManager;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspectContainerAspectProperties;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspect;
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus;

@Aspect(className = Container.class)
@SuppressWarnings("all")
public class ContainerAspect {
  public static Map<DockerClient, CreateContainerResponse> createContainer(final Container _self, final Machine machine, final Multimap<String, String> containerDependency) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspectContainerAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspectContainerAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_createContainer(_self_, _self,machine,containerDependency);
    return (java.util.Map<com.github.dockerjava.api.DockerClient, com.github.dockerjava.api.command.CreateContainerResponse>)result;
  }
  
  public static Map<DockerClient, CreateContainerResponse> createContainer(final Container _self, final Container container) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspectContainerAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspectContainerAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_createContainer(_self_, _self,container);
    return (java.util.Map<com.github.dockerjava.api.DockerClient, com.github.dockerjava.api.command.CreateContainerResponse>)result;
  }
  
  public static Machine linkContainerToMachine(final Container _self, final Machine machine) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspectContainerAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspectContainerAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_linkContainerToMachine(_self_, _self,machine);
    return (org.occiware.clouddesigner.occi.docker.Machine)result;
  }
  
  public static Container linkContainerToContainer(final Container _self, final Container container) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspectContainerAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspectContainerAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_linkContainerToContainer(_self_, _self,container);
    return (org.occiware.clouddesigner.occi.docker.Container)result;
  }
  
  public static void containerStart(final Container _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspectContainerAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspectContainerAspectContext.getSelf(_self);
    _privk3_containerStart(_self_, _self);
  }
  
  public static void containerStop(final Container _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspectContainerAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspectContainerAspectContext.getSelf(_self);
    _privk3_containerStop(_self_, _self);
  }
  
  public static void containerWait(final Container _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspectContainerAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspectContainerAspectContext.getSelf(_self);
    _privk3_containerWait(_self_, _self);
  }
  
  public static void save(final Container _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspectContainerAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspectContainerAspectContext.getSelf(_self);
    _privk3_save(_self_, _self);
  }
  
  public static Machine getCurrentMachine(final Container _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspectContainerAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspectContainerAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_getCurrentMachine(_self_, _self);
    return (org.occiware.clouddesigner.occi.docker.Machine)result;
  }
  
  private static Map<DockerClient, CreateContainerResponse> map(final Container _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspectContainerAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspectContainerAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_map(_self_, _self);
    return (java.util.Map<com.github.dockerjava.api.DockerClient, com.github.dockerjava.api.command.CreateContainerResponse>)result;
  }
  
  private static void map(final Container _self, final Map<DockerClient, CreateContainerResponse> map) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspectContainerAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspectContainerAspectContext.getSelf(_self);
    _privk3_map(_self_, _self,map);
  }
  
  protected static Map<DockerClient, CreateContainerResponse> _privk3_createContainer(final ContainerAspectContainerAspectProperties _self_, final Container _self, final Machine machine, final Multimap<String, String> containerDependency) {
    DockerContainerManager dockercontainerManager = new DockerContainerManager();
    Map<DockerClient, CreateContainerResponse> result = new HashMap<DockerClient, CreateContainerResponse>();
    String _image = _self.getImage();
    dockercontainerManager.pullImage(machine, _image);
    Map<DockerClient, CreateContainerResponse> _createContainer = dockercontainerManager.createContainer(machine, _self, containerDependency);
    result = _createContainer;
    HashMap<DockerClient, CreateContainerResponse> _hashMap = new HashMap<DockerClient, CreateContainerResponse>(result);
    ContainerAspect.map(_self, _hashMap);
    return result;
  }
  
  protected static Map<DockerClient, CreateContainerResponse> _privk3_createContainer(final ContainerAspectContainerAspectProperties _self_, final Container _self, final Container container) {
    EList<Link> _links = container.getLinks();
    Link _get = _links.get(0);
    Resource _source = _get.getSource();
    final Machine machine = ((Machine) _source);
    DockerContainerManager dockercontainerManager = new DockerContainerManager();
    Map<DockerClient, CreateContainerResponse> result = new HashMap<DockerClient, CreateContainerResponse>();
    String _image = _self.getImage();
    dockercontainerManager.pullImage(machine, _image);
    Map<DockerClient, CreateContainerResponse> _createContainer = dockercontainerManager.createContainer(machine, _self);
    result = _createContainer;
    HashMap<DockerClient, CreateContainerResponse> _hashMap = new HashMap<DockerClient, CreateContainerResponse>(result);
    ContainerAspect.map(_self, _hashMap);
    return result;
  }
  
  protected static Machine _privk3_linkContainerToMachine(final ContainerAspectContainerAspectProperties _self_, final Container _self, final Machine machine) {
    Contains contains = DockerFactory.eINSTANCE.createContains();
    contains.setTarget(_self);
    EList<Link> _links = machine.getLinks();
    _links.add(contains);
    return machine;
  }
  
  protected static Container _privk3_linkContainerToContainer(final ContainerAspectContainerAspectProperties _self_, final Container _self, final Container container) {
    org.occiware.clouddesigner.occi.docker.Link links = DockerFactory.eINSTANCE.createLink();
    links.setTarget(container);
    EList<Link> _links = _self.getLinks();
    _links.add(links);
    return container;
  }
  
  protected static void _privk3_containerStart(final ContainerAspectContainerAspectProperties _self_, final Container _self) {
    final Machine machine = ContainerAspect.getCurrentMachine(_self);
    ComputeStatus _state = machine.getState();
    String _string = _state.toString();
    boolean _equalsIgnoreCase = _string.equalsIgnoreCase("active");
    if (_equalsIgnoreCase) {
      final DockerContainerManager dockerContainerManager = new DockerContainerManager();
      dockerContainerManager.startContainer(machine, _self);
    }
  }
  
  protected static void _privk3_containerStop(final ContainerAspectContainerAspectProperties _self_, final Container _self) {
    final Machine machine = ContainerAspect.getCurrentMachine(_self);
    boolean _isDeployed = MachineAspect.isDeployed(machine);
    if (_isDeployed) {
      final DockerContainerManager dockerContainerManager = new DockerContainerManager();
      dockerContainerManager.stopContainer(machine, _self);
    }
  }
  
  protected static void _privk3_containerWait(final ContainerAspectContainerAspectProperties _self_, final Container _self) {
    final Machine machine = ContainerAspect.getCurrentMachine(_self);
    boolean _isDeployed = MachineAspect.isDeployed(machine);
    if (_isDeployed) {
      final DockerContainerManager dockerContainerManager = new DockerContainerManager();
      dockerContainerManager.waitContainer(machine, _self);
    }
  }
  
  protected static void _privk3_save(final ContainerAspectContainerAspectProperties _self_, final Container _self) {
    final ModelHandler instanceMH = new ModelHandler();
    instanceMH.saveContainer(_self);
  }
  
  protected static Machine _privk3_getCurrentMachine(final ContainerAspectContainerAspectProperties _self_, final Container _self) {
    EObject _eContainer = _self.eContainer();
    EList<EObject> _eContents = _eContainer.eContents();
    for (final EObject eo : _eContents) {
      if ((eo instanceof Machine)) {
        final Machine machine = ((Machine) eo);
        EList<Link> _links = machine.getLinks();
        for (final Link l : _links) {
          Resource _target = l.getTarget();
          String _id = ((Container) _target).getId();
          String _id_1 = _self.getId();
          boolean _equals = Objects.equal(_id, _id_1);
          if (_equals) {
            return machine;
          }
        }
      }
    }
    return null;
  }
  
  protected static Map<DockerClient, CreateContainerResponse> _privk3_map(final ContainerAspectContainerAspectProperties _self_, final Container _self) {
     return _self_.map; 
  }
  
  protected static void _privk3_map(final ContainerAspectContainerAspectProperties _self_, final Container _self, final Map<DockerClient, CreateContainerResponse> map) {
    _self_.map = map; try {
    
    			for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    				if (m.getName().equals("set" + "Map")
    						&& m.getParameterTypes().length == 1) {
    					m.invoke(_self, map);
    
    				}
    			}
    		} catch (Exception e) {
    			// Chut !
    		} 
  }
}
