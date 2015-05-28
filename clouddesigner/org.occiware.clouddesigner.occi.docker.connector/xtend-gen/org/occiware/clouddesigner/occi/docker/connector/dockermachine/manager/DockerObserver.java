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

import java.util.List;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.DockerFactory;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableContainer;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.DockerContainerManager;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.cgroup.CPUManager;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.cgroup.MemoryManager;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerMachineManager;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class DockerObserver {
  private static Logger LOGGER = LoggerFactory.getLogger(DockerObserver.class);
  
  public static Machine_VirtualBox listener() {
    final Machine_VirtualBox vbox = DockerFactory.eINSTANCE.createMachine_VirtualBox();
    EList<Adapter> _eAdapters = vbox.eAdapters();
    _eAdapters.add(
      new EContentAdapter() {
        public void notifyChanged(final Notification notification) {
          Object _oldValue = notification.getOldValue();
          String _plus = ("Ancienne Valeur : " + _oldValue);
          DockerObserver.LOGGER.info(_plus);
          Object _newValue = notification.getNewValue();
          String _plus_1 = ("Nouvelle Valeur : " + _newValue);
          DockerObserver.LOGGER.info(_plus_1);
          Object _notifier = notification.getNotifier();
          final Machine_VirtualBox m = ((Machine_VirtualBox) _notifier);
          float _memory = m.getMemory();
          String _plus_2 = ("La memoire" + Float.valueOf(_memory));
          DockerObserver.LOGGER.info(_plus_2);
        }
      });
    return vbox;
  }
  
  public Machine listener(final Machine machine) {
    Machine _copy = EcoreUtil.<Machine>copy(machine);
    final Machine cpMachine = ((Machine) _copy);
    EList<Adapter> _eAdapters = machine.eAdapters();
    _eAdapters.add(
      new EContentAdapter() {
        public void notifyChanged(final Notification notification) {
          Machine machine = cpMachine;
          InputOutput.<String>println(
            "<-------------------------Attention on veut me modifier -------------------------->\n\n\n\n\n\n\n\n");
        }
      });
    return machine;
  }
  
  public Container listener(final Container container, final Machine machine) {
    Container _copy = EcoreUtil.<Container>copy(container);
    final ExecutableContainer cpContainer = ((ExecutableContainer) _copy);
    String _name = machine.getName();
    String _env = DockerUtil.getEnv(_name);
    String _plus = (_env + "/");
    final String privateKey = (_plus + "id_rsa");
    Runtime _runtime = Runtime.getRuntime();
    String _name_1 = machine.getName();
    final String host = DockerMachineManager.ipCmd(_runtime, _name_1);
    EList<Adapter> _eAdapters = container.eAdapters();
    _eAdapters.add(
      new EContentAdapter() {
        public void notifyChanged(final Notification notification) {
          InputOutput.<String>println("<-------------------------The Container has Changed -------------------------->\n\n\n\n\n\n\n\n");
          Object _notifier = notification.getNotifier();
          Container newContainer = ((Container) _notifier);
          int _cores = container.getCores();
          String _plus = ("CPU: " + Integer.valueOf(_cores));
          InputOutput.<String>println(_plus);
          int _cores_1 = cpContainer.getCores();
          String _plus_1 = ("CPU1: " + Integer.valueOf(_cores_1));
          InputOutput.<String>println(_plus_1);
          int _cores_2 = newContainer.getCores();
          String _plus_2 = ("CPU2: " + Integer.valueOf(_cores_2));
          InputOutput.<String>println(_plus_2);
          String _name = newContainer.getName();
          final String containerId = DockerObserver.this.getcontainerId(_name, machine);
          int _cores_3 = cpContainer.getCores();
          int _cores_4 = newContainer.getCores();
          boolean _equals = Integer.valueOf(_cores_3).equals(Integer.valueOf(_cores_4));
          boolean _not = (!_equals);
          if (_not) {
            final CPUManager cpuManager = new CPUManager();
            int _cores_5 = newContainer.getCores();
            String _valueOf = String.valueOf(_cores_5);
            cpuManager.setCPUValue(host, privateKey, containerId, _valueOf);
          }
          float _memory = cpContainer.getMemory();
          float _memory_1 = newContainer.getMemory();
          boolean _equals_1 = Float.valueOf(_memory).equals(Float.valueOf(_memory_1));
          boolean _not_1 = (!_equals_1);
          if (_not_1) {
            final MemoryManager memoryManager = new MemoryManager();
            float _memory_2 = newContainer.getMemory();
            String _valueOf_1 = String.valueOf(_memory_2);
            memoryManager.setMemValue(host, privateKey, containerId, _valueOf_1);
          }
        }
      });
    return container;
  }
  
  public String getcontainerId(final String containerName, final Machine machine) {
    final DockerContainerManager dockerContainerManager = new DockerContainerManager();
    final List<com.github.dockerjava.api.model.Container> listContainers = dockerContainerManager.listContainer(machine);
    for (final com.github.dockerjava.api.model.Container c : listContainers) {
      {
        String contName = null;
        String[] _names = c.getNames();
        final String name = _names[0];
        final String linkName = "LinkTo";
        final int index = name.indexOf(linkName);
        if ((index == (-1))) {
          String _replaceAll = name.replaceAll("/", "");
          contName = _replaceAll;
        } else {
          int _length = linkName.length();
          int _plus = (index + _length);
          String _substring = name.substring(_plus);
          contName = _substring;
        }
        boolean _equalsIgnoreCase = contName.equalsIgnoreCase(containerName);
        if (_equalsIgnoreCase) {
          return c.getId();
        }
      }
    }
    return null;
  }
}
