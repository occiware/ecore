/**
 * Copyright (c) 2017 Inria
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
package org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.exception;

public class MonitorException extends Exception {

	private static final long serialVersionUID = -736374479789119391L;

	public MonitorException() {
		super();
	}

	public MonitorException(String message, Throwable cause) {
		super(message, cause);
	}

	public MonitorException(String message) {
		super(message);
	}

	public MonitorException(Throwable cause) {
		super(cause);
	}
}
