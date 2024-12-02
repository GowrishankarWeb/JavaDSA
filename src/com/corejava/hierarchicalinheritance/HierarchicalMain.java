package com.corejava.hierarchicalinheritance;

public class HierarchicalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Square sq=new Square();
		sq.area();
		System.out.println("Square Area of side 4: "+sq.squareArea(4));
		sq.squareMethod();
		sq.parentShapeMethod();
		
		Rectangle re=new Rectangle();
		sq.area();
		System.out.println("Rectangle Area of length 18 and breadth 6 is : "+re.rectangleArea(18, 6));
		re.rectangleMethod();
		re.parentShapeMethod();
		
	}

}
