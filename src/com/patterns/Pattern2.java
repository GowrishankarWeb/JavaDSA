package com.patterns;

import java.util.Scanner;
/*
5
*
**
***
****
*****
*/
public class Pattern2 {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n= ip.nextInt();
		ip.close();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
