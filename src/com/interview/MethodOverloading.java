package com.interview;

public class MethodOverloading {
	
	//same name different parameters
	//return type may or may not differ
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static double add(int a, int b, int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		System.out.println(add(1,2));
		System.out.println(add(1,2,3));
	}

}
