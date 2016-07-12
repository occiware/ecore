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
package org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils;

import java.rmi.RemoteException;

import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.StoragelinkConnector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vmware.vim25.mo.Datacenter;
import com.vmware.vim25.mo.Datastore;
import com.vmware.vim25.mo.Folder;
import com.vmware.vim25.mo.InventoryNavigator;

/**
 * Helper for Datastore operations (find datastore, storage mount etc..)
 * @author Christophe Gourdin - Inria
 *
 */
public class DatastoreHelper {
	
	private static Logger LOGGER = LoggerFactory.getLogger(DatastoreHelper.class);
	
	/**
	 * Find a datastore on folder tree and for a name (ex: datastore1).
	 * @param folder
	 * @param name
	 * @return a datastore, if none, null value.
	 */
	public static Datastore findDatastoreForName(final Datacenter datacenter, final String name) {
		Datastore datastore = null;
		try {
			datastore = (Datastore) new InventoryNavigator(datacenter).searchManagedEntity(StoragelinkConnector.DATASTORE, name);
					
		} catch (RemoteException ex) {
			LOGGER.error("Error while searching a datastore : " + name + " --> " + ex.getMessage());
		}
		
		return datastore;
	}
	
	/**
	 * Find a datastore from a folder (usually root folder).
	 * @param name
	 * @return a datastore, if none, null value.
	 */
	public static Datastore findDatastoreForName(final Folder folder, final String name) {
		Datastore datastore = null;
		try {
			datastore = (Datastore) new InventoryNavigator(folder).searchManagedEntity(StoragelinkConnector.DATASTORE, name);
					
		} catch (RemoteException ex) {
			LOGGER.error("Error while searching a datastore : " + name + " --> " + ex.getMessage());
		}
		
		return datastore;
	}
	
	
	/**
	 * Check if a datastore exist in folder tree , for name.
	 * @param folder
	 * @param name
	 * @return true if exist, false if none.
	 */
	public static boolean isDatastoreExistForName(final Datacenter datacenter, final String name) {
		boolean isDatastoreExist = false;
		
		Datastore ds = findDatastoreForName(datacenter, name);
		if (ds != null) {
			isDatastoreExist = true;
		}
		
		return isDatastoreExist;
	}

}
