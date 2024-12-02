package com.corejava.abstraction;

public abstract class Departments extends College {
	public abstract void mechanical();
	public abstract int mechanicalStudentCount();
	

	@Override
	public void departmentsList() {
		// TODO Auto-generated method stub
		System.out.println("We have Mechanical Department");
	}
}
