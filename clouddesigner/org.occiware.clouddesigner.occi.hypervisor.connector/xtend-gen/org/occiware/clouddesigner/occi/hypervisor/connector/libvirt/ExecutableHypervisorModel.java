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
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.libvirt.Connect;
import org.libvirt.ConnectAuth;
import org.libvirt.Domain;
import org.libvirt.DomainInfo;
import org.libvirt.LibvirtException;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.hypervisor.HypervisorFactory;
import org.occiware.clouddesigner.occi.hypervisor.Machine;
import org.occiware.clouddesigner.occi.hypervisor.Machine_VirtualBox;
import org.occiware.clouddesigner.occi.hypervisor.connector.libvirt.ExecutableMachine_VirtualBox;
import org.occiware.clouddesigner.occi.hypervisor.connector.libvirt.util.CustomsConnectAuth;
import org.occiware.clouddesigner.occi.hypervisor.connector.libvirt.util.DomainMarshaller;
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class ExecutableHypervisorModel {
  private static Logger LOGGER = LoggerFactory.getLogger(ExecutableHypervisorModel.class);
  
  public Machine machine;
  
  public Configuration configuration;
  
  public Machine_VirtualBox machine_VirtualBox;
  
  public ExecutableHypervisorModel() {
  }
  
  public ExecutableHypervisorModel(final Machine machine) {
    this.machine = machine;
    if ((machine instanceof Machine_VirtualBox)) {
      this.machine_VirtualBox = ((Machine_VirtualBox)machine);
    }
  }
  
  public ExecutableHypervisorModel(final Configuration configuration) {
    this.configuration = configuration;
  }
  
  public void start() {
    boolean _notEquals = (!Objects.equal(this.machine_VirtualBox, null));
    if (_notEquals) {
      this.machine_VirtualBox.start();
      return;
    }
    boolean _notEquals_1 = (!Objects.equal(this.machine_VirtualBox, null));
    if (_notEquals_1) {
      this.machine_VirtualBox.start();
      return;
    }
  }
  
  public void stop() {
    boolean _notEquals = (!Objects.equal(this.machine_VirtualBox, null));
    if (_notEquals) {
      ((ExecutableMachine_VirtualBox) this.machine_VirtualBox).stop(StopMethod.GRACEFUL);
      return;
    }
  }
  
  public void restart() {
    boolean _notEquals = (!Objects.equal(this.machine_VirtualBox, null));
    if (_notEquals) {
      this.machine_VirtualBox.restart(RestartMethod.GRACEFUL);
      return;
    }
  }
  
  public void connectToVMWARE() {
    try {
      final int connectFlags = 0;
      final DomainMarshaller domainMarshaller = new DomainMarshaller();
      domainMarshaller.loadUri();
      Connect connection = null;
      final String libvirtURI = domainMarshaller.uri.get("vmware");
      boolean _notEquals = (!Objects.equal(libvirtURI, null));
      if (_notEquals) {
        ExecutableHypervisorModel.LOGGER.info("Hypervisor URI is: {}", libvirtURI);
        try {
          final ConnectAuth cAuth = new CustomsConnectAuth("!Scalair1!");
          Connect _connect = new Connect(libvirtURI, cAuth, connectFlags);
          connection = _connect;
          final String[] inactiveDomainNames = connection.listDefinedDomains();
          final int[] activeDomainIds = connection.listDomains();
          for (final String definedDomainName : inactiveDomainNames) {
            {
              InputOutput.<String>println(definedDomainName);
              final Domain inactiveDomain = connection.domainLookupByName(definedDomainName);
              String _name = inactiveDomain.getName();
              final boolean machineExistInModeler = this.containMachine(_name);
              if ((!machineExistInModeler)) {
                this.buildModel(inactiveDomain);
              }
            }
          }
          for (final int domainnId : activeDomainIds) {
            {
              InputOutput.<Integer>println(Integer.valueOf(domainnId));
              final Domain activeDomain = connection.domainLookupByID(domainnId);
              String _name = activeDomain.getName();
              final boolean machineExistInModeler = this.containMachine(_name);
              if ((!machineExistInModeler)) {
                this.buildModel(activeDomain);
              }
            }
          }
          connection.close();
        } catch (final Throwable _t) {
          if (_t instanceof LibvirtException) {
            final LibvirtException e = (LibvirtException)_t;
            ExecutableHypervisorModel.LOGGER.error("Exception caught: ", e);
            boolean _notEquals_1 = (!Objects.equal(connection, null));
            if (_notEquals_1) {
              connection.close();
            }
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void importModel() {
    try {
      final DomainMarshaller domainMarshaller = new DomainMarshaller();
      domainMarshaller.loadUri();
      Connect connection = null;
      final String libvirtURI = domainMarshaller.uri.get("vbox");
      boolean _notEquals = (!Objects.equal(libvirtURI, null));
      if (_notEquals) {
        ExecutableHypervisorModel.LOGGER.info("Hypervisor URI is: {}", libvirtURI);
        try {
          Connect _connect = new Connect(libvirtURI);
          connection = _connect;
          final String[] definedDomainNames = connection.listDefinedDomains();
          final int[] activeDomainIds = connection.listDomains();
          for (final String definedDomainName : definedDomainNames) {
            {
              InputOutput.<String>println(definedDomainName);
              final Domain inactiveDomain = connection.domainLookupByName(definedDomainName);
              String _name = inactiveDomain.getName();
              final boolean machineExistInModeler = this.containMachine(_name);
              if ((!machineExistInModeler)) {
                this.buildModel(inactiveDomain);
              }
            }
          }
          for (final int domainnId : activeDomainIds) {
            {
              InputOutput.<Integer>println(Integer.valueOf(domainnId));
              final Domain activeDomain = connection.domainLookupByID(domainnId);
              String _name = activeDomain.getName();
              final boolean machineExistInModeler = this.containMachine(_name);
              if ((!machineExistInModeler)) {
                this.buildModel(activeDomain);
              }
            }
          }
          connection.close();
        } catch (final Throwable _t) {
          if (_t instanceof LibvirtException) {
            final LibvirtException e = (LibvirtException)_t;
            ExecutableHypervisorModel.LOGGER.error("Exception caught: ", e);
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
  
  public void buildModel(final Domain domain) {
    Machine machine = this.getModel(domain);
    EList<Resource> _resources = this.configuration.getResources();
    _resources.add(machine);
  }
  
  public Machine getModel(final Domain domain) {
    Map<String, Machine> _modelEClass = this.getmodelEClass();
    Machine vbox = _modelEClass.get("virtualbox");
    if ((vbox instanceof Machine_VirtualBox)) {
      Machine_VirtualBox newvbox = ((Machine_VirtualBox) vbox);
      this.machineFactory_VBOX(newvbox, domain);
      ExecutableHypervisorModel.LOGGER.info(("Model setting: " + newvbox));
      return newvbox;
    }
    return null;
  }
  
  public void machineFactory_VBOX(final Machine_VirtualBox vbox, final Domain domain) {
    try {
      String _name = domain.getName();
      vbox.setName(_name);
      DomainInfo _info = domain.getInfo();
      String _name_1 = _info.state.name();
      InputOutput.<String>println(_name_1);
      DomainInfo _info_1 = domain.getInfo();
      vbox.setMemory(((float) _info_1.memory));
      DomainInfo _info_2 = domain.getInfo();
      vbox.setCores(_info_2.nrVirtCpu);
      DomainInfo _info_3 = domain.getInfo();
      String _name_2 = _info_3.state.name();
      boolean _equals = Objects.equal(_name_2, "VIR_DOMAIN_RUNNING");
      if (_equals) {
        ComputeStatus _get = ComputeStatus.get(0);
        vbox.setState(_get);
      }
      DomainInfo _info_4 = domain.getInfo();
      String _name_3 = _info_4.state.name();
      boolean _equals_1 = Objects.equal(_name_3, "VIR_DOMAIN_SHUTOFF");
      if (_equals_1) {
        ComputeStatus _get_1 = ComputeStatus.get(1);
        vbox.setState(_get_1);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public boolean containMachine(final String machineName) {
    EList<Resource> _resources = this.configuration.getResources();
    for (final Resource r : _resources) {
      if ((r instanceof Machine)) {
        String _name = ((Machine) r).getName();
        boolean _equals = Objects.equal(_name, machineName);
        if (_equals) {
          return true;
        }
      }
    }
    return false;
  }
  
  public Map<String, Machine> getmodelEClass() {
    final Map<String, Machine> m = new HashMap<String, Machine>();
    Machine_VirtualBox _createMachine_VirtualBox = HypervisorFactory.eINSTANCE.createMachine_VirtualBox();
    m.put("virtualbox", _createMachine_VirtualBox);
    return m;
  }
}
