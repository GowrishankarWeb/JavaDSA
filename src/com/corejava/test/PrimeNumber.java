package com.corejava.test;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		int num=ip.nextInt();
		
		checkPrime(num);
		
		ip.close();
	}
	
	public static void checkPrime(int n)
	{
		int divisorCount=0;
		if(n<2) {
			System.out.println("The number "+n+" is neither prime nor composite");
			System.exit(0);
		}
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				divisorCount+=1;
		}
		if(divisorCount<=2) {
			System.out.println("The number "+n+" is prime");
		}
		else {
			System.out.println("The number "+n+" is not prime");
		}
	}
}
