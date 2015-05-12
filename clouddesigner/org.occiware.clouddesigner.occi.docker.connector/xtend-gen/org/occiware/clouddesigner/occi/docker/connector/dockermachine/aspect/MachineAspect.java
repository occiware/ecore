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

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspectMachineAspectProperties;

@Aspect(className = Machine.class)
@SuppressWarnings("all")
public class MachineAspect {
  public static String createMachineCommand(final Machine _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspectMachineAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspectMachineAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.occiware.clouddesigner.occi.docker.Machine_Rackspace){
    result = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineRackspaceAspect.createMachineCommand((org.occiware.clouddesigner.occi.docker.Machine_Rackspace)_self);
    } else  if (_self instanceof org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V){
    result = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineMicrosoftHyperVAspect.createMachineCommand((org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V)_self);
    } else  if (_self instanceof org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine){
    result = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineGoogleComputeEngineAspect.createMachineCommand((org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine)_self);
    } else  if (_self instanceof org.occiware.clouddesigner.occi.docker.Machine_VirtualBox){
    result = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspect.createMachineCommand((org.occiware.clouddesigner.occi.docker.Machine_VirtualBox)_self);
    } else  if (_self instanceof org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air){
    result = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVMwarevCloudAirAspect.createMachineCommand((org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air)_self);
    } else  if (_self instanceof org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer){
    result = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineIBMSoftLayerAspect.createMachineCommand((org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer)_self);
    } else  if (_self instanceof org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2){
    result = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAmazonEC2Aspect.createMachineCommand((org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2)_self);
    } else  if (_self instanceof org.occiware.clouddesigner.occi.docker.Machine_Digital_Ocean){
    result = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineDigitalOceanAspect.createMachineCommand((org.occiware.clouddesigner.occi.docker.Machine_Digital_Ocean)_self);
    } else  if (_self instanceof org.occiware.clouddesigner.occi.docker.Machine_VMware_Fusion){
    result = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.Machine_VMwareFusionAspect.createMachineCommand((org.occiware.clouddesigner.occi.docker.Machine_VMware_Fusion)_self);
    } else  if (_self instanceof org.occiware.clouddesigner.occi.docker.Machine_OpenStack){
    result = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineOpenStackAspect.createMachineCommand((org.occiware.clouddesigner.occi.docker.Machine_OpenStack)_self);
    } else  if (_self instanceof org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Azure){
    result = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineMicrosoftAzureAspect.createMachineCommand((org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Azure)_self);
    } else  if (_self instanceof org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere){
    result = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVMwarevSphereAspect.createMachineCommand((org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere)_self);
    } else  if (_self instanceof org.occiware.clouddesigner.occi.docker.Machine){
    result = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspect._privk3_createMachineCommand(_self_, (org.occiware.clouddesigner.occi.docker.Machine)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  protected static boolean isDeployed(final Machine _self) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspectMachineAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspectMachineAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_isDeployed(_self_, _self);
    return (boolean)result;
  }
  
  protected static void isDeployed(final Machine _self, final boolean isDeployed) {
    org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspectMachineAspectProperties _self_ = org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspectMachineAspectContext.getSelf(_self);
    _privk3_isDeployed(_self_, _self,isDeployed);
  }
  
  protected static String _privk3_createMachineCommand(final MachineAspectMachineAspectProperties _self_, final Machine _self) {
    return null;
  }
  
  protected static boolean _privk3_isDeployed(final MachineAspectMachineAspectProperties _self_, final Machine _self) {
     return _self_.isDeployed; 
  }
  
  protected static void _privk3_isDeployed(final MachineAspectMachineAspectProperties _self_, final Machine _self, final boolean isDeployed) {
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
