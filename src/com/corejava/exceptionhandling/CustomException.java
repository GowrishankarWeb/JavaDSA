package com.corejava.exceptionhandling;

public class CustomException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomException() {
		
	}
	
	public CustomException(String CustomMessage) {
		super(CustomMessage);
	}

}
