package com.corejava.accessmodifiers;
public class PrivateClass {
	private String name="Student";
	private int age = 23;
	private void display() {
		System.out.println(name+" "+age);
	}
	public static void main(String[] args) {
		PrivateClass prc=new PrivateClass();
		prc.display();
		System.out.println(prc.name+" "+prc.age);
	}
}