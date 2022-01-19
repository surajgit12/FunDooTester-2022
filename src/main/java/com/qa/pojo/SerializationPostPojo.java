package com.qa.pojo;

import java.util.ArrayList;
import java.util.List;

public class SerializationPostPojo {

	/*
	 * { "id": 101, "firstName": "xxxxxx", "lastName": "xxxxxx", "email":
	 * "abcxyz@risusDonecegestas.edu", "programme": "Manger", "courses": [ "Java",
	 * "Selenium" ] }
	 */

	
	public int id;
	private String firstName;
	private String lastName;
	private String email;
	private String programme;

	private static List<String> courses;
	


	
	public SerializationPostPojo(int id, String firstName, String lastName, String email, String programme,
			List<String> courses) {

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.programme = programme;
		this.courses = courses;
	}

	public SerializationPostPojo(int id2, String firstName2, String lastName2, String email2, String programme2,
			boolean add) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProgramme() {
		return programme;
	}

	public void setProgramme(String programme) {
		this.programme = programme;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "SerializationPostPojo [id=" + this.id + ", firstName=" + this.firstName + ", lastName=" + this.lastName
				+ ", email=" + this.email + ", programme=" + this.programme + ", courses=" + this.courses + "]";
	}

}
