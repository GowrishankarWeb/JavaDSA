package com.corejava.test;

public class VariableType{

int a=25; //instance
static int b = 45; //static or class variable

public static void main(String[] args){
	
	int c = 55;
	VariableType obj = new VariableType();
	System.out.println("Instance Variable : "+obj.a);
	System.out.println("Static Variable : "+VariableType.b);
	System.out.println("Local Variable : "+c);
}
public void age() {
	VariableType obj = new VariableType();
	System.out.println(obj.a);
}
}