package test.org.occiware.clouddesigner.occi.docker.connector.dockerjava;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.CreateContainerResponse;
import com.github.dockerjava.api.command.InspectContainerResponse;
import com.google.common.base.Objects;
import java.security.SecureRandom;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.occiware.clouddesigner.OCCI.Link;
import org.occiware.clouddesigner.OCCI.Resource;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox;
import org.occiware.clouddesigner.occi.docker.connector.ModelHandler;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.DockerContainerManager;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.ContainerAspect;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.DockerAspect;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil;

@SuppressWarnings("all")
public class DockerContainerTest {
  public static void main(final String[] args) {
    InputOutput.<String>println("Running DockerContainerTest ...");
    final DockerContainerManager instance = new DockerContainerManager();
    final ModelHandler instanceMH = new ModelHandler();
    final DockerAspect instanceAspect = new DockerAspect();
    Machine_VirtualBox machine = instanceAspect.loadMachine_VirtualBox();
    final String machineName = DockerUtil.getActiveHost();
    boolean _notEquals = (!Objects.equal(machineName, null));
    if (_notEquals) {
      machine.setName(machineName);
    } else {
      throw new IllegalArgumentException("You should start at least one machine ...");
    }
    final String testImage = "busybox";
    instance.pullImage(machine, testImage);
    Container container = instanceAspect.loadContainer();
    SecureRandom _secureRandom = new SecureRandom();
    int _nextInt = _secureRandom.nextInt();
    String _plus = ("container-test_" + Integer.valueOf(_nextInt));
    container.setName(_plus);
    container.setCommand("sleep,9999");
    container.setImage(testImage);
    Machine _linkContainerToMachine = ContainerAspect.linkContainerToMachine(instanceAspect.container, machine);
    machine = ((Machine_VirtualBox) _linkContainerToMachine);
    Map<DockerClient, CreateContainerResponse> map = ContainerAspect.createContainer(instanceAspect.container, machine);
    ContainerAspect.save(instanceAspect.container);
    InspectContainerResponse _inspectContainer = instance.inspectContainer(map);
    InputOutput.<InspectContainerResponse>println(_inspectContainer);
    ContainerAspect.startContainer(instanceAspect.container);
    ContainerAspect.stopContainer(instanceAspect.container);
    ContainerAspect.waitContainer(instanceAspect.container);
    EList<Link> _links = machine.getLinks();
    Link _get = _links.get(0);
    Resource _target = _get.getTarget();
    String _plus_1 = ("Content: " + _target);
    InputOutput.<String>println(_plus_1);
    final List<com.github.dockerjava.api.model.Container> containers = instance.listContainer(machine);
    final Procedure1<com.github.dockerjava.api.model.Container> _function = new Procedure1<com.github.dockerjava.api.model.Container>() {
      public void apply(final com.github.dockerjava.api.model.Container contain) {
        Container _model = instanceMH.getModel(contain);
        instanceMH.saveContainer(_model);
      }
    };
    IterableExtensions.<com.github.dockerjava.api.model.Container>forEach(containers, _function);
  }
}
