package com.corejava.exceptionhandling;
public class Exceptions {
	String name=null;
	int a;
	public static void main(String[] args) {
		Exceptions ex=new Exceptions();
		System.out.println("Print Statement 1");
		try {
			ex.a=10/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());			
		}
		System.out.println("Print Statement 2");
		try {
			char c=ex.name.charAt(0);
			System.out.println(c);
		}
		catch(NullPointerException e) {
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Print Statement 3");
	}
}