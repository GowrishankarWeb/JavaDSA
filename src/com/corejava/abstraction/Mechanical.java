package com.corejava.abstraction;

public class Mechanical extends Departments {
	@Override
	public void mechanical() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Mechanical Department");
	}
	
	@Override
	public int mechanicalStudentCount() {
		// TODO Auto-generated method stub
		int studentCount=120;
		return studentCount;
	}
	
	public static void main(String []args) {
		Mechanical mech=new Mechanical();
		mech.departmentsList();
		mech.mechanical();
		System.out.println(mech.mechanicalStudentCount());
	}

}
