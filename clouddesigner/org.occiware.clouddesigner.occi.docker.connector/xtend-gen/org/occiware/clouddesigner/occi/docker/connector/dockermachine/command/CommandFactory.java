package org.occiware.clouddesigner.occi.docker.connector.dockermachine.command;

@SuppressWarnings("all")
public class CommandFactory {
  public String createInfoCommand(final String machineName) {
    final String command = String.format("docker-machine inspect %s", machineName);
    return command;
  }
  
  public String createLsCmd() {
    final String command = "docker-machine ls ";
    return command;
  }
  
  public String createEnvCmd(final String machineName) {
    final String command = String.format("eval \"$(docker-machine env %s)\" ", machineName);
    return command;
  }
  
  public String getEnvCmd(final String machineName) {
    final String command = String.format("docker-machine env %s", machineName);
    return command;
  }
  
  public String createStartCommand(final String machineName) {
    final String command = String.format("docker-machine start %s", machineName);
    return command;
  }
  
  public String createStopCommand(final String machineName) {
    final String command = String.format("docker-machine stop %s", machineName);
    return command;
  }
  
  public String createReStartCommand(final String machineName) {
    final String command = String.format("docker-machine restart %s", machineName);
    return command;
  }
  
  public String createRemoveCommand(final String machineName) {
    final String command = String.format("docker-machine rm %s", machineName);
    return command;
  }
  
  public String createUrlCommand(final String machineName) {
    final String command = String.format("docker-machine url %s", machineName);
    return command;
  }
  
  public String createRemoveStagingCommand(final String machineName) {
    final String command = String.format("docker-machine rm %s staging", machineName);
    return command;
  }
  
  public String createActivateCommand(final String machineName) {
    final String command = String.format("docker-machine activate %s staging", machineName);
    return command;
  }
}
