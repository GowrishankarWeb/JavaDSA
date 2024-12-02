package com.interview;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		ip.close();
		
		int out=0;
		while(n>0) {
			int rem=n%10;
			out=(out*10)+rem;
			n/=10;
		}
		System.out.println(out);
	}

}
