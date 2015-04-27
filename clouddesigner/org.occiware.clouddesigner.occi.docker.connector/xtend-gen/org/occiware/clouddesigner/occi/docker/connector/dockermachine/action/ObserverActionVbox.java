package org.occiware.clouddesigner.occi.docker.connector.dockermachine.action;

import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.action.api.ObserverAction;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerMachineManager;

@SuppressWarnings("all")
public class ObserverActionVbox implements ObserverAction {
  public void apply(final Machine machine) {
    Machine_VirtualBox vbox = ((Machine_VirtualBox) machine);
    Runtime _runtime = Runtime.getRuntime();
    String _name = vbox.getName();
    DockerMachineManager.stopCmd(_runtime, _name);
    Runtime _runtime_1 = Runtime.getRuntime();
    String _name_1 = vbox.getName();
    DockerMachineManager.removeCmd(_runtime_1, _name_1);
    Runtime _runtime_2 = Runtime.getRuntime();
    DockerMachineManager.createHostCmd(_runtime_2, vbox);
  }
}
