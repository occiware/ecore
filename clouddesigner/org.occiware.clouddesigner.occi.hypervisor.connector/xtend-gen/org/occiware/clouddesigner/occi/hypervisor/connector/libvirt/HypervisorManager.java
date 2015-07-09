/**
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	- Fawaz PARAISO
 * 	- Philippe MERELE
 */
package org.occiware.clouddesigner.occi.hypervisor.connector.libvirt;

import com.google.common.base.Objects;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.libvirt.Connect;
import org.occiware.clouddesigner.occi.hypervisor.Machine;
import org.occiware.clouddesigner.occi.hypervisor.connector.generated.Domain;
import org.occiware.clouddesigner.occi.hypervisor.connector.libvirt.ComputeStateMachine;
import org.occiware.clouddesigner.occi.hypervisor.connector.libvirt.util.DomainMarshaller;
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class implements an abstract Libvirt node manager.
 */
@SuppressWarnings("all")
public abstract class HypervisorManager extends ComputeStateMachine<Machine> {
  private static Logger LOGGER = LoggerFactory.getLogger(HypervisorManager.class);
  
  /**
   * Construct a  machine manager for a given  machine.
   */
  public HypervisorManager(final Machine m) {
    super(m);
  }
  
  /**
   * Return the  machine driver name.
   */
  public abstract String getDriver();
  
  /**
   * Append specific libvirt hypervisor driver parameters.
   */
  public abstract void appendHypervisorParameters(final String sb);
  
  /**
   * Start Libvirt node.
   */
  @Override
  public void start_execute() {
    final DomainMarshaller domainMarshaller = new DomainMarshaller();
    domainMarshaller.loadUri();
    Connect connection = null;
    String _driver = this.getDriver();
    final String libvirtURI = domainMarshaller.uri.get(_driver);
    boolean _notEquals = (!Objects.equal(libvirtURI, null));
    if (_notEquals) {
      HypervisorManager.LOGGER.info("Hypervisor URI is: {}", libvirtURI);
      try {
        Connect _connect = new Connect(libvirtURI);
        connection = _connect;
        final Domain vmDomain = domainMarshaller.createComputeDescription(this.compute);
        String _uuid = vmDomain.getUuid();
        String domainDescription = domainMarshaller.asString(_uuid);
        HypervisorManager.LOGGER.info(("Domain description: " + domainDescription));
        final org.libvirt.Domain domain = connection.domainDefineXML(domainDescription);
        String _uUIDString = domain.getUUIDString();
        HypervisorManager.LOGGER.debug("VM with id {} is created.", _uUIDString);
        domain.create();
        String _id = this.compute.getId();
        HypervisorManager.LOGGER.info("VM with id {} is running.", _id);
        HypervisorManager.LOGGER.debug("closing connection to libvirt");
        connection.close();
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
          HypervisorManager.LOGGER.error("Error while processing. ", e);
          this.compute.setState(ComputeStatus.INACTIVE);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
  }
  
  /**
   * Stop a libvirt node.
   */
  @Override
  public void stop_execute(final StopMethod method) {
    final DomainMarshaller domainMarshaller = new DomainMarshaller();
    domainMarshaller.loadUri();
    Connect connection = null;
    String _driver = this.getDriver();
    final String libvirtURI = domainMarshaller.uri.get(_driver);
    boolean _notEquals = (!Objects.equal(libvirtURI, null));
    if (_notEquals) {
      HypervisorManager.LOGGER.info("Hypervisor URI is: {}", libvirtURI);
      try {
        Connect _connect = new Connect(libvirtURI);
        connection = _connect;
        String _uuid = this.compute.getUuid();
        final org.libvirt.Domain domain = connection.domainLookupByUUIDString(_uuid);
        String _id = this.compute.getId();
        HypervisorManager.LOGGER.debug("going to shutdown vm {} through acpi-event", _id);
        boolean _equals = Objects.equal(method, StopMethod.GRACEFUL);
        if (_equals) {
          domain.shutdown();
        }
        boolean _equals_1 = Objects.equal(method, StopMethod.POWEROFF);
        if (_equals_1) {
          domain.destroy();
        }
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
          HypervisorManager.LOGGER.error("Exception caught: ", e);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    String _hostname = this.compute.getHostname();
    String _plus = ("EXECUTE COMMAND:  machine stop " + _hostname);
    InputOutput.<String>println(_plus);
  }
  
  /**
   * Restart a libvirt node.
   */
  @Override
  public void restart_execute(final RestartMethod method) {
    String _hostname = this.compute.getHostname();
    String _plus = ("EXECUTE COMMAND:  machine restart " + _hostname);
    InputOutput.<String>println(_plus);
  }
  
  /**
   * Suspend a libvirt node.
   */
  @Override
  public void suspend_execute(final SuspendMethod method) {
    String _hostname = this.compute.getHostname();
    String _plus = ("EXECUTE COMMAND:  machine suspend " + _hostname);
    InputOutput.<String>println(_plus);
  }
}
