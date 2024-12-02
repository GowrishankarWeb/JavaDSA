package com.corejava.singleinheritance;

public class Child extends Parent {
	
	private String dept;
	
	public Child(String name, int id, double salary) {
		super(name, id, salary);
	}
	
	public Child(String dept) {
		super();
		this.dept = dept;
	}
	
	
	
	
}
