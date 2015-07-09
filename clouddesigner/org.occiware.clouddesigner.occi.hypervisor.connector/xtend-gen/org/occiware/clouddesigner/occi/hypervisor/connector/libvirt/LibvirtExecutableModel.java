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

import org.eclipse.emf.common.util.EList;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.hypervisor.Contains;
import org.occiware.clouddesigner.occi.hypervisor.Disk;
import org.occiware.clouddesigner.occi.hypervisor.HypervisorFactory;
import org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage;
import org.occiware.clouddesigner.occi.hypervisor.Interface;
import org.occiware.clouddesigner.occi.hypervisor.Machine_VirtualBox;
import org.occiware.clouddesigner.occi.hypervisor.connector.libvirt.ExecutableHypervisorFactory;

@SuppressWarnings("all")
public class LibvirtExecutableModel {
  public static void main(final String[] args) {
    ExecutableHypervisorFactory.init();
    final HypervisorFactory factory = HypervisorPackage.eINSTANCE.getHypervisorFactory();
    final Machine_VirtualBox machine = factory.createMachine_VirtualBox();
    machine.setName("libvirt-machine-b");
    String _id = machine.getId();
    machine.setHostname(_id);
    machine.setMemory(654321f);
    machine.setCores(2);
    final Interface network = factory.createInterface();
    network.setType("bridge");
    network.setLabel("en0");
    network.setModel("82540EM");
    network.setMac_addresss("00:0c:29:76:78:50");
    final Contains contains = factory.createContains();
    contains.setTarget(network);
    EList<Link> _links = machine.getLinks();
    _links.add(contains);
    final Disk disk = factory.createDisk();
    disk.setDevice("cdrom");
    disk.setSource("/Users/spirals/Downloads/ubuntu-14.04-server-i386.iso");
    machine.start();
  }
}
