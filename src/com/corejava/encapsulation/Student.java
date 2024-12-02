package com.corejava.encapsulation;

public class Student {
	
	private int studentId;
	private String studentName;
	private String studentPlace;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String email;
	private String password;
	private long mobileNumber;
	private String country;
	
	public Student() {
		
	}
	
	public Student(int studentId, 
			String studentName, 
			String studentPlace,
			String firstName,
			String lastName,
			String dateOfBirth,
			String email,
			String password,
			long mobileNumber,
			String country) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentPlace=studentPlace;
		this.firstName=firstName;
		this.lastName=lastName;
		this.dateOfBirth=dateOfBirth;
		this.email=email;
		this.password=password;
		this.country=country;
		this.mobileNumber=mobileNumber;
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

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentPlace() {
		return studentPlace;
	}
	public void setStudentPlace(String studentPlace) {
		this.studentPlace = studentPlace;
	}
	

}
