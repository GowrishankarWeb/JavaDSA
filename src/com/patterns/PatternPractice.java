package com.patterns;

public class PatternPractice {
	
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<=n;i++) {
			for(int j=i+1,k=i+1,m=n;j<=n;j++,m--) {
				System.out.print(k+" ");
				k=k+m;
			}
			System.out.println();
		}
	}
/*
1 6 10 13 15 
2 7 11 14 
3 8 12 
4 9 
5 
*/
}
