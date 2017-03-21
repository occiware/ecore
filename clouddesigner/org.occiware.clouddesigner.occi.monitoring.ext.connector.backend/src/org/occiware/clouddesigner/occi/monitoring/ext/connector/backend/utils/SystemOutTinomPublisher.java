package org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils;

import java.io.PrintStream;

import org.occiware.tinom.extensions.utils.PrintStreamPublisher;

public class SystemOutTinomPublisher extends PrintStreamPublisher {

	public SystemOutTinomPublisher(String name) {
		super(name, System.out);
		// System.out.println("Publisher SystemOutTinomPublisher contructor called.");
	}
	
	@Override
	public void run() {
		String inputNames[] = getInputNames();
		
		for(String inputName : inputNames) {
			try {
				doPublish(inputName, get(inputName));
			} catch(NoSuchFieldException e) {
				doPublish(inputName, e);
			}
		}
		
	}

	
	public void stop() {
		// Release publisher.
		System.out.println("Stop specific publisher call.");
	}
	
	
}
