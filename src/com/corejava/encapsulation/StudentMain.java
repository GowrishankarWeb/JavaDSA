package com.corejava.encapsulation;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu1=new Student();
		
		stu1.setStudentId(35);
		System.out.println(stu1.getStudentId());
		
		stu1.setStudentName("Gowrishankar J");
		System.out.println(stu1.getStudentName());
		
		stu1.setStudentPlace("Namakkal");
		System.out.println(stu1.getStudentPlace());
		
		stu1.setCountry("India");
		System.out.println(stu1.getCountry());
		
		stu1.setDateOfBirth("01 Jan 2023");
		System.out.println(stu1.getDateOfBirth());
		
		stu1.setEmail("gowri@google.com");
		System.out.println(stu1.getEmail());
		
		stu1.setFirstName("Gowrishankar");
		System.out.println(stu1.getFirstName());
		
		stu1.setLastName("J");
		System.out.println(stu1.getLastName());
		
		stu1.setMobileNumber(9123456789l);
		System.out.println(stu1.getMobileNumber());
		
		stu1.setPassword("Stu231");
		System.out.println(stu1.getPassword());
		
		Student stu2=new Student(36, 
				"Nujabes Aruarian", 
				"Namakkal",
				"Nujabes",
				"Aruarian",
				"01 Jan 2023",
				"nujabes@gmail.com",
				"Nujabes1234567",
				9123456789l,
				"India");
		System.out.println("Student ID : "+stu2.getStudentId());
		System.out.println("Student Full Name : "+stu2.getStudentName());		
		System.out.println("Student First Name : "+stu2.getFirstName());
		System.out.println("Student Last Name : "+stu2.getLastName());
		System.out.println("Student DOB : "+stu2.getDateOfBirth());
		System.out.println("Student Email Address : "+stu2.getEmail());
		System.out.println("Student Password : "+stu2.getPassword() );
		System.out.println("Student Mobile Number : "+stu2.getMobileNumber() );
		System.out.println("Student Place : "+stu2.getStudentPlace());
		System.out.println("Student Country : "+stu2.getCountry() );
		
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Student ID:");
		int studentId = ip.nextInt();
		ip.nextLine();
		System.out.println("Enter Student's Full Name:");
		String studentName = ip.nextLine();
		System.out.println("Enter Student's First Name:");
		String firstName = ip.nextLine();
		System.out.println("Enter Student's Last Name:");
		String lastName = ip.nextLine();
		System.out.println("Enter Student's Date of Birth (like 01 Jan 2001):");
		String dateOfBirth = ip.nextLine();
		System.out.println("Enter Student's Email address:");
		String email = ip.nextLine();
		System.out.println("Enter Student's Password:");
		String password = ip.nextLine();
		System.out.println("Enter Student's Mobile Number:");
		long mobileNumber = ip.nextLong();
		ip.nextLine();
		System.out.println("Enter Student's Place");
		String studentPlace = ip.nextLine();
		System.out.println("Enter Student's Country");
		String country = ip.nextLine();
		
		Student stu3=new Student();
		stu3.setStudentId(studentId);
		stu3.setStudentName(studentName);
		stu3.setStudentPlace(studentPlace);
		stu3.setFirstName(firstName);
		stu3.setLastName(lastName);
		stu3.setDateOfBirth(dateOfBirth);
		stu3.setEmail(email);
		stu3.setMobileNumber(mobileNumber);
		stu3.setPassword(password);
		stu3.setCountry(country);

		System.out.println("Student ID : "+stu3.getStudentId());
		System.out.println("Student Full Name : "+stu3.getStudentName());		
		System.out.println("Student First Name : "+stu3.getFirstName());
		System.out.println("Student Last Name : "+stu3.getLastName());
		System.out.println("Student DOB : "+stu3.getDateOfBirth());
		System.out.println("Student Email Address : "+stu3.getEmail());
		System.out.println("Student Password : "+stu3.getPassword() );
		System.out.println("Student Mobile Number : "+stu3.getMobileNumber() );
		System.out.println("Student Place : "+stu3.getStudentPlace());
		System.out.println("Student Country : "+stu3.getCountry() );

		ip.close();
	}

}
