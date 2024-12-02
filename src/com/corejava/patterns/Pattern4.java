package com.corejava.patterns;
public class Pattern4 {
	public static void main(String[] args) {
/*
54321
5432
543
54
5
*/
		int n=5;
		for(int i=1;i<=5;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(j);				
			}
			System.out.println();
		}
	}
}