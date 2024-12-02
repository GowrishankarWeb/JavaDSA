package com.corejava.test;

import java.util.Scanner;

public class PrimeNumberSeries {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int num=ip.nextInt();
		
		for(int i=1;i<=num;i++)
			if(checkPrime(i)) {
				System.out.println(i);
			}
		
		ip.close();
	}
	
	public static boolean checkPrime(int n)
	{
		if(n<2)
			return false;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
