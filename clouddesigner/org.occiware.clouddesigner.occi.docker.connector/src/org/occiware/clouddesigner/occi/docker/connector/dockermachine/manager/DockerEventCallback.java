package org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager;

import com.github.dockerjava.api.model.Event;
import com.github.dockerjava.core.command.EventsResultCallback;

import java.util.ArrayList;
import java.util.List;

import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.Contains;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableContainer;
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DockerEventCallback extends EventsResultCallback {
	// Initialize logger for CommandFactory.
	private static Logger LOGGER = LoggerFactory.getLogger(DockerEventCallback.class);
	private Machine machine = null;

	public DockerEventCallback(Machine machine) {
		this.machine = machine;

	}

	private final List<Event> events = new ArrayList<Event>();

	private ExecutableContainer getContainerFromMachine(String containerId) {
		for (Link link : this.machine.getLinks()) {
			Contains contains = (Contains) link;
			if (contains.getTarget() instanceof Container) {
				ExecutableContainer con = (ExecutableContainer) contains.getTarget();
				if (con.getId().equals(containerId)) {
					return con;
				}

			}

		}
		return null;
	}

	public void onNext(Event event) {
		LOGGER.info("Received event #{}", event);
		LOGGER.info("Listener event #{}\n\n");

		if(event.getStatus().equalsIgnoreCase("stop")){
			ExecutableContainer currentContainer = getContainerFromMachine(event.getId());
			//currentContainer.setState(ComputeStatus.INACTIVE);
			LOGGER.info("State is INACTIVE \n");
		}if(event.getStatus().equalsIgnoreCase("start")){
			ExecutableContainer currentContainer = getContainerFromMachine(event.getId());
			//currentContainer.setState(ComputeStatus.ACTIVE);
			LOGGER.info("State is ACTIVE \n");
		}
		events.add(event);
	}

	public List<Event> getEvents() {
		return new ArrayList<Event>(events);
	}
}
