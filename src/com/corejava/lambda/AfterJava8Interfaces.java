package com.corejava.lambda;

public interface AfterJava8Interfaces {

	default int defaultMethod() {
		return 0;
	}
	static int staticMethod() {
		return 0; //for utility functions
	}//only called by using interface.methodName();
}
