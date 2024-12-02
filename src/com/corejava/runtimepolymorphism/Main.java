package com.corejava.runtimepolymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle ca=new Circle();
		System.out.println("Circle area : "+ca.area(5));
		//System.out.println(ca.money);
		Square sa=new Square();
		System.out.println("Square area : "+sa.area(4));

	}

}
