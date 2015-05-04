/**
 * This file contains the OCCIware Docker connector.
 * 
 * This connector implements the causal link, i.e. synchronization, between Docker models and Docker engines.
 * 
 * Copyright 2015 - Inria
 * 
 * Contributors:
 * - Philippe Merle - Inria
 */
package org.occiware.clouddesigner.occi.docker.connector;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.occiware.clouddesigner.OCCI.Link;
import org.occiware.clouddesigner.OCCI.Resource;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.Contains;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.connector.ComputeStateMachine;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;

/**
 * This class implements an abstract Docker machine manager.
 */
@SuppressWarnings("all")
public abstract class MachineManager extends ComputeStateMachine<Machine> {
  /**
   * Construct a Docker machine manager for a given Docker machine.
   */
  public MachineManager(final Machine m) {
    super(m);
  }
  
  /**
   * Return the Docker machine driver name.
   */
  public abstract String getDriverName();
  
  /**
   * Append specific Docker machine driver parameters.
   */
  public abstract void appendDriverParameters(final StringBuilder sb);
  
  /**
   * Start a Docker machine.
   */
  @Override
  public void start_execute() {
    final StringBuilder command = new StringBuilder();
    StringBuilder _append = command.append("docker machine start ");
    String _name = this.compute.getName();
    StringBuilder _append_1 = _append.append(_name);
    StringBuilder _append_2 = _append_1.append(" --driver ");
    String _driverName = this.getDriverName();
    StringBuilder _append_3 = _append_2.append(_driverName);
    _append_3.append(" ");
    this.appendDriverParameters(command);
    String _string = command.toString();
    String _plus = ("EXECUTE COMMAND: " + _string);
    System.out.println(_plus);
    EList<Link> _links = this.compute.getLinks();
    for (final Link link : _links) {
      if ((link instanceof Link)) {
        final Contains contains = ((Contains) link);
        Resource _target = contains.getTarget();
        if ((_target instanceof Container)) {
          Resource _target_1 = contains.getTarget();
          final Container container = ((Container) _target_1);
          container.start();
        }
      }
    }
  }
  
  /**
   * Stop a Docker machine.
   */
  @Override
  public void stop_execute(final StopMethod method) {
    boolean _equals = Objects.equal(method, StopMethod.GRACEFUL);
    if (_equals) {
      EList<Link> _links = this.compute.getLinks();
      for (final Link link : _links) {
        if ((link instanceof Link)) {
          final Contains contains = ((Contains) link);
          Resource _target = contains.getTarget();
          if ((_target instanceof Container)) {
            Resource _target_1 = contains.getTarget();
            final Container container = ((Container) _target_1);
            container.stop(StopMethod.GRACEFUL);
          }
        }
      }
    }
    String _name = this.compute.getName();
    String _plus = ("EXECUTE COMMAND: docker machine stop " + _name);
    System.out.println(_plus);
  }
  
  /**
   * Restart a Docker machine.
   */
  @Override
  public void restart_execute(final RestartMethod method) {
    String _name = this.compute.getName();
    String _plus = ("EXECUTE COMMAND: docker machine restart " + _name);
    System.out.println(_plus);
  }
  
  /**
   * Suspend a Docker machine.
   */
  @Override
  public void suspend_execute(final SuspendMethod method) {
    String _name = this.compute.getName();
    String _plus = ("EXECUTE COMMAND: docker machine suspend " + _name);
    System.out.println(_plus);
  }
}
