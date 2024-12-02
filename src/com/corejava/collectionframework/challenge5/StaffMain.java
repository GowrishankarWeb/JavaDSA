package com.corejava.collectionframework.challenge5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class StaffMain {
	List<Staff> staffList=new ArrayList<>();
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean status=true;
		int option;
		StaffMain staffMain=new StaffMain();
		while(status) {
			System.out.println("Press\n"+
					"1.Create Staff by entering staff details.\n"+
					"2.Print all staff details.\n"+
					"3.Print particular staff detail alone.\n"+
					"4.Remove a staff's detail\n"+
					"5.exit.\n");
			option=scanner.nextInt();
			switch(option) {
			case 1:{
				System.out.println("Enter Staff ID:");
				int id=scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter Staff Name:");
				String name=scanner.next();
				System.out.println("Enter Staff Email:");
				String email=scanner.next();
				
				staffMain.createStaff(id, name, email);
				break;
			}
			case 2:{
				staffMain.printAllEmployeeDetails();
				break;
			}
			case 3:{
				System.out.println("Enter Particular Staff ID to Search for :");
				int id=scanner.nextInt();
				if(staffMain.checkIdExists(id)) {
					staffMain.printIdDetails(id);
				}
				else {
					System.out.println("There is no ID number that you have entered.");
				}
				break;
			}
			case 4:{
				System.out.println("Enter which id to remove:");
				int id=scanner.nextInt();
				staffMain.removeStaffDetails(id);
				break;
			}
			case 5:{
				staffMain.printThankYou();
				status=false;
				break;
			}
			}
		}
		scanner.close();
	}
	private void removeStaffDetails(int id) {
		Iterator<Staff> i = staffList.iterator();
		while(i.hasNext()) {
			if(id==(i.next().getStaffId())) {
				i.remove();
			}
		}

	}
	private void printThankYou() {
		System.out.println("Thank You");
	}
	private void printIdDetails(int id) {
		for(Staff staff:staffList) {
			if(id == staff.getStaffId()) {
				System.out.println("ID for "+ id +" "+ staff.getStaffId());
				System.out.println("Name for "+ id +" "+staff.getStaffName());
				System.out.println("Email for "+ id +" "+staff.getStaffEmail());
			}
		}		
	}
	private boolean checkIdExists(int id) {
		for(Staff staff:staffList) {
			if(id == staff.getStaffId()) {
				return true;
			}
		}
		return false;
	}
	private void printAllEmployeeDetails() {
		for(Staff staff:staffList) {
			System.out.println(staff.getStaffId());
			System.out.println(staff.getStaffName());
			System.out.println(staff.getStaffEmail());
		}	
	}
	private void createStaff(int id, String name, String email) {
		Staff staff = new Staff();
		staff.setStaffId(id);
		staff.setStaffName(name);
		staff.setStaffEmail(email);
		staffList.add(staff);
	}
}