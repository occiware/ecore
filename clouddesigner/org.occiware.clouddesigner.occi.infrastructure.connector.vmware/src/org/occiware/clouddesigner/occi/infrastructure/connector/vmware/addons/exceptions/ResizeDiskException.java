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

public class ResizeDiskException extends Exception {

	private static final long serialVersionUID = 731797186338114639L;

	public ResizeDiskException() {
		// TODO Auto-generated constructor stub
	}

	public ResizeDiskException(String message, Throwable cause) {
		super(message, cause);
	}

	public ResizeDiskException(String message) {
		super(message);
	}

	public ResizeDiskException(Throwable cause) {
		super(cause);
	}
	
}
