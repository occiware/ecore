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
package org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.occiware.clouddesigner.occi.docker.Machine_OpenStack;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspect;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineOpenStackAspectMachine_OpenStackAspectProperties;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.Provider;

@Aspect(className = Machine_OpenStack.class)
@SuppressWarnings("all")
public class MachineOpenStackAspect extends MachineAspect {
  @OverrideAspectMethod
  public static String createMachineCommand(final Machine_OpenStack _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineOpenStackAspectMachine_OpenStackAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineOpenStackAspectMachine_OpenStackAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.occiware.clouddesigner.occi.docker.Machine_OpenStack){
    result = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineOpenStackAspect._privk3_createMachineCommand(_self_, (org.occiware.clouddesigner.occi.docker.Machine_OpenStack)_self);
    } else  if (_self instanceof org.occiware.clouddesigner.occi.docker.Machine){
    result = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspect.createMachineCommand((org.occiware.clouddesigner.occi.docker.Machine)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  public static void machineStartAll(final Machine_OpenStack _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineOpenStackAspectMachine_OpenStackAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineOpenStackAspectMachine_OpenStackAspectContext.getSelf(_self);
    _privk3_machineStartAll(_self_, _self);
  }
  
  public static void machineStart(final Machine_OpenStack _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineOpenStackAspectMachine_OpenStackAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineOpenStackAspectMachine_OpenStackAspectContext.getSelf(_self);
    _privk3_machineStart(_self_, _self);
  }
  
  protected static boolean isDeployed(final Machine_OpenStack _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineOpenStackAspectMachine_OpenStackAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineOpenStackAspectMachine_OpenStackAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_isDeployed(_self_, _self);
    return (boolean)result;
  }
  
  protected static void isDeployed(final Machine_OpenStack _self, final boolean isDeployed) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineOpenStackAspectMachine_OpenStackAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineOpenStackAspectMachine_OpenStackAspectContext.getSelf(_self);
    _privk3_isDeployed(_self_, _self,isDeployed);
  }
  
  private static String super_createMachineCommand(final Machine_OpenStack _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspectMachineAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspectMachineAspectContext.getSelf(_self);
    return  org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspect._privk3_createMachineCommand(_self_, _self);
  }
  
  protected static String _privk3_createMachineCommand(final MachineOpenStackAspectMachine_OpenStackAspectProperties _self_, final Machine_OpenStack _self) {
    StringBuilder command = new StringBuilder("docker-machine create --driver ");
    String _string = Provider.openstack.toString();
    command.append(_string);
    boolean _and = false;
    boolean _and_1 = false;
    boolean _and_2 = false;
    String _username = _self.getUsername();
    boolean _notEquals = (!Objects.equal(_username, null));
    if (!_notEquals) {
      _and_2 = false;
    } else {
      String _flavor_id = _self.getFlavor_id();
      boolean _notEquals_1 = (!Objects.equal(_flavor_id, null));
      _and_2 = _notEquals_1;
    }
    if (!_and_2) {
      _and_1 = false;
    } else {
      String _image_id = _self.getImage_id();
      boolean _notEquals_2 = (!Objects.equal(_image_id, null));
      _and_1 = _notEquals_2;
    }
    if (!_and_1) {
      _and = false;
    } else {
      String _password = _self.getPassword();
      boolean _notEquals_3 = (!Objects.equal(_password, null));
      _and = _notEquals_3;
    }
    if (_and) {
      String _name = _self.getName();
      String _plus = (" --openstack-username " + _name);
      command.append(_plus);
      String _password_1 = _self.getPassword();
      String _plus_1 = (" --openstack-password " + _password_1);
      command.append(_plus_1);
      String _image_id_1 = _self.getImage_id();
      String _plus_2 = (" --openstack-image-id " + _image_id_1);
      command.append(_plus_2);
      String _flavor_id_1 = _self.getFlavor_id();
      String _plus_3 = (" --openstack-flavor-id" + _flavor_id_1);
      command.append(_plus_3);
      String _auth_url = _self.getAuth_url();
      boolean _notEquals_4 = (!Objects.equal(_auth_url, null));
      if (_notEquals_4) {
        String _auth_url_1 = _self.getAuth_url();
        String _plus_4 = (" --openstack-auth-url " + _auth_url_1);
        command.append(_plus_4);
      }
      boolean _or = false;
      String _tenant_id = _self.getTenant_id();
      boolean _notEquals_5 = (!Objects.equal(_tenant_id, null));
      if (_notEquals_5) {
        _or = true;
      } else {
        String _tenant_name = _self.getTenant_name();
        boolean _notEquals_6 = (!Objects.equal(_tenant_name, null));
        _or = _notEquals_6;
      }
      if (_or) {
        String _xifexpression = null;
        String _tenant_id_1 = _self.getTenant_id();
        boolean _equals = Objects.equal(_tenant_id_1, null);
        if (_equals) {
          _xifexpression = _self.getTenant_id();
        } else {
          _xifexpression = _self.getTenant_id();
        }
        final String value = _xifexpression;
        command.append((" --openstack-tenant-name " + value));
      }
      String _region = _self.getRegion();
      boolean _notEquals_7 = (!Objects.equal(_region, null));
      if (_notEquals_7) {
        String _region_1 = _self.getRegion();
        String _plus_5 = (" --openstack-region " + _region_1);
        command.append(_plus_5);
      }
      String _endpoint_type = _self.getEndpoint_type();
      boolean _notEquals_8 = (!Objects.equal(_endpoint_type, null));
      if (_notEquals_8) {
        String _endpoint_type_1 = _self.getEndpoint_type();
        String _plus_6 = (" --openstack-endpoint-type " + _endpoint_type_1);
        command.append(_plus_6);
      }
      String _net_id = _self.getNet_id();
      boolean _notEquals_9 = (!Objects.equal(_net_id, null));
      if (_notEquals_9) {
        String _net_id_1 = _self.getNet_id();
        String _plus_7 = (" --openstack-net-id " + _net_id_1);
        command.append(_plus_7);
      }
      String _sec_groups = _self.getSec_groups();
      boolean _notEquals_10 = (!Objects.equal(_sec_groups, null));
      if (_notEquals_10) {
        String _sec_groups_1 = _self.getSec_groups();
        String _plus_8 = (" --openstack-sec-groups " + _sec_groups_1);
        command.append(_plus_8);
      }
      String _floatingip_pool = _self.getFloatingip_pool();
      boolean _notEquals_11 = (!Objects.equal(_floatingip_pool, null));
      if (_notEquals_11) {
        String _floatingip_pool_1 = _self.getFloatingip_pool();
        String _plus_9 = (" --openstack-floatingip-pool " + _floatingip_pool_1);
        command.append(_plus_9);
      }
    } else {
      boolean _or_1 = false;
      boolean _or_2 = false;
      boolean _or_3 = false;
      String _username_1 = _self.getUsername();
      boolean _equals_1 = Objects.equal(_username_1, null);
      if (_equals_1) {
        _or_3 = true;
      } else {
        String _flavor_id_2 = _self.getFlavor_id();
        boolean _equals_2 = Objects.equal(_flavor_id_2, null);
        _or_3 = _equals_2;
      }
      if (_or_3) {
        _or_2 = true;
      } else {
        String _image_id_2 = _self.getImage_id();
        boolean _equals_3 = Objects.equal(_image_id_2, null);
        _or_2 = _equals_3;
      }
      if (_or_2) {
        _or_1 = true;
      } else {
        String _password_2 = _self.getPassword();
        boolean _equals_4 = Objects.equal(_password_2, null);
        _or_1 = _equals_4;
      }
      if (_or_1) {
      }
    }
    return command.toString();
  }
  
  protected static void _privk3_machineStartAll(final MachineOpenStackAspectMachine_OpenStackAspectProperties _self_, final Machine_OpenStack _self) {
  }
  
  protected static void _privk3_machineStart(final MachineOpenStackAspectMachine_OpenStackAspectProperties _self_, final Machine_OpenStack _self) {
  }
  
  protected static boolean _privk3_isDeployed(final MachineOpenStackAspectMachine_OpenStackAspectProperties _self_, final Machine_OpenStack _self) {
     return _self_.isDeployed; 
  }
  
  protected static void _privk3_isDeployed(final MachineOpenStackAspectMachine_OpenStackAspectProperties _self_, final Machine_OpenStack _self, final boolean isDeployed) {
    _self_.isDeployed = isDeployed; try {
    
    			for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    				if (m.getName().equals("set" + "IsDeployed")
    						&& m.getParameterTypes().length == 1) {
    					m.invoke(_self, isDeployed);
    
    				}
    			}
    		} catch (Exception e) {
    			// Chut !
    		} 
  }
}
