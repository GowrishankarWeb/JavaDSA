package com.corejava.lambda;

public class Main {
	
	/*
	 Lambda expression is used for concise programming 
	 
	 Lambda is used for creating anonymous methods and anonymous inner classes
	*/

	public static void main(String[] args) {
		//using the implementation of imple class
		FunctionalInterfaceExample fie=new FunctionalInterfaceExampleImpl();
		System.out.println(fie.call());
		
		//creating a new Implementation
		FunctionalInterfaceExample fie1=()->{return 7000;};
		System.out.println(fie1.call());
		
		System.out.println(fie1.defaultMethod());
		
		//creating a implementation for a return type with argument methods
		FunctionalInterface2 fi2=(a,b)->{return (a+b);};
		System.out.println(fi2.add(274755, 24572));
		
	}

}