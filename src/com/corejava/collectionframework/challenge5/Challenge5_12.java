package com.corejava.collectionframework.challenge5;

public class Challenge5_12 {
	public static void main(String[] arr1,String []arr2) {
		for(String s:arr1) {
			System.out.println(s);
		}
		for(String s:arr2) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		for(String s:args) {
			System.out.println(s);
		}
		String[] arr1= {"1","2","3"};
		String[] arr2= {"4","5","6"};
		Challenge5_12.main(arr1, arr2);
	}
	
	
}
