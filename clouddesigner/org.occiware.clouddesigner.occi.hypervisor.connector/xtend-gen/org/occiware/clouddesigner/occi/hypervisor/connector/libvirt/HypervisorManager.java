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
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.libvirt.Connect;
import org.libvirt.LibvirtException;
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
    try {
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
          List<String> _listMachines = this.listMachines();
          String _name = this.compute.getName();
          boolean _contains = _listMachines.contains(_name);
          if (_contains) {
            String _name_1 = this.compute.getName();
            final org.libvirt.Domain domain = connection.domainLookupByName(_name_1);
            domain.create();
            String _uUIDString = domain.getUUIDString();
            HypervisorManager.LOGGER.debug("VM with id {} is started.", _uUIDString);
            String _id = this.compute.getId();
            HypervisorManager.LOGGER.info("VM with id {} is running.", _id);
          } else {
            final org.libvirt.Domain domain_1 = connection.domainDefineXML(domainDescription);
            domain_1.create();
            String _uUIDString_1 = domain_1.getUUIDString();
            HypervisorManager.LOGGER.debug("VM with id {} is created.", _uUIDString_1);
            String _id_1 = this.compute.getId();
            HypervisorManager.LOGGER.info("VM with id {} is running.", _id_1);
          }
          HypervisorManager.LOGGER.debug("closing connection to libvirt");
          connection.close();
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            final Exception e = (Exception)_t;
            HypervisorManager.LOGGER.error("Error while processing. ", e);
            this.compute.setState(ComputeStatus.INACTIVE);
            connection.close();
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Stop a libvirt node.
   */
  @Override
  public void stop_execute(final StopMethod method) {
    try {
      final DomainMarshaller domainMarshaller = new DomainMarshaller();
      domainMarshaller.loadUri();
      Connect connection = null;
      String _driver = this.getDriver();
      final String libvirtURI = domainMarshaller.uri.get(_driver);
      boolean _notEquals = (!Objects.equal(libvirtURI, null));
      if (_notEquals) {
        HypervisorManager.LOGGER.info("Hypervisor URI is: {}", libvirtURI);
        try {
          org.libvirt.Domain domain = null;
          Connect _connect = new Connect(libvirtURI);
          connection = _connect;
          List<String> _listMachines = this.listMachines();
          String _name = this.compute.getName();
          boolean _contains = _listMachines.contains(_name);
          if (_contains) {
            String _name_1 = this.compute.getName();
            org.libvirt.Domain _domainLookupByName = connection.domainLookupByName(_name_1);
            domain = _domainLookupByName;
            boolean _equals = Objects.equal(method, StopMethod.GRACEFUL);
            if (_equals) {
              domain.shutdown();
            }
            boolean _equals_1 = Objects.equal(method, StopMethod.POWEROFF);
            if (_equals_1) {
              domain.destroy();
            }
            String _uUIDString = domain.getUUIDString();
            HypervisorManager.LOGGER.debug("VM with id {} is stopped.", _uUIDString);
            String _id = this.compute.getId();
            HypervisorManager.LOGGER.info("VM with id {} is going down.", _id);
          } else {
            String _uuid = this.compute.getUuid();
            org.libvirt.Domain _domainLookupByUUIDString = connection.domainLookupByUUIDString(_uuid);
            domain = _domainLookupByUUIDString;
            String _id_1 = this.compute.getId();
            HypervisorManager.LOGGER.debug("going to shutdown vm {} through acpi-event", _id_1);
            boolean _equals_2 = Objects.equal(method, StopMethod.GRACEFUL);
            if (_equals_2) {
              domain.shutdown();
            }
            boolean _equals_3 = Objects.equal(method, StopMethod.POWEROFF);
            if (_equals_3) {
              domain.destroy();
            }
          }
          connection.close();
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            final Exception e = (Exception)_t;
            HypervisorManager.LOGGER.error("Exception caught: ", e);
            connection.close();
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
      String _hostname = this.compute.getHostname();
      String _plus = ("EXECUTE COMMAND:  machine stop " + _hostname);
      InputOutput.<String>println(_plus);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Restart a libvirt node.
   */
  @Override
  public void restart_execute(final RestartMethod method) {
    String _hostname = this.compute.getHostname();
    String _plus = ("EXECUTE COMMAND:  machine restart " + _hostname);
    InputOutput.<String>println(_plus);
    this.stop_execute(StopMethod.GRACEFUL);
    this.start_execute();
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
  
  public List<String> listMachines() {
    try {
      final ArrayList<String> listMachines = CollectionLiterals.<String>newArrayList();
      final DomainMarshaller domainMarshaller = new DomainMarshaller();
      domainMarshaller.loadUri();
      Connect connection = null;
      final String libvirtURI = domainMarshaller.uri.get("vbox");
      boolean _notEquals = (!Objects.equal(libvirtURI, null));
      if (_notEquals) {
        HypervisorManager.LOGGER.info("Hypervisor URI is: {}", libvirtURI);
        try {
          Connect _connect = new Connect(libvirtURI);
          connection = _connect;
          final String[] definedDomainNames = connection.listDefinedDomains();
          final int[] activeDomainIds = connection.listDomains();
          for (final String definedDomainName : definedDomainNames) {
            {
              InputOutput.<String>println(definedDomainName);
              final org.libvirt.Domain inactiveDomain = connection.domainLookupByName(definedDomainName);
              String _name = inactiveDomain.getName();
              listMachines.add(_name);
            }
          }
          for (final int domainnId : activeDomainIds) {
            {
              InputOutput.<Integer>println(Integer.valueOf(domainnId));
              final org.libvirt.Domain activeDomain = connection.domainLookupByID(domainnId);
              String _name = activeDomain.getName();
              listMachines.add(_name);
            }
          }
          connection.close();
        } catch (final Throwable _t) {
          if (_t instanceof LibvirtException) {
            final LibvirtException e = (LibvirtException)_t;
            HypervisorManager.LOGGER.error("Exception caught: ", e);
            connection.close();
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
      return listMachines;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
