package com.corejava.test;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int num=ip.nextInt();
		
		int rem, newNum=0;
		while(num>0) {
			rem=num%10;
			newNum=newNum*10+rem;
			num=num/10;
		}
		
		System.out.println(newNum);
		
		ip.close();
	}

}
