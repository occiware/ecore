package org.occiware.clouddesigner.occi.docker.design.services;

import org.eclipse.emf.ecore.EObject;
import org.occiware.clouddesigner.OCCI.Configuration;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspect;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.DockerAspect;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspect;

@SuppressWarnings("all")
public class DockerService {
  public DockerAspect instanceAspect;
  
  public void start(final EObject eo) {
    if ((eo instanceof Machine)) {
      Machine machine = ((Machine) eo);
      DockerAspect _dockerAspect = new DockerAspect(machine);
      this.instanceAspect = _dockerAspect;
      this.instanceAspect.start();
    } else {
      if ((eo instanceof Container)) {
        Container container = ((Container) eo);
        DockerAspect _dockerAspect_1 = new DockerAspect(container);
        this.instanceAspect = _dockerAspect_1;
        ContainerAspect.containerStart(this.instanceAspect.container);
      }
    }
  }
  
  public void importModel(final Configuration conf) {
    DockerAspect _dockerAspect = new DockerAspect(conf);
    this.instanceAspect = _dockerAspect;
    this.instanceAspect.importModel();
  }
  
  public void synchronize(final EObject eo) {
    if ((eo instanceof Machine)) {
      Machine machine = ((Machine) eo);
      DockerAspect _dockerAspect = new DockerAspect(machine);
      this.instanceAspect = _dockerAspect;
      this.instanceAspect.synchronize();
    }
  }
  
  public void startAll(final EObject eo) {
    if ((eo instanceof Machine)) {
      Machine machine = ((Machine) eo);
      DockerAspect _dockerAspect = new DockerAspect(machine);
      this.instanceAspect = _dockerAspect;
      this.instanceAspect.startAll();
    }
  }
  
  public void stop(final EObject eo) {
    if ((eo instanceof Machine)) {
      Machine machine = ((Machine) eo);
      DockerAspect _dockerAspect = new DockerAspect(machine);
      this.instanceAspect = _dockerAspect;
      MachineVirtualBoxAspect.machineStop(this.instanceAspect.machine_VirtualBox);
    } else {
      if ((eo instanceof Container)) {
        Container container = ((Container) eo);
        DockerAspect _dockerAspect_1 = new DockerAspect(container);
        this.instanceAspect = _dockerAspect_1;
        ContainerAspect.containerStop(this.instanceAspect.container);
      }
    }
  }
}
