package test.org.occiware.clouddesigner.occi.docker.connector.dockerjava;

import com.google.common.base.Objects;
import java.security.SecureRandom;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.Contains;
import org.occiware.clouddesigner.occi.docker.DockerFactory;
import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableDockerFactory;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableDockerModel;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.DockerContainerManager;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class DockerContainerTest {
  private static Logger LOGGER = LoggerFactory.getLogger(DockerContainerTest.class);
  
  public static void main(final String[] args) {
    final DockerFactory init = ExecutableDockerFactory.init();
    DockerContainerTest.LOGGER.info("Running DockerContainerTest ...");
    final DockerContainerManager instance = new DockerContainerManager();
    final ExecutableDockerModel instanceExecDocker = new ExecutableDockerModel();
    DockerFactory _dockerFactory = DockerPackage.eINSTANCE.getDockerFactory();
    final Machine_VirtualBox machine = _dockerFactory.createMachine_VirtualBox();
    final String machineName = DockerUtil.getActiveHost();
    boolean _notEquals = (!Objects.equal(machineName, null));
    if (_notEquals) {
      machine.setName(machineName);
    } else {
      throw new IllegalArgumentException("You should start at least one machine ...");
    }
    final String testImage = "busybox";
    instance.pullImage(machine, testImage);
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, 2, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final Container container = DockerContainerTest.containerCreate(instanceExecDocker, testImage, machine);
        instance.createContainer(machine, container);
      }
    }
  }
  
  public static Container containerCreate(final ExecutableDockerModel instanceExecDocker, final String testImage, final Machine_VirtualBox machine) {
    DockerFactory _dockerFactory = DockerPackage.eINSTANCE.getDockerFactory();
    final Container container = _dockerFactory.createContainer();
    SecureRandom _secureRandom = new SecureRandom();
    int _nextInt = _secureRandom.nextInt();
    String _plus = ("container-test" + Integer.valueOf(_nextInt));
    container.setName(_plus);
    container.setCommand("sleep,9999");
    container.setImage(testImage);
    DockerFactory _dockerFactory_1 = DockerPackage.eINSTANCE.getDockerFactory();
    final Contains contains = _dockerFactory_1.createContains();
    contains.setTarget(container);
    EList<Link> _links = machine.getLinks();
    _links.add(contains);
    return container;
  }
}
