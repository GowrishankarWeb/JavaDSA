package com.corejava.constructor;

public class Class1 {
	/*
	 * default
	 * parameterised
	 * non-parameterised*/
	void run() {
		System.out.println("running");
	}
	int a;
	String string;
	Class1(){
		a=10;
		string="run";
	}
	public static void main(String[] args) {
		Class1 class1=new Class1();
		class1.run();
		System.out.println(class1.a);
		System.out.println(class1.string);
		
	}

}
