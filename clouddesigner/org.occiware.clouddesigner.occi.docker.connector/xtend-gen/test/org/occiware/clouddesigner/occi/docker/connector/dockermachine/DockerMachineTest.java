package test.org.occiware.clouddesigner.occi.docker.connector.dockermachine;

import java.util.Random;
import org.occiware.clouddesigner.occi.docker.DockerFactory;
import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableDockerFactory;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableDockerModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class DockerMachineTest {
  private static Logger LOGGER = LoggerFactory.getLogger(DockerMachineTest.class);
  
  public static void main(final String[] args) {
    final DockerFactory init = ExecutableDockerFactory.init();
    DockerMachineTest.LOGGER.info("Running DockerMachineTest ...");
    final DockerMachineTest instance = new DockerMachineTest();
    instance.testScenario();
    DockerMachineTest.LOGGER.info("**************END*********************");
  }
  
  public void testScenario() {
    DockerFactory.eINSTANCE.eClass();
    DockerFactory _dockerFactory = DockerPackage.eINSTANCE.getDockerFactory();
    Machine_VirtualBox machine = _dockerFactory.createMachine_VirtualBox();
    final Random randomGenerator = new Random();
    final int randomInt = randomGenerator.nextInt(100);
    machine.setName(("test-machine-" + Integer.valueOf(randomInt)));
    final ExecutableDockerModel instanceExecDocker = new ExecutableDockerModel(machine);
    instanceExecDocker.start();
  }
}
