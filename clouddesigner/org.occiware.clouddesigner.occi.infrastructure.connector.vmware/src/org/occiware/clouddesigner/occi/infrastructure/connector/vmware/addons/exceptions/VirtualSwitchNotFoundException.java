package org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions;

public class VirtualSwitchNotFoundException extends Exception {

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
