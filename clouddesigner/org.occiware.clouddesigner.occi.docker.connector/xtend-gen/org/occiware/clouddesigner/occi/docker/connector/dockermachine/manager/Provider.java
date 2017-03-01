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

@SuppressWarnings("all")
public enum Provider {
  virtualbox,
  
  digitalocean,
  
  amazonec2,
  
  google,
  
  softlayer,
  
  openstack,
  
  rackspace,
  
  vmwarefusion,
  
  vmwarevcloudair,
  
  vmwarevsphere,
  
  ibm,
  
  azure,
  
  microsofthyperv;
}
