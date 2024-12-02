package com.corejava.abstraction;

public class Class4 {

	public static void main(String[] args) {
		Class1 obj1=new Class2();
		obj1.method1();
		obj1.method2();
		Class1 obj2=new Class3();
		obj2.method1();
		obj2.method2();
		obj1.print();
		obj2.print();
	}

}
