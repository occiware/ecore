package org.occiware.clouddesigner.occi.cloud.connector;

import java.util.HashMap;
import java.util.Map;
import org.jclouds.compute.domain.NodeMetadata;
import org.jclouds.domain.Location;
import org.jclouds.domain.LoginCredentials;
import org.occiware.clouddesigner.occi.cloud.CloudFactory;
import org.occiware.clouddesigner.occi.cloud.Machine;
import org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2;
import org.occiware.clouddesigner.occi.cloud.Machine_CloudSigma;
import org.occiware.clouddesigner.occi.cloud.Machine_GCE;
import org.occiware.clouddesigner.occi.cloud.Machine_Gogrid;
import org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion;
import org.occiware.clouddesigner.occi.cloud.Machine_OpenStack;
import org.occiware.clouddesigner.occi.cloud.Machine_ProfitBricks;
import org.occiware.clouddesigner.occi.cloud.Machine_RackSpace;
import org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer;
import org.occiware.clouddesigner.occi.cloud.connector.Provider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class ModelHandler {
  private static Logger LOGGER = LoggerFactory.getLogger(ModelHandler.class);
  
  public Map<String, Machine> getmodelEClass() {
    final Map<String, Machine> m = new HashMap<String, Machine>();
    String _string = Provider.gogrid.toString();
    Machine_Gogrid _createMachine_Gogrid = CloudFactory.eINSTANCE.createMachine_Gogrid();
    m.put(_string, _createMachine_Gogrid);
    String _string_1 = Provider.amazonec2.toString();
    Machine_Amazon_EC2 _createMachine_Amazon_EC2 = CloudFactory.eINSTANCE.createMachine_Amazon_EC2();
    m.put(_string_1, _createMachine_Amazon_EC2);
    String _string_2 = Provider.hphelion.toString();
    Machine_Hp_Helion _createMachine_Hp_Helion = CloudFactory.eINSTANCE.createMachine_Hp_Helion();
    m.put(_string_2, _createMachine_Hp_Helion);
    String _string_3 = Provider.google.toString();
    Machine_GCE _createMachine_GCE = CloudFactory.eINSTANCE.createMachine_GCE();
    m.put(_string_3, _createMachine_GCE);
    String _string_4 = Provider.profitbricks.toString();
    Machine_ProfitBricks _createMachine_ProfitBricks = CloudFactory.eINSTANCE.createMachine_ProfitBricks();
    m.put(_string_4, _createMachine_ProfitBricks);
    String _string_5 = Provider.softlayer.toString();
    Machine_SoftLayer _createMachine_SoftLayer = CloudFactory.eINSTANCE.createMachine_SoftLayer();
    m.put(_string_5, _createMachine_SoftLayer);
    String _string_6 = Provider.openstack.toString();
    Machine_OpenStack _createMachine_OpenStack = CloudFactory.eINSTANCE.createMachine_OpenStack();
    m.put(_string_6, _createMachine_OpenStack);
    String _string_7 = Provider.rackspace.toString();
    Machine_RackSpace _createMachine_RackSpace = CloudFactory.eINSTANCE.createMachine_RackSpace();
    m.put(_string_7, _createMachine_RackSpace);
    String _string_8 = Provider.cloudsigma.toString();
    Machine_CloudSigma _createMachine_CloudSigma = CloudFactory.eINSTANCE.createMachine_CloudSigma();
    m.put(_string_8, _createMachine_CloudSigma);
    return m;
  }
  
  public Machine getModel(final NodeMetadata node, final String provider) {
    Map<String, Machine> _modelEClass = this.getmodelEClass();
    Machine machineFactory = _modelEClass.get(provider);
    if ((machineFactory instanceof Machine_OpenStack)) {
      Machine_OpenStack machineOpenStack = ((Machine_OpenStack) machineFactory);
      this.machineFactory_OpenStack(machineOpenStack, node);
      ModelHandler.LOGGER.info(("Model setting: " + machineOpenStack));
      return machineOpenStack;
    }
    if ((machineFactory instanceof Machine_Amazon_EC2)) {
      Machine_Amazon_EC2 machineAmazonEC2 = ((Machine_Amazon_EC2) machineFactory);
      this.machineFactory_Amazon_EC2(machineAmazonEC2, node);
      ModelHandler.LOGGER.info(("Model setting: " + machineAmazonEC2));
      return machineAmazonEC2;
    }
    if ((machineFactory instanceof Machine_CloudSigma)) {
      Machine_CloudSigma machineCloudSigma = ((Machine_CloudSigma) machineFactory);
      this.machineFactory_CloudSigma(machineCloudSigma, node);
      ModelHandler.LOGGER.info(("Model setting: " + machineCloudSigma));
      return machineCloudSigma;
    }
    if ((machineFactory instanceof Machine_GCE)) {
      Machine_GCE machineGCE = ((Machine_GCE) machineFactory);
      this.machineFactory_GCE(machineGCE, node);
      ModelHandler.LOGGER.info(("Model setting: " + machineGCE));
      return machineGCE;
    }
    if ((machineFactory instanceof Machine_Gogrid)) {
      Machine_Gogrid machineGogrid = ((Machine_Gogrid) machineFactory);
      this.machineFactory_Gogrid(machineGogrid, node);
      ModelHandler.LOGGER.info(("Model setting: " + machineGogrid));
      return machineGogrid;
    }
    if ((machineFactory instanceof Machine_Hp_Helion)) {
      Machine_Hp_Helion machineHpHelion = ((Machine_Hp_Helion) machineFactory);
      this.machineFactory_Hp_Helion(machineHpHelion, node);
      ModelHandler.LOGGER.info(("Model setting: " + machineHpHelion));
      return machineHpHelion;
    }
    if ((machineFactory instanceof Machine_RackSpace)) {
      Machine_RackSpace machineRackSpace = ((Machine_RackSpace) machineFactory);
      this.machineFactory_RackSpace(machineRackSpace, node);
      ModelHandler.LOGGER.info(("Model setting: " + machineRackSpace));
      return machineRackSpace;
    }
    if ((machineFactory instanceof Machine_SoftLayer)) {
      Machine_SoftLayer machineSoftLayer = ((Machine_SoftLayer) machineFactory);
      this.machineFactory_SoftLayer(machineSoftLayer, node);
      ModelHandler.LOGGER.info(("Model setting: " + machineSoftLayer));
      return machineSoftLayer;
    }
    return machineFactory;
  }
  
  public void machineFactory_OpenStack(final Machine_OpenStack machine, final NodeMetadata node) {
    String _name = node.getName();
    machine.setName(_name);
    String _id = node.getId();
    machine.setId(_id);
    Location _location = node.getLocation();
    String _id_1 = _location.getId();
    machine.setRegion(_id_1);
    String _imageId = node.getImageId();
    machine.setImage_id(_imageId);
    LoginCredentials _credentials = node.getCredentials();
    String _user = _credentials.getUser();
    machine.setUsername(_user);
    LoginCredentials _credentials_1 = node.getCredentials();
    String _password = _credentials_1.getPassword();
    machine.setPassword(_password);
  }
  
  public Object machineFactory_Amazon_EC2(final Machine machine, final NodeMetadata node) {
    return null;
  }
  
  public Object machineFactory_CloudSigma(final Machine machine, final NodeMetadata node) {
    return null;
  }
  
  public Object machineFactory_GCE(final Machine machine, final NodeMetadata node) {
    return null;
  }
  
  public Object machineFactory_Gogrid(final Machine machine, final NodeMetadata node) {
    return null;
  }
  
  public Object machineFactory_Hp_Helion(final Machine machine, final NodeMetadata node) {
    return null;
  }
  
  public Object machineFactory_ProfitBricks(final Machine machine, final NodeMetadata node) {
    return null;
  }
  
  public Object machineFactory_RackSpace(final Machine machine, final NodeMetadata node) {
    return null;
  }
  
  public Object machineFactory_SoftLayer(final Machine machine, final NodeMetadata node) {
    return null;
  }
  
  public Object machineFactory(final Machine machine, final NodeMetadata node) {
    return null;
  }
}
