package com.corejava.multipleinheritance;
public class Class1 implements Interface3{
	public static void main(String[] args) {
		Interface3 class1impl = new Class1();
		class1impl.displayMessage1();
		class1impl.displayMessage2();
		class1impl.displayMessage3();
		class1impl.displayMessage4();
		//class1impl.disoly(); cannot call disoly because of loose coupling
	}
	@Override
	public void displayMessage4() {
		System.out.println("This message4 is from interface 4");
	}
	@Override
	public void displayMessage1() {
		System.out.println("This message1 is from interface 1");
	}
	@Override
	public void displayMessage2() {
		System.out.println("This message2 is from interface 2");
	}
	@Override
	public void displayMessage3() {
		System.out.println("This message3 is from interface 3");
	}
//	public void disoly() {
//		System.out.println("New");
//	}
}
