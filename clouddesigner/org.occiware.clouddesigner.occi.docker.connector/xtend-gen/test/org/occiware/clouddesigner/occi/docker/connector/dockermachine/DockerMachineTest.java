package test.org.occiware.clouddesigner.occi.docker.connector.dockermachine;

import java.util.Random;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.occiware.clouddesigner.occi.docker.DockerFactory;
import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableDockerFactory;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableDockerModel;
import org.occiware.clouddesigner.occi.docker.connector.ModelHandler;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerObserver;

@SuppressWarnings("all")
public class DockerMachineTest {
  public static void main(final String[] args) {
    final DockerFactory init = ExecutableDockerFactory.init();
    InputOutput.<String>println("Running DockerMachineTest ...");
    final DockerMachineTest instance = new DockerMachineTest();
    instance.testScenario();
    InputOutput.<String>println("**************END*********************");
  }
  
  public Boolean testScenario() {
    Boolean _xblockexpression = null;
    {
      DockerFactory.eINSTANCE.eClass();
      final DockerObserver instanceDO = new DockerObserver();
      DockerFactory _dockerFactory = DockerPackage.eINSTANCE.getDockerFactory();
      Machine_VirtualBox machine = _dockerFactory.createMachine_VirtualBox();
      final Random randomGenerator = new Random();
      final int randomInt = randomGenerator.nextInt(100);
      machine.setName(("test-machine-" + Integer.valueOf(randomInt)));
      final ExecutableDockerModel instanceExecDocker = new ExecutableDockerModel(machine);
      instanceExecDocker.start();
      final Machine vboxf = instanceDO.listener(machine);
      final ModelHandler compare = new ModelHandler();
      boolean _isSimilar = compare.isSimilar(vboxf, vboxf);
      _xblockexpression = InputOutput.<Boolean>println(Boolean.valueOf(_isSimilar));
    }
    return _xblockexpression;
  }
}
