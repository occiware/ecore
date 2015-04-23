package test.org.occiware.clouddesigner.occi.docker.connector.dockermachine;

import java.util.Map;
import java.util.Random;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.MapExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.occiware.clouddesigner.occi.docker.DockerFactory;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox;
import org.occiware.clouddesigner.occi.docker.connector.ModelHandler;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.DockerAspect;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspect;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerObserver;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil;

@SuppressWarnings("all")
public class DockerMachineTest {
  public static void main(final String[] args) {
    InputOutput.<String>println("Running DockerMachineTest ...");
    final DockerMachineTest instance = new DockerMachineTest();
    instance.testScenario();
    InputOutput.<String>println("**************END*********************");
  }
  
  public void testScenario() {
    DockerFactory.eINSTANCE.eClass();
    final DockerObserver instanceDO = new DockerObserver();
    final ModelHandler instanceMH = new ModelHandler();
    final DockerAspect instanceAspect = new DockerAspect();
    Machine_VirtualBox machine = instanceAspect.loadMachine_VirtualBox();
    final Random randomGenerator = new Random();
    final int randomInt = randomGenerator.nextInt(100);
    machine.setName(("test-machine-" + Integer.valueOf(randomInt)));
    MachineVirtualBoxAspect.machineStart(instanceAspect.machine_VirtualBox);
    final Machine vboxf = instanceDO.listener(machine);
    MachineVirtualBoxAspect.save(instanceAspect.machine_VirtualBox);
    vboxf.setName("new-name");
    final Map<String, String> hosts = DockerUtil.getHosts();
    InputOutput.<Map<String, String>>println(hosts);
    final Procedure2<String, String> _function = new Procedure2<String, String>() {
      public void apply(final String k, final String v) {
        Machine _model = instanceMH.getModel(k, v);
        instanceMH.saveMachine(_model);
      }
    };
    MapExtensions.<String, String>forEach(hosts, _function);
  }
}
