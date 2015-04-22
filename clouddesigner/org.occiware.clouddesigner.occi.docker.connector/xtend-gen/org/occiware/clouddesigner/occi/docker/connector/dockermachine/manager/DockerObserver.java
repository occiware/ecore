package org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager;

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
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.action.api.ObserverAction;

@SuppressWarnings("all")
public class DockerObserver {
  public static Machine_VirtualBox listener() {
    final Machine_VirtualBox vbox = DockerFactory.eINSTANCE.createMachine_VirtualBox();
    EList<Adapter> _eAdapters = vbox.eAdapters();
    _eAdapters.add(
      new EContentAdapter() {
        public void notifyChanged(final Notification notification) {
          Object _oldValue = notification.getOldValue();
          String _plus = ("Ancienne Valeur : " + _oldValue);
          InputOutput.<String>println(_plus);
          Object _newValue = notification.getNewValue();
          String _plus_1 = ("Nouvelle Valeur : " + _newValue);
          InputOutput.<String>println(_plus_1);
          Object _notifier = notification.getNotifier();
          final Machine_VirtualBox m = ((Machine_VirtualBox) _notifier);
          float _memory = m.getMemory();
          String _plus_2 = ("La memoire" + Float.valueOf(_memory));
          InputOutput.<String>println(_plus_2);
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
        }
      });
    return machine;
  }
  
  /**
   * TODO implements interface Action with classes ActionVBOX, ActionGoogle, etc ...
   */
  public Machine listener(final Machine machine, final ObserverAction action) {
    Machine _copy = EcoreUtil.<Machine>copy(machine);
    final Machine cpMachine = ((Machine) _copy);
    EList<Adapter> _eAdapters = machine.eAdapters();
    _eAdapters.add(
      new EContentAdapter() {
        public void notifyChanged(final Notification notification) {
          Object _notifier = notification.getNotifier();
          final Machine newmachine = ((Machine) _notifier);
          Machine machine = cpMachine;
        }
      });
    return machine;
  }
  
  public Container listener(final Container container, final ObserverAction action) {
    EList<Adapter> _eAdapters = container.eAdapters();
    _eAdapters.add(
      new EContentAdapter() {
        public void notifyChanged(final Notification notification) {
          Object _oldValue = notification.getOldValue();
          String _plus = ("Ancienne Valeur : " + _oldValue);
          InputOutput.<String>println(_plus);
          Object _newValue = notification.getNewValue();
          String _plus_1 = ("Nouvelle Valeur : " + _newValue);
          InputOutput.<String>println(_plus_1);
          Object _notifier = notification.getNotifier();
          final Container container = ((Container) _notifier);
        }
      });
    return container;
  }
}
