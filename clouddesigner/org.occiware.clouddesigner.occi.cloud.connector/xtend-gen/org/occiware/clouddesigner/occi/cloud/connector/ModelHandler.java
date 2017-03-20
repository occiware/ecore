package org.occiware.clouddesigner.occi.cloud.connector;

import java.util.HashMap;
import java.util.Map;
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
  
  public Machine getModel(final /* NodeMetadata */Object node, final String provider) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method machineFactory_OpenStack(Machine_OpenStack, NodeMetadata) from the type ModelHandler refers to the missing type NodeMetadata"
      + "\nThe method machineFactory_Amazon_EC2(Machine, NodeMetadata) from the type ModelHandler refers to the missing type NodeMetadata"
      + "\nThe method machineFactory_CloudSigma(Machine, NodeMetadata) from the type ModelHandler refers to the missing type NodeMetadata"
      + "\nThe method machineFactory_GCE(Machine, NodeMetadata) from the type ModelHandler refers to the missing type NodeMetadata"
      + "\nThe method machineFactory_Gogrid(Machine, NodeMetadata) from the type ModelHandler refers to the missing type NodeMetadata"
      + "\nThe method machineFactory_Hp_Helion(Machine, NodeMetadata) from the type ModelHandler refers to the missing type NodeMetadata"
      + "\nThe method machineFactory_RackSpace(Machine, NodeMetadata) from the type ModelHandler refers to the missing type NodeMetadata"
      + "\nThe method machineFactory_SoftLayer(Machine, NodeMetadata) from the type ModelHandler refers to the missing type NodeMetadata");
  }
  
  public void machineFactory_OpenStack(final Machine_OpenStack machine, final /* NodeMetadata */Object node) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nid cannot be resolved"
      + "\nlocation cannot be resolved"
      + "\nid cannot be resolved"
      + "\nimageId cannot be resolved"
      + "\ncredentials cannot be resolved"
      + "\nuser cannot be resolved"
      + "\ncredentials cannot be resolved"
      + "\npassword cannot be resolved");
  }
  
  public Object machineFactory_Amazon_EC2(final Machine machine, final /* NodeMetadata */Object node) {
    return null;
  }
  
  public Object machineFactory_CloudSigma(final Machine machine, final /* NodeMetadata */Object node) {
    return null;
  }
  
  public Object machineFactory_GCE(final Machine machine, final /* NodeMetadata */Object node) {
    return null;
  }
  
  public Object machineFactory_Gogrid(final Machine machine, final /* NodeMetadata */Object node) {
    return null;
  }
  
  public Object machineFactory_Hp_Helion(final Machine machine, final /* NodeMetadata */Object node) {
    return null;
  }
  
  public Object machineFactory_ProfitBricks(final Machine machine, final /* NodeMetadata */Object node) {
    return null;
  }
  
  public Object machineFactory_RackSpace(final Machine machine, final /* NodeMetadata */Object node) {
    return null;
  }
  
  public Object machineFactory_SoftLayer(final Machine machine, final /* NodeMetadata */Object node) {
    return null;
  }
  
  public Object machineFactory(final Machine machine, final /* NodeMetadata */Object node) {
    return null;
  }
}
