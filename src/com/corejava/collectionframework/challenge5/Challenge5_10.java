package com.corejava.collectionframework.challenge5;

import java.util.Scanner;

public class Challenge5_10 {

	public static void main(String[] args) {
		//Write a program to get distinct characters and 
		//their count in a string in Java. Input: Welcome To Techymeet.
		String input=new String();
		Scanner scanner=new Scanner(System.in);
		input=scanner.nextLine();
		
		String result=new String();//techym
		
		//012345678
		//techymeet 9
		for(int i=0;i<input.length();i++) {
			//System.out.println(result.indexOf(input.charAt(i))); 
			if(result.indexOf(input.charAt(i))==-1) { //result.indexOf('e')
				result+=input.charAt(i); 
			}
		}
		System.out.println(result);
		System.out.println(result.length());
		scanner.close();
		
	}

}