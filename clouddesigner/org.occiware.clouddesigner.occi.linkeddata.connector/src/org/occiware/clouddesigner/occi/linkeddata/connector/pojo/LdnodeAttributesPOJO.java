package org.occiware.clouddesigner.occi.linkeddata.connector.pojo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LdnodeAttributesPOJO {
    private String name;
    private String mongoHosts;
    private String mainProject;
    private String analyticsReadPreference;
    
    @JsonCreator
    public LdnodeAttributesPOJO(@JsonProperty("occi.ld.node.name") final String name,
    		@JsonProperty("occi.ld.node.mongoHosts") final String mongoHosts,
    		@JsonProperty("occi.ld.node.mainProject") final String mainProject,
    		@JsonProperty("occi.ld.node.analyticsReadPreference") final String analyticsReadPreference) {

    	this.name = name;
    	this.mongoHosts = mongoHosts;
    	this.mainProject = mainProject;
    	this.analyticsReadPreference = analyticsReadPreference;
	}

    @JsonProperty("occi.ld.node.name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@JsonProperty("occi.ld.node.mongoHosts")
	public String getMongoHosts() {
		return mongoHosts;
	}

	public void setMongoHosts(String mongoHosts) {
		this.mongoHosts = mongoHosts;
	}

	@JsonProperty("occi.ld.node.mainProject")
	public String getMainProject() {
		return mainProject;
	}

	public void setMainProject(String mainProject) {
		this.mainProject = mainProject;
	}

	@JsonProperty("occi.ld.node.analyticsReadPreference")
	public String getAnalyticsReadPreference() {
		return analyticsReadPreference;
	}

	public void setAnalyticsReadPreference(String analyticsReadPreference) {
		this.analyticsReadPreference = analyticsReadPreference;
	}
    
}
