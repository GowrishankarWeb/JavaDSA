package com.corejava.collectionframework.task;

public class EmployeeSimple {
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int id) {
		this.employeeId = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		
	private int employeeId;
	private String firstName;
	private String city;
	private String email;

}
