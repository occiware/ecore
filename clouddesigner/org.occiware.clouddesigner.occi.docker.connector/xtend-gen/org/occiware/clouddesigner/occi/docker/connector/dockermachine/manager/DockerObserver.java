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
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.occiware.clouddesigner.occi.docker.DockerFactory;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox;
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
          InputOutput.<String>println("<-------------------------Attention on veut me modifier -------------------------->\n\n\n\n\n\n\n\n");
        }
      });
    return machine;
  }
}
