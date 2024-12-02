package com.corejava.patterns;
public class Pattern3 {
	public static void main(String[] args) {
/*
54321
4321
321
21
1
*/
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(j);				
			}
			System.out.println();
		}
	}
}