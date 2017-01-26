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

import org.occiware.clouddesigner.occi.docker.impl.VolumeImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class implements executable Volume.
 */
@SuppressWarnings("all")
public class ExecutableVolume extends VolumeImpl {
  private static Logger LOGGER = LoggerFactory.getLogger(ExecutableVolume.class);
}
