/**
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	- Fawaz PARAISO
 */
package org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect;

import com.google.common.base.Objects;
import com.google.common.collect.Multimap;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.occiware.clouddesigner.OCCI.Link;
import org.occiware.clouddesigner.OCCI.Resource;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox;
import org.occiware.clouddesigner.occi.docker.connector.ModelHandler;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.DockerContainerManager;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.graph.Graph;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.graph.GraphNode;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspect;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspect;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerMachineManager;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.Provider;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.ProcessManager;
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus;

@Aspect(className = Machine_VirtualBox.class)
@SuppressWarnings("all")
public class MachineVirtualBoxAspect extends MachineAspect {
  @ReplaceAspectMethod
  public static void start(final Machine_VirtualBox _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectContext.getSelf(_self);
    _privk3_start(_self_, _self);
  }
  
  @OverrideAspectMethod
  public static String createMachineCommand(final Machine_VirtualBox _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.occiware.clouddesigner.occi.docker.Machine_VirtualBox){
    result = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspect._privk3_createMachineCommand(_self_, (org.occiware.clouddesigner.occi.docker.Machine_VirtualBox)_self);
    } else  if (_self instanceof org.occiware.clouddesigner.occi.docker.Machine){
    result = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspect.createMachineCommand((org.occiware.clouddesigner.occi.docker.Machine)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  public static void machineStartAll(final Machine_VirtualBox _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectContext.getSelf(_self);
    _privk3_machineStartAll(_self_, _self);
  }
  
  public static void machineStart(final Machine_VirtualBox _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectContext.getSelf(_self);
    _privk3_machineStart(_self_, _self);
  }
  
  public static void machineStop(final Machine_VirtualBox _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectContext.getSelf(_self);
    _privk3_machineStop(_self_, _self);
  }
  
  public static void machineRemove(final Machine_VirtualBox _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectContext.getSelf(_self);
    _privk3_machineRemove(_self_, _self);
  }
  
  public static void machineRestart(final Machine_VirtualBox _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectContext.getSelf(_self);
    _privk3_machineRestart(_self_, _self);
  }
  
  public static void save(final Machine_VirtualBox _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectContext.getSelf(_self);
    _privk3_save(_self_, _self);
  }
  
  public static List<Container> getContainers(final Machine_VirtualBox _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_getContainers(_self_, _self);
    return (java.util.List<org.occiware.clouddesigner.occi.docker.Container>)result;
  }
  
  public static List<Container> leafContainers(final Machine_VirtualBox _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_leafContainers(_self_, _self);
    return (java.util.List<org.occiware.clouddesigner.occi.docker.Container>)result;
  }
  
  public static boolean linkFound(final Machine_VirtualBox _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_linkFound(_self_, _self);
    return (boolean)result;
  }
  
  public static List<Container> deploymentOrder(final Machine_VirtualBox _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_deploymentOrder(_self_, _self);
    return (java.util.List<org.occiware.clouddesigner.occi.docker.Container>)result;
  }
  
  public static void synchronize(final Machine_VirtualBox _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectContext.getSelf(_self);
    _privk3_synchronize(_self_, _self);
  }
  
  protected static boolean isDeployed(final Machine_VirtualBox _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_isDeployed(_self_, _self);
    return (boolean)result;
  }
  
  protected static void isDeployed(final Machine_VirtualBox _self, final boolean isDeployed) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectContext.getSelf(_self);
    _privk3_isDeployed(_self_, _self,isDeployed);
  }
  
  protected static Multimap<String, String> containerDependency(final Machine_VirtualBox _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_containerDependency(_self_, _self);
    return (com.google.common.collect.Multimap<java.lang.String, java.lang.String>)result;
  }
  
  protected static void containerDependency(final Machine_VirtualBox _self, final Multimap<String, String> containerDependency) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspectMachine_VirtualBoxAspectContext.getSelf(_self);
    _privk3_containerDependency(_self_, _self,containerDependency);
  }
  
  protected static void _privk3_start(final MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_, final Machine_VirtualBox _self) {
    InputOutput.<String>println("Je redefinis la methode start \n\n\n");
  }
  
