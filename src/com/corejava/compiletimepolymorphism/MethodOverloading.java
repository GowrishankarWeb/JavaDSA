package com.corejava.compiletimepolymorphism;

public class MethodOverloading {
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c, int d, int e) {
		return a+b+c+d+e;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mo=new MethodOverloading();
		System.out.println(mo.add(1,3));
		System.out.println(mo.add(1,2,3,4,5));
	}

}
