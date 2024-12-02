package com.corejava.exceptionhandling;
public class Vote {
	public void vote(int age) throws Exception{
		if(age<18) {
			//System.out.println("Not Eligible to vote");
			throw new Exception("Not Eligible to vote");
		}
		else {
			System.out.println("Eligible");
		}
	}
}