package com.corejava.hierarchicalinheritance;

public class Rectangle extends Shape{
	
	public void rectangleMethod() {
		System.out.println("Rectangle Method");
	}
	
	public int rectangleArea(int l, int b) {
		return l*b;
	}

}
