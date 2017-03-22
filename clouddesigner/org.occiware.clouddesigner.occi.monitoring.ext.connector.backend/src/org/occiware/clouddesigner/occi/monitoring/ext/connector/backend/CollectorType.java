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
