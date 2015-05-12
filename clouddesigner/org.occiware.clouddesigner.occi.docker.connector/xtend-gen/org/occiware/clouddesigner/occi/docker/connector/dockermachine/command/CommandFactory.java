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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class CommandFactory {
  private static Logger LOGGER = LoggerFactory.getLogger(CommandFactory.class);
  
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
