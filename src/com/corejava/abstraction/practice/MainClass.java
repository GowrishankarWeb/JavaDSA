package com.corejava.abstraction.practice;

public abstract class MainClass {
	
	abstract void display();
	
	public void fun() {
		System.out.println("Fun");
	}
	
	public static void code() {
		System.out.println("Code");
	}
	
	public static void main(String[] args) {
		MainClass.code();
		SecondClass.jug(); 
		//MainClass mc=new MainClass(); //Cannot instantiate the type MainClass
		
	}

}
