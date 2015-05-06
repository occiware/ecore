package org.occiware.clouddesigner.occi.docker.design.services;

import org.eclipse.emf.ecore.EObject;
import org.occiware.clouddesigner.OCCI.Configuration;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.DockerFactory;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableDockerFactory;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableDockerModel;

@SuppressWarnings("all")
public class DockerServices {
  private final DockerFactory init = ExecutableDockerFactory.init();
  
  /**
   * Popup menu Start action.
   */
  public void start(final EObject eo) {
    if ((eo instanceof Machine)) {
      Machine machine = ((Machine) eo);
      final ExecutableDockerModel main = new ExecutableDockerModel(machine);
      main.start();
    } else {
      if ((eo instanceof Container)) {
        Container container = ((Container) eo);
        final ExecutableDockerModel main_1 = new ExecutableDockerModel(container);
        main_1.container.start();
      }
    }
  }
  
  /**
   * Popup menu importModel cation.
   */
  public void importModel(final Configuration conf) {
    final ExecutableDockerModel main = new ExecutableDockerModel(conf);
    main.importModel();
  }
  
  /**
   * Popum menu synchronize action.
   */
  public void synchronize(final EObject eo) {
    if ((eo instanceof Machine)) {
      Machine machine = ((Machine) eo);
      final ExecutableDockerModel main = new ExecutableDockerModel(machine);
      main.synchronize();
    }
  }
  
  /**
   * Popup menu StartAll action
   */
  public void startAll(final EObject eo) {
    if ((eo instanceof Machine)) {
      Machine machine = ((Machine) eo);
      final ExecutableDockerModel main = new ExecutableDockerModel(machine);
      main.startAll();
    }
  }
  
  /**
   * Popup menu stop action.
   */
  public void stop(final EObject eo) {
    if ((eo instanceof Machine)) {
      Machine machine = ((Machine) eo);
      final ExecutableDockerModel main = new ExecutableDockerModel(machine);
      main.stop();
    } else {
      if ((eo instanceof Container)) {
        Container container = ((Container) eo);
        final ExecutableDockerModel main_1 = new ExecutableDockerModel(container);
        main_1.stop();
      }
    }
  }
}
