package com.corejava.exceptionhandling;

public class MyException {
	
	public void voteEligibleChecking(int age) throws CustomException, NewRuntimeException {
		if(age<18) {
			throw new CustomException("Sorry, You are not eligible for voting...!");
		}
		else {
			System.out.println("Eligible for voting");
			throw new NewRuntimeException("Eligible");
		}
	}

	public static void main(String[] args) {
		MyException myException = new MyException();	
		int age=17;
		try {
			myException.voteEligibleChecking(age);
		}
		catch(Exception exception) {
			System.out.println(exception);
		}
	}
}
