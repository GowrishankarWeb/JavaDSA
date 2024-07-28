package com.patterns;
/*
5
*****
*****
*****
*****
*****
*/
import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n= ip.nextInt();
		ip.close();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
