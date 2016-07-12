/**
 * Copyright (c) 2016 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Christophe Gourdin <christophe.gourdin@inria.fr>
 *
 */
package org.occiware.clouddesigner.occi.infrastructure.connector.vmware.allocator;

import com.vmware.vim25.mo.ClusterComputeResource;
import com.vmware.vim25.mo.Datacenter;
import com.vmware.vim25.mo.Datastore;
import com.vmware.vim25.mo.HostSystem;
import com.vmware.vim25.mo.Network;
import com.vmware.vim25.mo.ResourcePool;

/**
 * Define resource allocator interface. (Automatic allocation of resources)
 * @author Christophe Gourdin - Inria
 *
 */
public interface Allocator {
	
	
	public Datacenter allocateDatacenter();
	public Datastore allocateDatastore();
	public ResourcePool allocateResourcePool();
	public ClusterComputeResource allocateCluster();
	public HostSystem allocateHostSystem();
	
	public Network allocateNetwork();
	
	public Datacenter getDc();
	public void setDc(Datacenter dc);

	public Datastore getDatastore();

	public void setDatastore(Datastore datastore);

	public HostSystem getHost();
	public void setHost(HostSystem host);
	
	public ResourcePool getResourcePool();

	public void setResourcePool(ResourcePool resourcePool);

	public ClusterComputeResource getCluster();

	public void setCluster(ClusterComputeResource cluster);
	
	public void setMemoryHostMini(double memMini);
	public double getMemoryHostMini();
}
