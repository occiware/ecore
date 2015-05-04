package test.org.occiware.clouddesigner.occi.docker.connector.dockerjava;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.CreateContainerResponse;
import java.util.Map;
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox;
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
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Machine_VirtualBox to Container");
  }
}
