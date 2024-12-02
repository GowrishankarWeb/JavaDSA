package com.corejava.collectionframework.task;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeSimpleMain {
	List<EmployeeSimple> employeeList=new LinkedList<>();
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean status=true;
		int option;
		EmployeeSimpleMain employeeSimpleMain = new EmployeeSimpleMain();
		while(status) {
			System.out.println("Press\n1.Create Employee by entering employee details.\n"
					+ "2.Print all employee details.\n"+
					"3.Print particular employee detail alone.\n"+
					"4.exit.\n"+
					"5.Remove employee");
			option=scanner.nextInt();
			switch(option) {
			case 1:{
				System.out.println("Enter Employee ID:");
				int id=scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter Employee FirstName:");
				String firstName=scanner.next();
				System.out.println("Enter Employee Email:");
				String	email=scanner.next();
				System.out.println("Enter Employee City:");
				String	city=scanner.next();
				
				employeeSimpleMain.createEmployee(id, firstName, email, city);
				break;
			}
			case 2:{
				employeeSimpleMain.printAllEmployeeDetails();
				break;
			}
			case 3:{
				System.out.println("Enter Employee ID to Search for :");
				int id=scanner.nextInt();
				if(employeeSimpleMain.checkIdExists(id)) {
					employeeSimpleMain.printIdDetails(id);
				}
				else {
					System.out.println("There is no ID number that you have entered.");
				}
				break;
			}
			case 4:{
				employeeSimpleMain.printThankYou();
				status=false;
				break;
			}
			case 5:{
				System.out.println("Enter which id to remove:");
				int id=scanner.nextInt();
				employeeSimpleMain.removeThirdEmployeeDetails(id);
				break;
			}
			}
		}
		scanner.close();
	}
	private void removeThirdEmployeeDetails(int id) {
		for(EmployeeSimple e:employeeList) {
			//System.out.println("jhgjhgjhghjg");
			if(id==(e.getEmployeeId())) {
				System.out.println(id);
				System.out.println(e.getEmployeeId());
				System.out.println("jhgjhgjhghjg");
				System.out.println(id==(e.getEmployeeId()));
				employeeList.remove(e);
			}
			else {
				System.out.println("The id you entered is not available ");
			}
		}
				
	}
	private void printAllEmployeeDetails() {
		for(EmployeeSimple e:employeeList) {
			System.out.println(e.getEmployeeId());
			System.out.println(e.getFirstName());
			System.out.println(e.getEmail());
			System.out.println(e.getCity());
		}
	}
	private void printThankYou() {
		System.out.println("Thank You");
	}
	private void printIdDetails(int id) {
		for(EmployeeSimple e:employeeList) {
			if(id == e.getEmployeeId()) {
				System.out.println("ID for "+ id +" "+ e.getEmployeeId());
				System.out.println("Name for "+ id +" "+e.getFirstName());
				System.out.println("Email for "+ id +" "+e.getEmail());
				System.out.println("City for "+ id +" "+e.getCity());
			}
		}
		
	}
	private boolean checkIdExists(int id) {
		for(EmployeeSimple e:employeeList) {
			if(id == e.getEmployeeId()) {
				return true;
			}
		}
		return false;
	}
	private void createEmployee(int id, String firstName, String email, String city) {
		EmployeeSimple employeeSimple = new EmployeeSimple();
		employeeSimple.setEmployeeId(id);
		employeeSimple.setFirstName(firstName);
		employeeSimple.setEmail(email);
		employeeSimple.setCity(city);
		employeeList.add(employeeSimple);
	}

}
