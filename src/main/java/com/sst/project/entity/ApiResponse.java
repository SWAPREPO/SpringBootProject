package com.sst.project.entity;

public class ApiResponse {

	private int code;
	private String severity;
	private String text;

	public ApiResponse(int code, String severity, String text) {
		super();
		this.code = code;
		this.severity = severity;
		this.text = text;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
