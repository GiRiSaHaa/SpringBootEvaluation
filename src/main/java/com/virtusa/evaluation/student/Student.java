package com.virtusa.evaluation.student;

public class Student {
	private String studentID;
	private String name;
	private String address;
	
	public Student() {
		
	}
	
	public Student(String id, String name, String address) {
		super();
		this.studentID = id;
		this.name = name;
		this.address = address;
	}
	
	public String getId() {
		return studentID;
	}
	public void setId(String id) {
		this.studentID = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
