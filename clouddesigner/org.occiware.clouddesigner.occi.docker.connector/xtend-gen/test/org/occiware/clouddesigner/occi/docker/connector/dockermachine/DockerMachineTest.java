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
import org.occiware.clouddesigner.occi.docker.connector.ResourceDifferencesEngine;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerMachineManager;
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
  
  public Machine testScenario() {
    Machine _xblockexpression = null;
    {
      DockerFactory.eINSTANCE.eClass();
      final DockerObserver instanceDO = new DockerObserver();
      final ModelHandler instanceMH = new ModelHandler();
      Machine_VirtualBox machine = DockerFactory.eINSTANCE.createMachine_VirtualBox();
      final Machine_VirtualBox vbox = this.createVirtualBoxMachineTest(machine);
      final Machine vboxf = instanceDO.listener(vbox);
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
      final String xmiPath = "/Users/spirals/git/ecore/clouddesigner/org.occiware.clouddesigner.occi.docker.connector/bin/new-name.xmi";
      final ResourceDifferencesEngine cp = new ResourceDifferencesEngine();
      Boolean _isSimilar = cp.isSimilar(xmiPath, xmiPath);
      InputOutput.<Boolean>println(_isSimilar);
      _xblockexpression = instanceMH.load(xmiPath);
    }
    return _xblockexpression;
  }
  
  public Machine_VirtualBox createVirtualBoxMachineTest(final Machine_VirtualBox vbox) {
    final ModelHandler instanceMH = new ModelHandler();
    final Random randomGenerator = new Random();
    final int randomInt = randomGenerator.nextInt(100);
    vbox.setName(("test-machine-" + Integer.valueOf(randomInt)));
    Runtime _runtime = Runtime.getRuntime();
    DockerMachineManager.createHostCmd(_runtime, vbox);
    instanceMH.saveMachine(vbox);
    return vbox;
  }
}
