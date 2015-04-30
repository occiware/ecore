package org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspect;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineGoogleComputeEngineAspectMachine_Google_Compute_EngineAspectProperties;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.Provider;

@Aspect(className = Machine_Google_Compute_Engine.class)
@SuppressWarnings("all")
public class MachineGoogleComputeEngineAspect extends MachineAspect {
  @OverrideAspectMethod
  public static String createMachineCommand(final Machine_Google_Compute_Engine _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineGoogleComputeEngineAspectMachine_Google_Compute_EngineAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineGoogleComputeEngineAspectMachine_Google_Compute_EngineAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine){
    result = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineGoogleComputeEngineAspect._privk3_createMachineCommand(_self_, (org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine)_self);
    } else  if (_self instanceof org.occiware.clouddesigner.occi.docker.Machine){
    result = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspect.createMachineCommand((org.occiware.clouddesigner.occi.docker.Machine)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  public static void machineStartAll(final Machine_Google_Compute_Engine _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineGoogleComputeEngineAspectMachine_Google_Compute_EngineAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineGoogleComputeEngineAspectMachine_Google_Compute_EngineAspectContext.getSelf(_self);
    _privk3_machineStartAll(_self_, _self);
  }
  
  public static void machineStart(final Machine_Google_Compute_Engine _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineGoogleComputeEngineAspectMachine_Google_Compute_EngineAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineGoogleComputeEngineAspectMachine_Google_Compute_EngineAspectContext.getSelf(_self);
    _privk3_machineStart(_self_, _self);
  }
  
  protected static boolean isDeployed(final Machine_Google_Compute_Engine _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineGoogleComputeEngineAspectMachine_Google_Compute_EngineAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineGoogleComputeEngineAspectMachine_Google_Compute_EngineAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_isDeployed(_self_, _self);
    return (boolean)result;
  }
  
  protected static void isDeployed(final Machine_Google_Compute_Engine _self, final boolean isDeployed) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineGoogleComputeEngineAspectMachine_Google_Compute_EngineAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineGoogleComputeEngineAspectMachine_Google_Compute_EngineAspectContext.getSelf(_self);
    _privk3_isDeployed(_self_, _self,isDeployed);
  }
  
  private static String super_createMachineCommand(final Machine_Google_Compute_Engine _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspectMachineAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspectMachineAspectContext.getSelf(_self);
    return  org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspect._privk3_createMachineCommand(_self_, _self);
  }
  
  protected static String _privk3_createMachineCommand(final MachineGoogleComputeEngineAspectMachine_Google_Compute_EngineAspectProperties _self_, final Machine_Google_Compute_Engine _self) {
    StringBuilder command = new StringBuilder("docker-machine create --driver ");
    String _string = Provider.google.toString();
    command.append(_string);
    String _name = _self.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      String _instance_name = _self.getInstance_name();
      String _plus = (" --google-instance-name " + _instance_name);
      command.append(_plus);
      String _zone = _self.getZone();
      boolean _notEquals_1 = (!Objects.equal(_zone, null));
      if (_notEquals_1) {
        command.append("");
      }
      String _username = _self.getUsername();
      boolean _notEquals_2 = (!Objects.equal(_username, null));
      if (_notEquals_2) {
        String _name_1 = _self.getName();
        String _plus_1 = (" --google-username " + _name_1);
        command.append(_plus_1);
      }
      String _project = _self.getProject();
      boolean _notEquals_3 = (!Objects.equal(_project, null));
      if (_notEquals_3) {
        String _name_2 = _self.getName();
        String _plus_2 = (" --google-project " + _name_2);
        command.append(_plus_2);
      }
      String _machine_type = _self.getMachine_type();
      boolean _notEquals_4 = (!Objects.equal(_machine_type, null));
      if (_notEquals_4) {
        String _machine_type_1 = _self.getMachine_type();
        String _plus_3 = (" --google-machine-type " + _machine_type_1);
        command.append(_plus_3);
      }
    } else {
    }
    return command.toString();
  }
  
  protected static void _privk3_machineStartAll(final MachineGoogleComputeEngineAspectMachine_Google_Compute_EngineAspectProperties _self_, final Machine_Google_Compute_Engine _self) {
  }
  
  protected static void _privk3_machineStart(final MachineGoogleComputeEngineAspectMachine_Google_Compute_EngineAspectProperties _self_, final Machine_Google_Compute_Engine _self) {
  }
  
  protected static boolean _privk3_isDeployed(final MachineGoogleComputeEngineAspectMachine_Google_Compute_EngineAspectProperties _self_, final Machine_Google_Compute_Engine _self) {
     return _self_.isDeployed; 
  }
  
  protected static void _privk3_isDeployed(final MachineGoogleComputeEngineAspectMachine_Google_Compute_EngineAspectProperties _self_, final Machine_Google_Compute_Engine _self, final boolean isDeployed) {
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
