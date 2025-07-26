package com.sst.project.entity;

public class Project {

	private long projectId;
	private String name;
	private String stage;
	private String description;
	
	public Project(long projectId, String name, String stage, String description) {
		super();
		this.projectId = projectId;
		this.name = name;
		this.stage = stage;
		this.description = description;
	}
	public Project() {
		super();
	}
	public long getProjectId() {
		return projectId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
