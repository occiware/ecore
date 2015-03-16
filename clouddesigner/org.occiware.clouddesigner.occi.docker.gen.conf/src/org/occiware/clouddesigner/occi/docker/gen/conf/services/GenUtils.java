package org.occiware.clouddesigner.occi.docker.gen.conf.services;

import java.util.ArrayList;
import java.util.List;

import org.occiware.clouddesigner.OCCI.Link;
import org.occiware.clouddesigner.OCCI.Resource;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.Machine;

public class GenUtils {

	public List<Container> getOrderedContainers(Machine machine) {
		List<Container> res = new ArrayList<Container>();
		for (Link link : machine.getLinks()) {
			Resource target = link.getTarget();
			if (target instanceof Container) {
				// TODO improve algo
				if (target.getLinks().isEmpty()) {
					res.add(0, (Container) target);
				} else {
					res.add((Container) target);
				}
			}
		}
		return res;
	}

}
