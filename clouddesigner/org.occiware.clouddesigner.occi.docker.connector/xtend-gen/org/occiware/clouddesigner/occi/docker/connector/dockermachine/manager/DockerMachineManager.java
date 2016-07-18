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
package org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager;

import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.command.CommandFactory;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.ProcessManager;
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class DockerMachineManager {
  private static Logger LOGGER = LoggerFactory.getLogger(DockerMachineManager.class);
  
  private final static CommandFactory cf = new CommandFactory();
  
  public static boolean createHostCmd(final Runtime runtime, final Machine machine) {
    final String command = "";
    DockerMachineManager.LOGGER.info((" Run ::==> " + command));
    ProcessManager.runCommand(command, runtime, true);
    ComputeStatus _get = ComputeStatus.get(0);
    machine.setState(_get);
    String _name = machine.getName();
    return DockerMachineManager.setEnvCmd(runtime, _name);
  }
  
  public static boolean listMachinesCmd(final Runtime runtime) {
    boolean result = false;
    String _oS = DockerUtil.getOS();
    boolean _equalsIgnoreCase = _oS.equalsIgnoreCase("osx");
    if (_equalsIgnoreCase) {
      boolean _runCommand = ProcessManager.runCommand("/usr/local/bin/docker-machine ls", runtime, true);
      result = _runCommand;
    } else {
      boolean _runCommand_1 = ProcessManager.runCommand("docker-machine ls", runtime, true);
      result = _runCommand_1;
    }
    return result;
  }
  
  public static String inspectHostCmd(final Runtime runtime, final String machine) {
    final String command = DockerMachineManager.cf.createInfoCommand(machine);
    return ProcessManager.getOutputCommand(command, runtime);
  }
  
  public static String listHostCmd(final Runtime runtime) {
    final String command = DockerMachineManager.cf.createLsCmd();
    return ProcessManager.getOutputCommand(command, runtime);
  }
  
  public static boolean setEnvCmd(final Runtime runtime, final String machineName) {
    final String command = DockerMachineManager.cf.createEnvCmd(machineName);
    return ProcessManager.runCommand(command, runtime, true);
  }
  
  public static String getEnvCmd(final Runtime runtime, final String machineName) {
    final String command = DockerMachineManager.cf.getEnvCmd(machineName);
    return ProcessManager.getOutputCommand(command, runtime);
  }
  
  public static boolean startCmd(final Runtime runtime, final String machineName) {
    final String command = DockerMachineManager.cf.createStartCommand(machineName);
    return ProcessManager.runCommand(command, runtime, true);
  }
  
  public static boolean stopCmd(final Runtime runtime, final String machineName) {
    final String command = DockerMachineManager.cf.createStopCommand(machineName);
    return ProcessManager.runCommand(command, runtime, true);
  }
  
  public static boolean restartCmd(final Runtime runtime, final String machineName) {
    final String command = DockerMachineManager.cf.createReStartCommand(machineName);
    return ProcessManager.runCommand(command, runtime, true);
  }
  
  public static boolean removeCmd(final Runtime runtime, final String machineName) {
    final String command = DockerMachineManager.cf.createRemoveCommand(machineName);
    return ProcessManager.runCommand(command, runtime, true);
  }
  
  public static String urlCmd(final Runtime runtime, final String machineName) {
    final String command = DockerMachineManager.cf.createUrlCommand(machineName);
    final String temp = ProcessManager.getOutputCommand(command, runtime);
    return temp;
  }
  
  public static String ipCmd(final Runtime runtime, final String machineName) {
    final String command = DockerMachineManager.cf.createUrlCommand(machineName);
    String _outputCommand = ProcessManager.getOutputCommand(command, runtime);
    final String temp = _outputCommand.replace("tcp://", "");
    final int index = temp.indexOf(":");
    final String newTemp = temp.substring(0, index);
    return newTemp;
  }
}
