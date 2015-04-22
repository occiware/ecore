package org.occiware.clouddesigner.occi.docker.connector.dockermachine.action.api;

import org.occiware.clouddesigner.occi.docker.Machine;

public interface ObserverAction {
	public void apply(Machine machine);
}
