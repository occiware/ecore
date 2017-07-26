package org.occiware.clouddesigner.occi.linkeddata.connector;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class LdnodeWrapper {
	private static final int ID_AFTER_N_CHARS = 9; 
	
	private final String id;
    private final String name;
    private final String mongoHosts;
    private final String mainProject;
    private final String analyticsReadPreference;

    @JsonCreator
    public LdnodeWrapper(@JsonProperty("id") final String id ,
    		@JsonProperty("attributes") final JsonNode attributes) {

    	this.id = id.substring(ID_AFTER_N_CHARS , id.length());
    	this.name = attributes.get("occi.ld.node.name").asText();
    	this.mongoHosts = attributes.get("occi.ld.node.mongoHosts").asText();
    	this.mainProject = attributes.get("occi.ld.node.mainProject").asText();
    	this.analyticsReadPreference = attributes.get("occi.ld.node.analyticsReadPreference").asText();
    }

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getMongoHosts() {
		return mongoHosts;
	}

	public String getMainProject() {
		return mainProject;
	}

	public String getAnalyticsReadPreference() {
		return analyticsReadPreference;
	}

	@Override
	public String toString() {
		return "Packet [name=" + name + ", mongoHosts=" + mongoHosts + ", mainProject=" + mainProject
				+ ", analyticsReadPreference=" + analyticsReadPreference + "]";
	}
	
}