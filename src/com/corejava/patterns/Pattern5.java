package com.corejava.patterns;
public class Pattern5 {
	public static void main(String[] args) {
		/**
1
2 3
4 5 6
7 8 9 10
*/		
		
		int n=5;
		int c=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(c++ + " ");
			}
			System.out.println();
		}
	}
}