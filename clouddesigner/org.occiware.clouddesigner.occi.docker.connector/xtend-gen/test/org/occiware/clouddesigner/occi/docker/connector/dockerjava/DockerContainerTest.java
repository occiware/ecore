package test.org.occiware.clouddesigner.occi.docker.connector.dockerjava;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.CreateContainerResponse;
import java.security.SecureRandom;
import java.util.Map;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspect;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.DockerAspect;

@SuppressWarnings("all")
public class DockerContainerTest {
  public static void main(final String[] args) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method startContainer is undefined for the type DockerContainerTest"
      + "\nThe method stopContainer is undefined for the type DockerContainerTest"
      + "\nThe method waitContainer is undefined for the type DockerContainerTest");
  }
  
  public static Map<DockerClient, CreateContainerResponse> containerCreate(final DockerAspect instanceAspect, final String testImage, final Machine_VirtualBox machine) {
    Container container = instanceAspect.loadContainer();
    SecureRandom _secureRandom = new SecureRandom();
    int _nextInt = _secureRandom.nextInt();
    String _plus = ("container-test_" + Integer.valueOf(_nextInt));
    container.setName(_plus);
    container.setCommand("sleep,9999");
    container.setImage(testImage);
    Machine _linkContainerToMachine = ContainerAspect.linkContainerToMachine(instanceAspect.container, machine);
    Machine_VirtualBox newmachine = ((Machine_VirtualBox) _linkContainerToMachine);
    Map<DockerClient, CreateContainerResponse> map = ContainerAspect.createContainer(instanceAspect.container, newmachine);
    ContainerAspect.save(instanceAspect.container);
    return map;
  }
}
