package org.occiware.clouddesigner.occi.monitoring.ext.connector.backend;

import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.exception.MonitorException;
import org.occiware.tinom.model.Collector;

/**
 * Define common methods on collectors implementations.
 * @author Christophe Gourdin - Inria
 *
 */
public interface CollectorType {
	
	public Collector getTinomCollector() throws MonitorException;
	
}
