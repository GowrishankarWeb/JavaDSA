package com.corejava.collectionframework.challenge5;

import java.util.Scanner;

public class Challenge5_11 {

	public static void main(String[] args) {
		// Write a program to Remove duplicate characters
		//in a String in Java. Input: Techymeet.   Output: Techymt.
		String input=new String();
		Scanner scanner=new Scanner(System.in);
		input=scanner.nextLine();
		String result=new String();
		
		for(int i=0;i<input.length();i++) {
			if(!result.contains(String.valueOf(input.charAt(i)))) {
				result+=input.charAt(i);
			}
		}
		System.out.println(result);
		//System.out.println(result.length());
		scanner.close();

	}

}
