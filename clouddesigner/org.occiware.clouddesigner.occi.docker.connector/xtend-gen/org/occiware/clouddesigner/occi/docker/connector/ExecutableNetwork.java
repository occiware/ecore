/**
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Fawaz PARAISO
 * - Philippe MERLE
 */
package org.occiware.clouddesigner.occi.docker.connector;

import org.occiware.clouddesigner.occi.docker.Network;
import org.occiware.clouddesigner.occi.docker.connector.NetworkStateMachine;
import org.occiware.clouddesigner.occi.docker.impl.NetworkImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class implements executable Network.
 */
@SuppressWarnings("all")
public class ExecutableNetwork extends NetworkImpl {
  private static Logger LOGGER = LoggerFactory.getLogger(ExecutableNetwork.class);
  
  /**
   * Network have a state machine.
   */
  private final NetworkStateMachine<Network> stateMachine = new NetworkStateMachine<Network>(this) {
    /**
     * Start the Docker container.
     */
    @Override
    public void create_execute() {
      ExecutableNetwork.LOGGER.info("EXECUTING Network create action.");
    }
  };
}
