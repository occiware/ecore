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

public class VirtualSwitchNotFoundException extends Exception {

	private static final long serialVersionUID = -1227449195598379089L;

	public VirtualSwitchNotFoundException() {
		
	}

	public VirtualSwitchNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public VirtualSwitchNotFoundException(String message) {
		super(message);
	}

	public VirtualSwitchNotFoundException(Throwable cause) {
		super(cause);
	}

}
