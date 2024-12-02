package com.corejava.collectionframework.challenge5;
public class Challenge5_13Child extends Challenge5_13Parent {
	static void display(int n1) {
		System.out.println(n1);
	}
	static void display(int n1,int n2) {
		System.out.println(n1);
	}
	static void additionMethod(int n1,int n2) {
		System.out.println(n1+n2);
	}
	public static void main(String[] args) {
		// Write a program to Overload And override the static methods.
		Challenge5_13Child.display(10,12);
		Challenge5_13Child.display(50);
		Challenge5_13Child.additionMethod(12, 3433);
		Challenge5_13Parent.additionMethod(345, 4567467);
	}
}