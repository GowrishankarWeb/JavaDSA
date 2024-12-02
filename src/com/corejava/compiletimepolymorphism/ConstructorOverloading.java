package com.corejava.compiletimepolymorphism;

public class ConstructorOverloading {
	int c=10;
	public ConstructorOverloading(int a) {
		System.out.println(a);
	}
	
	public ConstructorOverloading(int a, int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading co = new ConstructorOverloading(1);
		ConstructorOverloading co1 = new ConstructorOverloading(1,2);
		System.out.println(co.c);
		System.out.println(co1.c);
	}

}
