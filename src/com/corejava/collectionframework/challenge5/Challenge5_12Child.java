package com.corejava.collectionframework.challenge5;

public class Challenge5_12Child extends Challenge5_12Parent{

	public static void main(String[] args) {
		System.out.println("Main Method from Child Class");
		String[] arr1= {"1","2","3"};
		Challenge5_12Parent.main(arr1);
	}

}