  private static String super_createMachineCommand(final Machine_VirtualBox _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspectMachineAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspectMachineAspectContext.getSelf(_self);
    return  org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspect._privk3_createMachineCommand(_self_, _self);
  }
  
  protected static String _privk3_createMachineCommand(final MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_, final Machine_VirtualBox _self) {
    StringBuilder command = new StringBuilder("docker-machine create --driver ");
    String _string = Provider.virtualbox.toString();
    command.append(_string);
    String _name = _self.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      String _name_1 = _self.getName();
      String _plus = (" " + _name_1);
      command.append(_plus);
      int _disk_size = _self.getDisk_size();
      boolean _greaterThan = (_disk_size > 0);
      if (_greaterThan) {
        int _disk_size_1 = _self.getDisk_size();
        String _plus_1 = (" --virtualbox-disk-size " + Integer.valueOf(_disk_size_1));
        command.append(_plus_1);
      }
      float _memory = _self.getMemory();
      boolean _greaterThan_1 = (_memory > 0.0F);
      if (_greaterThan_1) {
        float _memory_1 = _self.getMemory();
        String _plus_2 = (" --virtualbox-memory " + Float.valueOf(_memory_1));
        command.append(_plus_2);
      } else {
        float _memory_2 = _self.getMemory();
        boolean _equals = (_memory_2 == 0.0F);
        if (_equals) {
          command.append((" --virtualbox-memory " + Double.valueOf(1024.0)));
        }
      }
      int _cores = _self.getCores();
      boolean _greaterThan_2 = (_cores > 0);
      if (_greaterThan_2) {
        int _cores_1 = _self.getCores();
        String _plus_3 = (" --virtualbox-cpu-count " + Integer.valueOf(_cores_1));
        command.append(_plus_3);
      } else {
        int _cores_2 = _self.getCores();
        boolean _equals_1 = (_cores_2 == 0);
        if (_equals_1) {
          command.append((" --virtualbox-cpu-count " + Integer.valueOf((-1))));
        }
      }
      String _boot2docker_url = _self.getBoot2docker_url();
      boolean _notEquals_1 = (!Objects.equal(_boot2docker_url, null));
      if (_notEquals_1) {
        int _disk_size_2 = _self.getDisk_size();
        String _plus_4 = (" --virtualbox-boot2docker-url " + Integer.valueOf(_disk_size_2));
        command.append(_plus_4);
      }
    } else {
      String _name_2 = _self.getName();
      boolean _equals_2 = Objects.equal(_name_2, null);
      if (_equals_2) {
      }
    }
    return command.toString();
  }
  
  protected static void _privk3_machineStartAll(final MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_, final Machine_VirtualBox _self) {
    final Runtime runtime = Runtime.getRuntime();
    String _name = _self.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      final Map<String, String> activeHosts = DockerUtil.getActiveHosts();
      final Map<String, String> hosts = DockerUtil.getHosts();
      String _name_1 = _self.getName();
      boolean _containsKey = hosts.containsKey(_name_1);
      boolean _not = (!_containsKey);
      if (_not) {
        String _createMachineCommand = MachineVirtualBoxAspect.createMachineCommand(_self);
        ProcessManager.runCommand(_createMachineCommand, runtime, true);
        EList<Link> _links = _self.getLinks();
        int _size = _links.size();
        boolean _greaterThan = (_size > 0);
        if (_greaterThan) {
          boolean _linkFound = MachineVirtualBoxAspect.linkFound(_self);
          boolean _not_1 = (!_linkFound);
          if (_not_1) {
            EList<Link> _links_1 = _self.getLinks();
            final Procedure1<Link> _function = new Procedure1<Link>() {
              public void apply(final Link elt) {
                Resource _target = elt.getTarget();
                Multimap<String, String> _containerDependency = MachineVirtualBoxAspect.containerDependency(_self);
                ContainerAspect.createContainer(((Container) _target), _self, _containerDependency);
              }
            };
            IterableExtensions.<Link>forEach(_links_1, _function);
          } else {
            final Multimap<String, String> dependencies = MachineVirtualBoxAspect.containerDependency(_self);
            List<Container> _deploymentOrder = MachineVirtualBoxAspect.deploymentOrder(_self);
            final Procedure1<Container> _function_1 = new Procedure1<Container>() {
              public void apply(final Container c) {
                ContainerAspect.createContainer(c, _self, dependencies);
              }
            };
            IterableExtensions.<Container>forEach(_deploymentOrder, _function_1);
          }
        }
      } else {
        String _name_2 = _self.getName();
        boolean _containsKey_1 = activeHosts.containsKey(_name_2);
        boolean _not_2 = (!_containsKey_1);
        if (_not_2) {
          String _name_3 = _self.getName();
          DockerMachineManager.startCmd(runtime, _name_3);
          EList<Link> _links_2 = _self.getLinks();
          int _size_1 = _links_2.size();
          boolean _greaterThan_1 = (_size_1 > 0);
          if (_greaterThan_1) {
            boolean _linkFound_1 = MachineVirtualBoxAspect.linkFound(_self);
            boolean _not_3 = (!_linkFound_1);
            if (_not_3) {
              EList<Link> _links_3 = _self.getLinks();
              final Procedure1<Link> _function_2 = new Procedure1<Link>() {
                public void apply(final Link elt) {
                  Resource _target = elt.getTarget();
                  Multimap<String, String> _containerDependency = MachineVirtualBoxAspect.containerDependency(_self);
                  ContainerAspect.createContainer(((Container) _target), _self, _containerDependency);
                }
              };
              IterableExtensions.<Link>forEach(_links_3, _function_2);
            } else {
              List<Container> _deploymentOrder_1 = MachineVirtualBoxAspect.deploymentOrder(_self);
              final Procedure1<Container> _function_3 = new Procedure1<Container>() {
                public void apply(final Container c) {
                  Multimap<String, String> _containerDependency = MachineVirtualBoxAspect.containerDependency(_self);
                  ContainerAspect.createContainer(c, _self, _containerDependency);
                }
              };
              IterableExtensions.<Container>forEach(_deploymentOrder_1, _function_3);
            }
          }
        }
      }
      ComputeStatus _get = ComputeStatus.get(0);
      _self.setState(_get);
      String _name_4 = _self.getName();
      boolean _setEnvCmd = DockerMachineManager.setEnvCmd(runtime, _name_4);
      MachineVirtualBoxAspect.isDeployed(_self, _setEnvCmd);
    }
  }
  
  protected static void _privk3_machineStart(final MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_, final Machine_VirtualBox _self) {
    final Runtime runtime = Runtime.getRuntime();
    String _name = _self.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      final Map<String, String> activeHosts = DockerUtil.getActiveHosts();
      final Map<String, String> hosts = DockerUtil.getHosts();
      String _name_1 = _self.getName();
      boolean _containsKey = hosts.containsKey(_name_1);
      boolean _not = (!_containsKey);
      if (_not) {
        String _createMachineCommand = MachineVirtualBoxAspect.createMachineCommand(_self);
        ProcessManager.runCommand(_createMachineCommand, runtime, true);
      } else {
        String _name_2 = _self.getName();
        boolean _containsKey_1 = activeHosts.containsKey(_name_2);
        boolean _not_1 = (!_containsKey_1);
        if (_not_1) {
          String _name_3 = _self.getName();
          DockerMachineManager.startCmd(runtime, _name_3);
        }
      }
      ComputeStatus _get = ComputeStatus.get(0);
      _self.setState(_get);
      String _name_4 = _self.getName();
      boolean _setEnvCmd = DockerMachineManager.setEnvCmd(runtime, _name_4);
      MachineVirtualBoxAspect.isDeployed(_self, _setEnvCmd);
    }
  }
  
  protected static void _privk3_machineStop(final MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_, final Machine_VirtualBox _self) {
    String _name = _self.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      Runtime _runtime = Runtime.getRuntime();
      String _name_1 = _self.getName();
      DockerMachineManager.stopCmd(_runtime, _name_1);
      ComputeStatus _get = ComputeStatus.get(1);
      _self.setState(_get);
    }
  }
  
  protected static void _privk3_machineRemove(final MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_, final Machine_VirtualBox _self) {
    String _name = _self.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      Runtime _runtime = Runtime.getRuntime();
      String _name_1 = _self.getName();
      DockerMachineManager.removeCmd(_runtime, _name_1);
      ComputeStatus _get = ComputeStatus.get(1);
      _self.setState(_get);
      MachineVirtualBoxAspect.isDeployed(_self, false);
    }
  }
  
  protected static void _privk3_machineRestart(final MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_, final Machine_VirtualBox _self) {
    String _name = _self.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      Runtime _runtime = Runtime.getRuntime();
      String _name_1 = _self.getName();
      DockerMachineManager.restartCmd(_runtime, _name_1);
      ComputeStatus _get = ComputeStatus.get(0);
      _self.setState(_get);
    }
  }
  
  protected static void _privk3_save(final MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_, final Machine_VirtualBox _self) {
    final ModelHandler instanceMH = new ModelHandler();
    instanceMH.saveMachine(_self);
  }
  
  protected static List<Container> _privk3_getContainers(final MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_, final Machine_VirtualBox _self) {
    final List<Container> containers = CollectionLiterals.<Container>newArrayList();
    EList<Link> _links = _self.getLinks();
    final Procedure1<Link> _function = new Procedure1<Link>() {
      public void apply(final Link elt) {
        Resource _target = elt.getTarget();
        containers.add(((Container) _target));
      }
    };
    IterableExtensions.<Link>forEach(_links, _function);
    return containers;
  }
  
  protected static List<Container> _privk3_leafContainers(final MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_, final Machine_VirtualBox _self) {
    final List<Container> containers = MachineVirtualBoxAspect.getContainers(_self);
    final List<Container> leafContainers = new ArrayList<Container>();
    for (final Container c : containers) {
      EList<Link> _links = c.getLinks();
      int _size = _links.size();
      boolean _equals = (_size == 0);
      if (_equals) {
        leafContainers.add(c);
      }
    }
    return leafContainers;
  }
  
  protected static boolean _privk3_linkFound(final MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_, final Machine_VirtualBox _self) {
    final List<Container> containers = MachineVirtualBoxAspect.getContainers(_self);
    boolean link = false;
    for (final Container c : containers) {
      EList<Link> _links = c.getLinks();
      int _size = _links.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        link = true;
        return link;
      }
    }
    return link;
  }
  
  protected static List<Container> _privk3_deploymentOrder(final MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_, final Machine_VirtualBox _self) {
    final List<Container> containers = CollectionLiterals.<Container>newArrayList();
    Graph<Container> graph = new Graph<Container>();
    EList<Link> _links = _self.getLinks();
    for (final Link l : _links) {
      {
        Resource _target = l.getTarget();
        final Container container = ((Container) _target);
        EList<Link> _links_1 = container.getLinks();
        boolean _isEmpty = _links_1.isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          EList<Link> _links_2 = container.getLinks();
          for (final Link cl : _links_2) {
            {
              Resource _target_1 = cl.getTarget();
              graph.addDependency(container, ((Container) _target_1));
              Multimap<String, String> _containerDependency = MachineVirtualBoxAspect.containerDependency(_self);
              String _name = container.getName();
              Resource _target_2 = cl.getTarget();
              String _name_1 = ((Container) _target_2).getName();
              _containerDependency.put(_name, _name_1);
            }
          }
        }
      }
    }
    InputOutput.<String>println("First time");
    Multimap<String, String> _containerDependency = MachineVirtualBoxAspect.containerDependency(_self);
    InputOutput.<Multimap<String, String>>println(_containerDependency);
    List<GraphNode<Container>> _deploymentOrder = graph.deploymentOrder();
    for (final GraphNode<Container> c : _deploymentOrder) {
      {
        containers.add(c.value);
        InputOutput.<String>println(("--->" + c.value));
      }
    }
    List<Container> _leafContainers = MachineVirtualBoxAspect.leafContainers(_self);
    for (final Container standaloneContainer : _leafContainers) {
      boolean _contains = containers.contains(standaloneContainer);
      boolean _not = (!_contains);
      if (_not) {
        containers.add(standaloneContainer);
      }
    }
    final Procedure1<Container> _function = new Procedure1<Container>() {
      public void apply(final Container c) {
        String _name = c.getName();
        InputOutput.<String>println(_name);
      }
    };
    IterableExtensions.<Container>forEach(containers, _function);
    return containers;
  }
  
  protected static void _privk3_synchronize(final MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_, final Machine_VirtualBox _self) {
    final Map<String, String> hosts = DockerUtil.getHosts();
    final ModelHandler instanceMH = new ModelHandler();
    final DockerContainerManager instance = new DockerContainerManager();
    String _name = _self.getName();
    String _name_1 = _self.getName();
    String _get = hosts.get(_name_1);
    final Machine machine = instanceMH.getModel(_name, _get);
    ComputeStatus _state = machine.getState();
    _self.setState(_state);
    ComputeStatus _state_1 = _self.getState();
    String _string = _state_1.toString();
    boolean _equalsIgnoreCase = _string.equalsIgnoreCase("active");
    if (_equalsIgnoreCase) {
      final List<com.github.dockerjava.api.model.Container> contains = instance.listContainer(machine);
      boolean _notEquals = (!Objects.equal(contains, null));
      if (_notEquals) {
        final List<Container> modelContainers = instanceMH.buildContainer(_self, contains);
        for (final Container container : modelContainers) {
          ContainerAspect.linkContainerToMachine(container, _self);
        }
        EList<Link> _links = _self.getLinks();
        boolean _notEquals_1 = (!Objects.equal(_links, null));
        if (_notEquals_1) {
          EList<Link> _links_1 = _self.getLinks();
          final Procedure1<Link> _function = new Procedure1<Link>() {
            public void apply(final Link elt) {
              Resource _target = elt.getTarget();
              String _name = ((Container) _target).getName();
              InputOutput.<String>println(_name);
            }
          };
          IterableExtensions.<Link>forEach(_links_1, _function);
          EList<Link> _links_2 = _self.getLinks();
          final Procedure1<Link> _function_1 = new Procedure1<Link>() {
            public void apply(final Link elt) {
              EObject _eContainer = _self.eContainer();
              org.eclipse.emf.ecore.resource.Resource _eResource = _eContainer.eResource();
              TreeIterator<EObject> _allContents = _eResource.getAllContents();
              List<EObject> _list = IteratorExtensions.<EObject>toList(_allContents);
              Resource _target = elt.getTarget();
              boolean _add = _list.add(((Container) _target));
              InputOutput.<Boolean>println(Boolean.valueOf(_add));
            }
          };
          IterableExtensions.<Link>forEach(_links_2, _function_1);
        }
      }
    }
  }
  
  protected static boolean _privk3_isDeployed(final MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_, final Machine_VirtualBox _self) {
     return _self_.isDeployed; 
  }
  
  protected static void _privk3_isDeployed(final MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_, final Machine_VirtualBox _self, final boolean isDeployed) {
    _self_.isDeployed = isDeployed; try {
    
    			for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    				if (m.getName().equals("set" + "IsDeployed")
    						&& m.getParameterTypes().length == 1) {
    					m.invoke(_self, isDeployed);
    
    				}
    			}
    		} catch (Exception e) {
    			// Chut !
    		} 
  }
  
  protected static Multimap<String, String> _privk3_containerDependency(final MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_, final Machine_VirtualBox _self) {
     return _self_.containerDependency; 
  }
  
  protected static void _privk3_containerDependency(final MachineVirtualBoxAspectMachine_VirtualBoxAspectProperties _self_, final Machine_VirtualBox _self, final Multimap<String, String> containerDependency) {
    _self_.containerDependency = containerDependency; try {
    
    			for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    				if (m.getName().equals("set" + "ContainerDependency")
    						&& m.getParameterTypes().length == 1) {
    					m.invoke(_self, containerDependency);
    
    				}
    			}
    		} catch (Exception e) {
    			// Chut !
    		} 
  }
}
