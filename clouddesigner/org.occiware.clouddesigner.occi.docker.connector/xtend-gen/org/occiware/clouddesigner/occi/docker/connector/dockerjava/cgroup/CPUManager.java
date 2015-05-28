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

@SuppressWarnings("all")
public class CPUManager {
  public void setCPUValue(final String host, final String privateKey, final String containerId, final String value) {
    CgroupManager.SetValue(host, privateKey, containerId, CgroupManager.cpuset_subsystem, CgroupManager.cpuset_cpus, value);
  }
  
  public void setFreqValue(final String host, final String privateKey, final String containerId, final String value) {
    Integer _valueOf = Integer.valueOf(value);
    final int time = ((_valueOf).intValue() * 10000);
    CgroupManager.SetValue(host, privateKey, containerId, CgroupManager.cpu_subsystem, CgroupManager.cpu_cfs_period, 
      "1000000");
    String _valueOf_1 = String.valueOf(time);
    CgroupManager.SetValue(host, privateKey, containerId, CgroupManager.cpu_subsystem, CgroupManager.cpu_cfs_quota, _valueOf_1);
  }
}
