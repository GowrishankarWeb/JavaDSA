package com.corejava.test;

import java.util.Scanner;

public class InputTypes {
	
	public static void main(String []args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter Roll Number : ");
		int rollNo = ip.nextInt();               // 2 10            
		ip.nextLine();
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Float.SIZE);
		
		
		System.out.println("Enter Name : ");
		String name = ip.nextLine();
		System.out.println("Enter Age : ");
		int age = ip.nextInt();
		System.out.println("Enter Phone Number : ");
		long phoneNumber = ip.nextLong(); //19 9-
		System.out.println("Enter Percentage : ");
		float percentage = ip.nextFloat();
		char c=ip.next().charAt(0);
		ip.nextLine();
		System.out.println("Enter Native Place: ");
		String nativePlace = ip.nextLine();
	
		System.out.println("Your Details are : ");
		System.out.println("Your Roll No : "+rollNo);
		System.out.println("Your Name : "+name);
		System.out.println("Your Age : "+age);
		System.out.println("Your Phone Number : "+phoneNumber);				
		System.out.println("Your Percentage: "+ percentage);
		System.out.println("Your Native Place: "+nativePlace);
	}
}
