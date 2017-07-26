package org.occiware.clouddesigner.occi.linkeddata.connector.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LdnodePOJO {
	public static final int ID_AFTER_N_CHARS = 9; 
	
	private String id;
	private String title;
	private String summary;
	private String kind;
	private List<String> mixins;
	private LdnodeAttributesPOJO attributes;
	private List<String> actions;
	private String location;

    @JsonCreator
    public LdnodePOJO(@JsonProperty("id") final String id,
    		@JsonProperty("title") final String title,
    		@JsonProperty("summary") final String summary,
    		@JsonProperty("kind") final String kind,
    		@JsonProperty("mixins") final List<String> mixins,
    		@JsonProperty("attributes") final LdnodeAttributesPOJO attributes,
    		@JsonProperty("actions") final List<String> actions) {

    	this.id = id;
    	this.title = title;
    	this.summary = summary;
    	this.kind = kind;
    	this.mixins = mixins;
    	this.attributes = attributes;
    	this.actions = actions;
    	this.location = null;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public List<String> getMixins() {
		return mixins;
	}

	public void setMixins(List<String> mixins) {
		this.mixins = mixins;
	}

	public LdnodeAttributesPOJO getAttributes() {
		return attributes;
	}

	public void setAttributes(LdnodeAttributesPOJO attributes) {
		this.attributes = attributes;
	}

	public List<String> getActions() {
		return actions;
	}

	public void setActions(List<String> actions) {
		this.actions = actions;
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
    
    
}
