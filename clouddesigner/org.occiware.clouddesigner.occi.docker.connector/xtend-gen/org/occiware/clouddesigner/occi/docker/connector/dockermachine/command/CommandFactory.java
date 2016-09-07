/**
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	- Fawaz PARAISO
 */
package org.occiware.clouddesigner.occi.docker.connector.dockermachine.command;

import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class CommandFactory {
  private static Logger LOGGER = LoggerFactory.getLogger(CommandFactory.class);
  
  private String dockerMachineCmd = DockerUtil.getDockerMachineCmd();
  
  public String createInfoCommand(final String machineName) {
    final String command = String.format("%s inspect %s", this.dockerMachineCmd, machineName);
    return command;
  }
  
  public String createLsCmd() {
    final String command = String.format("%s ls", this.dockerMachineCmd);
    return command;
  }
  
  public String createEnvCmd(final String machineName) {
    final String command = String.format("eval \"$(%s env %s)\" ", this.dockerMachineCmd, machineName);
    return command;
  }
  
  public String getEnvCmd(final String machineName) {
    final String command = String.format("%s env %s", this.dockerMachineCmd, machineName);
    return command;
  }
  
  public String createStartCommand(final String machineName) {
    final String command = String.format("%s start %s", this.dockerMachineCmd, machineName);
    return command;
  }
  
  public String createStopCommand(final String machineName) {
    final String command = String.format("%s stop %s", this.dockerMachineCmd, machineName);
    return command;
  }
  
  public String createReStartCommand(final String machineName) {
    final String command = String.format("%s restart %s", this.dockerMachineCmd, machineName);
    return command;
  }
  
  public String createRemoveCommand(final String machineName) {
    final String command = String.format("%s rm %s", this.dockerMachineCmd, machineName);
    return command;
  }
  
  public String createUrlCommand(final String machineName) {
    final String command = String.format("%s url %s", this.dockerMachineCmd, machineName);
    return command;
  }
  
  public String createCertCommand(final String machineName) {
    final String command = String.format("%s regenerate-certs %s -f", this.dockerMachineCmd, machineName);
    return command;
  }
  
  public String createRemoveStagingCommand(final String machineName) {
    final String command = String.format("%s rm %s staging", this.dockerMachineCmd, machineName);
    return command;
  }
  
  public String createActivateCommand(final String machineName) {
    final String command = String.format("%s activate %s staging", this.dockerMachineCmd, machineName);
    return command;
  }
}
