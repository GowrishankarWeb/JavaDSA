package com.corejava.lambda;

@FunctionalInterface
public interface FunctionalInterfaceExample {
	
	/*
	 * rule 1 : must have atleast one abstract method
	 * other can have one default method and static method
	 */
	
	//abstract method
	int call();
	
	//default method
	default String defaultMethod() {
		return "Default method called in functional interface";
	}
	
	//static method
	static int staticMethod() {
		return 0;
	}
	
}

//abstract default static int defaultMethod2();
	// abstract, default, static cannot used these three in one line;
	