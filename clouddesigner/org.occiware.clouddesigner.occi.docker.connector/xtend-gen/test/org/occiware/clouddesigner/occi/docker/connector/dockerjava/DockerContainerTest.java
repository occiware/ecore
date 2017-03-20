package test.org.occiware.clouddesigner.occi.docker.connector.dockerjava;

import java.security.SecureRandom;
import org.eclipse.emf.common.util.EList;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.Contains;
import org.occiware.clouddesigner.occi.docker.DockerFactory;
import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableDockerModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class DockerContainerTest {
  private static Logger LOGGER = LoggerFactory.getLogger(DockerContainerTest.class);
  
  public static void main(final String[] args) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method pullImage(Machine, String) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe method createContainer(Machine, Container) from the type DockerContainerManager refers to the missing type DockerClient");
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
