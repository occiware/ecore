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
package org.occiware.clouddesigner.occi.docker.connector.dockerjava.cgroup;

import org.occiware.clouddesigner.occi.docker.connector.dockerjava.cgroup.CgroupManager;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil;

@SuppressWarnings("all")
public class BlkioManager {
  public void setReadValue(final String host, final String privateKey, final String containerId, final String value) {
    boolean _isInteger = DockerUtil.isInteger(value);
    if (_isInteger) {
      boolean _equals = value.equals("-1");
      if (_equals) {
        CgroupManager.SetValue(host, privateKey, containerId, CgroupManager.blkio_subsystem, 
          CgroupManager.blkio_read, "");
      } else {
        final String newValue = ("8:0 " + value);
        CgroupManager.SetValue(host, privateKey, containerId, CgroupManager.blkio_subsystem, 
          CgroupManager.blkio_read, newValue);
      }
    }
  }
  
  public void setWriteValue(final String host, final String privateKey, final String containerId, final String value) {
    boolean _isInteger = DockerUtil.isInteger(value);
    if (_isInteger) {
      boolean _equals = value.equals("-1");
      if (_equals) {
        CgroupManager.SetValue(host, privateKey, containerId, CgroupManager.blkio_subsystem, 
          CgroupManager.blkio_write, "");
      } else {
        final String newValue = ("8:0 " + value);
        CgroupManager.SetValue(host, privateKey, containerId, CgroupManager.blkio_subsystem, 
          CgroupManager.blkio_write, newValue);
      }
    }
  }
}
