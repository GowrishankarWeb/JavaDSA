package com.corejava.collectionframework.task;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
public class Task {
	Collection<Employee> Details=new ArrayList<>();
	public static void main(String []args) {
		
		Task taskObject=new Task();
		Scanner scannerObject=new Scanner(System.in);
		Employee employeeObject=new Employee();
		
		int id = 0;
		boolean idStatus = true;
		System.out.println("Enter Employee Id: ");
		try {
			while (idStatus) {
				id = scannerObject.nextInt();
				if (0 < id) {
					employeeObject.setEmployeeId(id);
					idStatus = false;
				} else {
					System.out.println("Please Enter Valid Employee id !!!");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		String firstName = null;
		boolean firstNameStatus = true;
		System.out.println("Enter First Name: ");
		try {
			while (firstNameStatus) {
				scannerObject.nextLine();
				firstName = scannerObject.nextLine();
				if (!firstName.isEmpty()) {              
					employeeObject.setFirstName(firstName);    
					firstNameStatus = false;
				} else {
					System.out.println("Enter Valid First Name !");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		String lastName = null;
		boolean lastNameStatus = true;
		System.out.println("Enter Last Name: ");
		try {
			while (lastNameStatus) {
				lastName = scannerObject.nextLine();
				if (!lastName.isEmpty()) {              
					employeeObject.setLastName(lastName);    
					lastNameStatus = false;
				} else {
					System.out.println("Enter Valid Last Name !");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		String email = null;
		boolean emailStatus = true;
		System.out.println("Enter Email Address: ");
		try {
			while (emailStatus) {
				email = scannerObject.nextLine();
				if (!email.isEmpty()) {              
					employeeObject.setEmail(email);    
					emailStatus = false;
				} else {
					System.out.println("Enter Valid Email !");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		String password = null;
		boolean passwordStatus = true;
		System.out.println("Enter Password: ");
		try {
			while (passwordStatus) {
				password = scannerObject.nextLine();
				if (!password.isEmpty()) {              
					employeeObject.setPassword(password);    
					passwordStatus = false;
				} else {
					System.out.println("Enter Valid Password !");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		String dob = null;
		boolean dobStatus = true;
		System.out.println("Enter DOB: ");
		try {
			while (dobStatus) {
				dob = scannerObject.nextLine();
				if (!dob.isEmpty()) {              
					employeeObject.setDob(dob);    
					dobStatus = false;
				} else {
					System.out.println("Enter Valid DOB !");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		long aadhaarNumber = 0;
		boolean aadhaarNumberStatus = true;
		System.out.println("Enter Employee Aadhaar Number: ");
		try {
			while (aadhaarNumberStatus) {
				aadhaarNumber = scannerObject.nextLong();
				if (0 < aadhaarNumber) {
					employeeObject.setAadhaarNumber(aadhaarNumber);
					aadhaarNumberStatus = false;
				} else {
					System.out.println("Enter Valid Aadhaar Number");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		long phoneNumber = 0;
		boolean phoneNumberStatus = true;
		System.out.println("Enter Employee Phone Number: ");
		try {
			while (phoneNumberStatus) {
				phoneNumber = scannerObject.nextLong();
				if (0 < phoneNumber) {
					employeeObject.setPhoneNumber(phoneNumber);
					phoneNumberStatus = false;
				} else {
					System.out.println("Enter Valid Phone Number");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		String city = null;
		boolean cityStatus = true;
		System.out.println("Enter City: ");
		try {
			while (cityStatus) {
				scannerObject.nextLine();
				city = scannerObject.nextLine();
				if (!city.isEmpty()) {              
					employeeObject.setCity(city);    
					cityStatus = false;
				} else {
					System.out.println("Enter Valid City !");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		String state = null;
		boolean stateStatus = true;
		System.out.println("Enter State: ");
		try {
			while (stateStatus) {
				state = scannerObject.nextLine();
				if (!state.isEmpty()) {              
					employeeObject.setState(state);    
					stateStatus = false;
				} else {
					System.out.println("Enter Valid State !");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		String country = null;
		boolean countryStatus = true;
		System.out.println("Enter Country: ");
		try {
			while (countryStatus) {
				country = scannerObject.nextLine();
				if (!country.isEmpty()) {              
					employeeObject.setCountry(country);    
					countryStatus = false;
				} else {
					System.out.println("Enter Valid Country !");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		taskObject.Details.add(employeeObject);
		for(Employee e:taskObject.Details) {
			System.out.println("Employee's Id : "+e.getEmployeeId());
			System.out.println("Employee's First Name : "+e.getFirstName());
			System.out.println("Employee's Last Name : "+e.getLastName());
			System.out.println("Employee's Email : "+e.getEmail());
			System.out.println("Employee's Password : "+e.getPassword());
			System.out.println("Employee's DOB : "+e.getDob());
			System.out.println("Employee's Phone Number : "+e.getPhoneNumber());
			System.out.println("Employee's Aadhaar Number : "+e.getAadhaarNumber());
			System.out.println("Employee's City : "+e.getCity());
			System.out.println("Employee's State : "+e.getState());
			System.out.println("Employee's Country : "+e.getCountry());
		}
		scannerObject.close();
	}
}