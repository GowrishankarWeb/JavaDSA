package com.corejava.test;

import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int m=ip.nextInt();
		int min=0,max=0;
		if(n<m) {min=n; max=m;}
		else {max=n; min=m;}
        System.out.println(max+" "+min);
        ip.close();
	}
}
