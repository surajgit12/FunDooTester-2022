package com.qa.pojo;

public class PostAPIPojo {

	
	/*
	 * { "first_name": "Suraj", "last_name": "QA", "id": 1, "subjectId": 1 }
	 */
	
	
	 String first_name;
	private String last_name;
	private int id;
	private int subjectId;
	
	
	
	public PostAPIPojo(String first_name, String last_name, int id, int subjectId) {
	
		this.first_name = first_name;
		this.last_name = last_name;
		this.id = id;
		this.subjectId = subjectId;
	}
	
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}


	@Override
	public String toString() {
		return "PostAPIPojo [first_name=" +this.first_name + ", last_name=" +this.last_name + ", id=" + this.id + ", subjectId="
				+ this.subjectId + "]";
	}
	
	
}
