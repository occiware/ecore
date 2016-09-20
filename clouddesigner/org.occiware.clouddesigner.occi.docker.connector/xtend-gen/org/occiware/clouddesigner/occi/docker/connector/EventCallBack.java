/**
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe MERLE
 * 	- Fawaz PARAISO
 */
package org.occiware.clouddesigner.occi.docker.connector;

import com.github.dockerjava.api.command.InspectContainerResponse;
import com.github.dockerjava.api.model.Event;
import com.github.dockerjava.core.command.EventsResultCallback;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalCommandStack;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.Contains;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableContainer;
import org.occiware.clouddesigner.occi.docker.connector.ModelHandler;
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class notifies a new events to the connector.
 */
@SuppressWarnings("all")
public class EventCallBack extends EventsResultCallback {
  private static Logger LOGGER = LoggerFactory.getLogger(EventCallBack.class);
  
  private ExecutableContainer container;
  
  public EventCallBack(final ExecutableContainer container) {
    this.container = container;
  }
  
  public void modifyResourceSet(final Resource resource, final String state, final String containerId) {
    try {
      org.eclipse.emf.ecore.resource.Resource _eResource = resource.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(_resourceSet);
      Command cmd = new RecordingCommand(domain) {
        @Override
        protected void doExecute() {
          boolean _equalsIgnoreCase = state.equalsIgnoreCase("stop");
          if (_equalsIgnoreCase) {
            ((ExecutableContainer) resource).setState(ComputeStatus.INACTIVE);
          }
          boolean _equalsIgnoreCase_1 = state.equalsIgnoreCase("start");
          if (_equalsIgnoreCase_1) {
            ((ExecutableContainer) resource).setState(ComputeStatus.ACTIVE);
          }
          boolean _equalsIgnoreCase_2 = state.equalsIgnoreCase("create");
          if (_equalsIgnoreCase_2) {
            final ModelHandler instanceMH = new ModelHandler();
            Machine machine = ((ExecutableContainer) resource).getCurrentMachine();
            Container c = instanceMH.buildContainer(machine, containerId);
            instanceMH.linkContainerToMachine(c, machine);
            EObject _eContainer = machine.eContainer();
            if ((_eContainer instanceof Configuration)) {
              EObject _eContainer_1 = machine.eContainer();
              EList<Resource> _resources = ((Configuration) _eContainer_1).getResources();
              _resources.add(((ExecutableContainer) c));
              EventCallBack.LOGGER.info("Load new container");
            }
          }
          boolean _equalsIgnoreCase_3 = state.equalsIgnoreCase("destroy");
          if (_equalsIgnoreCase_3) {
            final ModelHandler instanceMH_1 = new ModelHandler();
            Container container = ((Container) resource);
            Machine machine_1 = ((ExecutableContainer) resource).getCurrentMachine();
            instanceMH_1.removeContainerFromMachine(container, machine_1);
            EObject _eContainer_2 = machine_1.eContainer();
            if ((_eContainer_2 instanceof Configuration)) {
              EObject _eContainer_3 = machine_1.eContainer();
              EList<Resource> _resources_1 = ((Configuration) _eContainer_3).getResources();
              _resources_1.remove(((ExecutableContainer) container));
              EventCallBack.LOGGER.info("Destroy a container");
            }
          }
        }
      };
      try {
        CommandStack _commandStack = domain.getCommandStack();
        ((TransactionalCommandStack) _commandStack).execute(cmd, null);
      } catch (final Throwable _t) {
        if (_t instanceof RollbackException) {
          final RollbackException rbe = (RollbackException)_t;
          IStatus _status = rbe.getStatus();
          String _string = _status.toString();
          EventCallBack.LOGGER.error(_string);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public void onNext(final Event event) {
    EventCallBack.LOGGER.info("Received event #{}", event);
    Machine machine = this.container.getCurrentMachine();
    ComputeStatus _state = machine.getState();
    boolean _equals = Objects.equal(_state, ComputeStatus.ACTIVE);
    if (_equals) {
      EList<Link> links = machine.getLinks();
      int _size = links.size();
      EventCallBack.LOGGER.info("Link size #{}", Integer.valueOf(_size));
      try {
        for (final Link l : links) {
          {
            Contains contains = ((Contains) l);
            boolean _notEquals = (!Objects.equal(contains, null));
            if (_notEquals) {
              Resource _target = contains.getTarget();
              if ((_target instanceof Container)) {
                Resource _target_1 = contains.getTarget();
                String _containerid = ((ExecutableContainer) _target_1).getContainerid();
                String _id = event.getId();
                boolean _equals_1 = Objects.equal(_containerid, _id);
                if (_equals_1) {
                  String _status = event.getStatus();
                  boolean _equalsIgnoreCase = _status.equalsIgnoreCase("stop");
                  if (_equalsIgnoreCase) {
                    Resource _target_2 = contains.getTarget();
                    String _status_1 = event.getStatus();
                    String _id_1 = event.getId();
                    this.modifyResourceSet(_target_2, _status_1, _id_1);
                    EventCallBack.LOGGER.info("Apply stop notification to model");
                  }
                  String _status_2 = event.getStatus();
                  boolean _equalsIgnoreCase_1 = _status_2.equalsIgnoreCase("start");
                  if (_equalsIgnoreCase_1) {
                    Resource _target_3 = contains.getTarget();
                    String _status_3 = event.getStatus();
                    String _id_2 = event.getId();
                    this.modifyResourceSet(_target_3, _status_3, _id_2);
                    EventCallBack.LOGGER.info("Apply start notification to model");
                  }
                  String _status_4 = event.getStatus();
                  boolean _equalsIgnoreCase_2 = _status_4.equalsIgnoreCase("destroy");
                  if (_equalsIgnoreCase_2) {
                    Resource _target_4 = contains.getTarget();
                    String _status_5 = event.getStatus();
                    String _id_3 = event.getId();
                    this.modifyResourceSet(_target_4, _status_5, _id_3);
                    EventCallBack.LOGGER.info("Apply destroy notification to model");
                  }
                } else {
                  if ((event.getStatus().equalsIgnoreCase("create") && 
                    (!this.containerIsInsideMachine(machine, event.getId())))) {
                    Resource _target_5 = contains.getTarget();
                    String _status_6 = event.getStatus();
                    String _id_4 = event.getId();
                    this.modifyResourceSet(_target_5, _status_6, _id_4);
                    EventCallBack.LOGGER.info("Apply create notification to model");
                  }
                }
              }
            }
          }
        }
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
  }
  
  public ArrayList<ExecutableContainer> listContainers(final Machine machine) {
    ArrayList<ExecutableContainer> containers = new ArrayList<ExecutableContainer>();
    EList<Link> _links = machine.getLinks();
    for (final Link l : _links) {
      {
        Contains contains = ((Contains) l);
        Resource _target = contains.getTarget();
        if ((_target instanceof Container)) {
          Resource _target_1 = contains.getTarget();
          containers.add(((ExecutableContainer) _target_1));
        }
      }
    }
    return containers;
  }
  
  public boolean containerIsInsideMachine(final Machine machine, final String containerId) {
    final InspectContainerResponse container = ExecutableContainer.dockerContainerManager.inspectContainer(machine, containerId);
    String _name = container.getName();
    final String name = _name.replaceAll("/", "");
    ArrayList<ExecutableContainer> listContainer = this.listContainers(machine);
    for (final ExecutableContainer ec : listContainer) {
      String _name_1 = ec.getName();
      boolean _equalsIgnoreCase = _name_1.equalsIgnoreCase(name);
      if (_equalsIgnoreCase) {
        return true;
      }
    }
    return false;
  }
  
  public Resource getResourceById(final Machine machine, final String containerId) {
    EList<Link> links = machine.getLinks();
    Iterator<Link> iterat = links.iterator();
    while (iterat.hasNext()) {
      {
        Link contains = iterat.next();
        boolean _notEquals = (!Objects.equal(contains, null));
        if (_notEquals) {
          Resource _target = contains.getTarget();
          if ((_target instanceof Container)) {
            Resource _target_1 = contains.getTarget();
            String _containerid = ((ExecutableContainer) _target_1).getContainerid();
            boolean _equals = Objects.equal(_containerid, containerId);
            if (_equals) {
              return contains.getTarget();
            }
          }
        }
      }
    }
    return null;
  }
}
