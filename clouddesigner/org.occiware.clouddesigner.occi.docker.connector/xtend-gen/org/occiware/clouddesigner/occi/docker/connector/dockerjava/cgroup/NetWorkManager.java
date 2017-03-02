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

import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.cgroup.CgroupManager;

@SuppressWarnings("all")
public class NetWorkManager {
  public void setNetworkValue(final String host, final String privateKey, final Container container, final String value) {
    CgroupManager.SetValue(host, privateKey, container, CgroupManager.netcls_subsystem, 
      CgroupManager.net_cls_classid, value);
  }
}
