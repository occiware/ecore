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
