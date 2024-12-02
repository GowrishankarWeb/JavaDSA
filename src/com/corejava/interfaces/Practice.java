package com.corejava.interfaces;

public interface Practice {
	
	public static void display(){
		System.out.println("display");
	}
	
	public default void fun(){
		System.out.println("fun");
	}

}
