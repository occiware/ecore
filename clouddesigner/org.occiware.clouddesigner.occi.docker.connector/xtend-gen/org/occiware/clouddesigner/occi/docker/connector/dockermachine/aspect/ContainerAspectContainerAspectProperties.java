package org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.CreateContainerResponse;
import java.util.Map;

@SuppressWarnings("all")
public class ContainerAspectContainerAspectProperties {
  public Map<DockerClient, CreateContainerResponse> map = null;
}
