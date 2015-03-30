package org.occiware.clouddesigner.occi.gen.xml.services;

import java.util.HashMap;

public class GenUtils {

	static HashMap<String, String> toXsdTypes = new HashMap<String,String>();
	static {
		toXsdTypes.put("java.lang.String", "xsd:string");
	};
	
	public String toXMLtype(String javatype) {
		return toXsdTypes.get(javatype);
	}
}
