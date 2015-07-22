/**
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	- Fawaz PARAISO
 * 	- Philippe MERELE
 */
package org.occiware.clouddesigner.occi.hypervisor.connector.libvirt;

import org.occiware.clouddesigner.occi.hypervisor.connector.libvirt.ExecutableHypervisorFactory;
import org.occiware.clouddesigner.occi.hypervisor.connector.libvirt.ExecutableHypervisorModel;

@SuppressWarnings("all")
public class LibvirtExecutableModel {
  public static void main(final String[] args) {
    ExecutableHypervisorFactory.init();
    final ExecutableHypervisorModel main = new ExecutableHypervisorModel();
    main.connectToVMWARE();
  }
}
