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
package org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions;

public class DatastoreNotFoundException extends Exception {

	private static final long serialVersionUID = 7313975719905734910L;

	public DatastoreNotFoundException() {
		
	}

	public DatastoreNotFoundException(String message) {
		super(message);
		
	}

	public DatastoreNotFoundException(Throwable cause) {
		super(cause);
		
	}

	public DatastoreNotFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}

//	public DatastoreNotFoundException(String message, Throwable cause, boolean enableSuppression,
//			boolean writableStackTrace) {
//		super(message, cause, enableSuppression, writableStackTrace);
//		
//	}

}
