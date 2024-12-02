package com.corejava.exceptionhandling;
public class Divide {
public int div(int n1, int n2) throws ArithmeticException{
	try {
		return(n1/n2);
	}
	catch(Exception e) {
		//System.out.println("Infinity will be the answer");
		//System.out.println("Exception occured while dividing");
		throw new ArithmeticException("Infinity will be the answer");
	}
	finally {
		System.out.println("This is finally block");
	}
}
}