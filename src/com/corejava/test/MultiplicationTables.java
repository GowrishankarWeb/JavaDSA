package com.corejava.test;

import java.util.Scanner;

public class MultiplicationTables {
	public static void main(String []args) {
		Scanner ip=new Scanner(System.in);
		int a = ip.nextInt();
		int b = ip.nextInt();
		for(int i=1;i<=b;i++) {
			System.out.println(i+"*"+a+"="+i*a);
		}
	}
}
