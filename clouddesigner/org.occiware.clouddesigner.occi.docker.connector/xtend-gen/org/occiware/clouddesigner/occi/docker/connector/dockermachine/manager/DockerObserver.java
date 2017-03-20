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
package org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.DockerContainerManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class DockerObserver {
  private static Logger LOGGER = LoggerFactory.getLogger(DockerObserver.class);
  
  protected static Container cpContainer = null;
  
  protected static Machine cpMachine = null;
  
  public Machine listener(final Machine machine) {
    Machine _copy = EcoreUtil.<Machine>copy(machine);
    final Machine cpMachine = ((Machine) _copy);
    EList<Adapter> _eAdapters = machine.eAdapters();
    _eAdapters.add(
      new EContentAdapter() {
        @Override
        public void notifyChanged(final Notification notification) {
          Container deletedElement = null;
          Object _notifier = notification.getNotifier();
          if ((_notifier instanceof Machine)) {
            Object _notifier_1 = notification.getNotifier();
            Machine newMachine = ((Machine) _notifier_1);
            if (((!cpMachine.getName().equals(newMachine.getName())) && newMachine.getState().toString().equalsIgnoreCase("active"))) {
              Object _oldValue = notification.getOldValue();
              String _string = _oldValue.toString();
              machine.setName(_string);
              throw new UnsupportedOperationException();
            }
          }
          if (((notification.getEventType() == Notification.SET) && (notification.getOldValue() instanceof Container))) {
            Object _oldValue_1 = notification.getOldValue();
            deletedElement = ((Container) _oldValue_1);
            String _containerid = deletedElement.getContainerid();
            DockerObserver.LOGGER.info("Deleted model element with ID: {}", _containerid);
            DockerContainerManager dockerManager = new DockerContainerManager(machine);
            String _name = deletedElement.getName();
            boolean _containerNameExists = DockerObserver.this.containerNameExists(dockerManager, _name, machine);
            if (_containerNameExists) {
              String _containerid_1 = deletedElement.getContainerid();
              dockerManager.removeContainer(machine, _containerid_1);
            }
          }
          Object _oldValue_2 = notification.getOldValue();
          String _plus = ("Old value : " + _oldValue_2);
          DockerObserver.LOGGER.info(_plus);
          Object _newValue = notification.getNewValue();
          String _plus_1 = ("New value : " + _newValue);
          DockerObserver.LOGGER.info(_plus_1);
        }
      });
    return machine;
  }
  
  public Container listener(final Container container, final Machine machine) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method renameContainer(Machine, String, String) from the type DockerContainerManager refers to the missing type Object");
  }
  
  public String getContainerId(final String containerName, final Machine machine) {
    throw new Error("Unresolved compilation problems:"
      + "\ncom.github.dockerjava.api.model.Container cannot be resolved to a type."
      + "\nThe method listContainer(String) from the type DockerContainerManager refers to the missing type Container"
      + "\nnames cannot be resolved"
      + "\nget cannot be resolved"
      + "\nindexOf cannot be resolved"
      + "\n== cannot be resolved"
      + "\nreplaceAll cannot be resolved"
      + "\nsubstring cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nid cannot be resolved");
  }
  
  public boolean containerNameExists(final DockerContainerManager dockerContainerManager, final String containerName, final Machine machine) {
    String _name = machine.getName();
    return this.containerNameExists(dockerContainerManager, containerName, _name);
  }
  
  public boolean containerNameExists(final DockerContainerManager dockerContainerManager, final String containerName, final String machineName) {
    throw new Error("Unresolved compilation problems:"
      + "\ncom.github.dockerjava.api.model.Container cannot be resolved to a type."
      + "\nThe method listContainer(String) from the type DockerContainerManager refers to the missing type Container"
      + "\nnames cannot be resolved"
      + "\nget cannot be resolved"
      + "\nindexOf cannot be resolved"
      + "\n== cannot be resolved"
      + "\nreplaceAll cannot be resolved"
      + "\nsubstring cannot be resolved"
      + "\n+ cannot be resolved");
  }
}
