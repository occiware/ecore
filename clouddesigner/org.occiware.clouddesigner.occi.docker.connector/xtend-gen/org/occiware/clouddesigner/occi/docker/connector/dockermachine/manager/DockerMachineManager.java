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
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.DockerAspect;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineVirtualBoxAspect;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.command.CommandFactory;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.ProcessManager;
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class DockerMachineManager {
  private static Logger LOGGER = LoggerFactory.getLogger(DockerMachineManager.class);
  
  private final static CommandFactory cf = new CommandFactory();
  
  private final static DockerAspect instanceAspect = new DockerAspect();
  
  public static boolean createHostCmd(final Runtime runtime, final Machine machine) {
    Machine_VirtualBox _loadMachine_VirtualBox = DockerMachineManager.instanceAspect.loadMachine_VirtualBox();
    final String command = MachineVirtualBoxAspect.createMachineCommand(_loadMachine_VirtualBox);
    DockerMachineManager.LOGGER.info((" Run ::==> " + command));
    ProcessManager.runCommand(command, runtime, true);
    ComputeStatus _get = ComputeStatus.get(0);
    machine.setState(_get);
    String _name = machine.getName();
    return DockerMachineManager.setEnvCmd(runtime, _name);
  }
  
  public static boolean listMachinesCmd(final Runtime runtime) {
    return ProcessManager.runCommand("docker-machine ls", runtime, true);
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
    String _outputCommand = ProcessManager.getOutputCommand(command, runtime);
    final String temp = _outputCommand.replace("tcp", "https");
    return temp;
  }
}
