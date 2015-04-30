package org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.occiware.clouddesigner.occi.docker.Machine_Digital_Ocean;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspect;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineDigitalOceanAspectMachine_Digital_OceanAspectProperties;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.Provider;

@Aspect(className = Machine_Digital_Ocean.class)
@SuppressWarnings("all")
public class MachineDigitalOceanAspect extends MachineAspect {
  @OverrideAspectMethod
  public static String createMachineCommand(final Machine_Digital_Ocean _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineDigitalOceanAspectMachine_Digital_OceanAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineDigitalOceanAspectMachine_Digital_OceanAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.occiware.clouddesigner.occi.docker.Machine_Digital_Ocean){
    result = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineDigitalOceanAspect._privk3_createMachineCommand(_self_, (org.occiware.clouddesigner.occi.docker.Machine_Digital_Ocean)_self);
    } else  if (_self instanceof org.occiware.clouddesigner.occi.docker.Machine){
    result = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspect.createMachineCommand((org.occiware.clouddesigner.occi.docker.Machine)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  public static void machineStartAll(final Machine_Digital_Ocean _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineDigitalOceanAspectMachine_Digital_OceanAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineDigitalOceanAspectMachine_Digital_OceanAspectContext.getSelf(_self);
    _privk3_machineStartAll(_self_, _self);
  }
  
  public static void machineStart(final Machine_Digital_Ocean _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineDigitalOceanAspectMachine_Digital_OceanAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineDigitalOceanAspectMachine_Digital_OceanAspectContext.getSelf(_self);
    _privk3_machineStart(_self_, _self);
  }
  
  protected static boolean isDeployed(final Machine_Digital_Ocean _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineDigitalOceanAspectMachine_Digital_OceanAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineDigitalOceanAspectMachine_Digital_OceanAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_isDeployed(_self_, _self);
    return (boolean)result;
  }
  
  protected static void isDeployed(final Machine_Digital_Ocean _self, final boolean isDeployed) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineDigitalOceanAspectMachine_Digital_OceanAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineDigitalOceanAspectMachine_Digital_OceanAspectContext.getSelf(_self);
    _privk3_isDeployed(_self_, _self,isDeployed);
  }
  
  private static String super_createMachineCommand(final Machine_Digital_Ocean _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspectMachineAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspectMachineAspectContext.getSelf(_self);
    return  org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspect._privk3_createMachineCommand(_self_, _self);
  }
  
  protected static String _privk3_createMachineCommand(final MachineDigitalOceanAspectMachine_Digital_OceanAspectProperties _self_, final Machine_Digital_Ocean _self) {
    StringBuilder command = new StringBuilder("docker-machine create --driver ");
    String _string = Provider.digitalocean.toString();
    command.append(_string);
    boolean _and = false;
    String _name = _self.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (!_notEquals) {
      _and = false;
    } else {
      String _access_token = _self.getAccess_token();
      boolean _notEquals_1 = (!Objects.equal(_access_token, null));
      _and = _notEquals_1;
    }
    if (_and) {
      String _name_1 = _self.getName();
      String _plus = (" " + _name_1);
      command.append(_plus);
      String _access_token_1 = _self.getAccess_token();
      String _plus_1 = (" --digitalocean-access-token=" + _access_token_1);
      command.append(_plus_1);
      String _image = _self.getImage();
      boolean _notEquals_2 = (!Objects.equal(_image, null));
      if (_notEquals_2) {
        String _image_1 = _self.getImage();
        String _plus_2 = (" --digitalocean-image " + _image_1);
        command.append(_plus_2);
      }
      String _region = _self.getRegion();
      boolean _notEquals_3 = (!Objects.equal(_region, null));
      if (_notEquals_3) {
        String _region_1 = _self.getRegion();
        String _plus_3 = (" --digitalocean-region " + _region_1);
        command.append(_plus_3);
      }
      String _size = _self.getSize();
      boolean _notEquals_4 = (!Objects.equal(_size, null));
      if (_notEquals_4) {
        String _size_1 = _self.getSize();
        String _plus_4 = (" --digitalocean-size " + _size_1);
        command.append(_plus_4);
      }
    } else {
      boolean _or = false;
      String _name_2 = _self.getName();
      boolean _equals = Objects.equal(_name_2, null);
      if (_equals) {
        _or = true;
      } else {
        String _access_token_2 = _self.getAccess_token();
        boolean _equals_1 = Objects.equal(_access_token_2, null);
        _or = _equals_1;
      }
      if (_or) {
      }
    }
    return command.toString();
  }
  
  protected static void _privk3_machineStartAll(final MachineDigitalOceanAspectMachine_Digital_OceanAspectProperties _self_, final Machine_Digital_Ocean _self) {
  }
  
  protected static void _privk3_machineStart(final MachineDigitalOceanAspectMachine_Digital_OceanAspectProperties _self_, final Machine_Digital_Ocean _self) {
  }
  
  protected static boolean _privk3_isDeployed(final MachineDigitalOceanAspectMachine_Digital_OceanAspectProperties _self_, final Machine_Digital_Ocean _self) {
     return _self_.isDeployed; 
  }
  
  protected static void _privk3_isDeployed(final MachineDigitalOceanAspectMachine_Digital_OceanAspectProperties _self_, final Machine_Digital_Ocean _self, final boolean isDeployed) {
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
