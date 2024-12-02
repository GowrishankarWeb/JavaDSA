package com.corejava.singleinheritance;

public class Parent {
	
	private String name;
	private int id;
	private double salary;
	
	
	public Parent() {
		this("Unknown", 0, 0000.0);
	}
	
	public Parent(String name, int id, double salary) {

		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	
	
	
}
