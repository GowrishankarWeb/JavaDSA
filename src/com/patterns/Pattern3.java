package com.patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		int n= ip.nextInt();
		ip.close();
		pattern(n);
	}
/*
You are given a number n. You need to print the pattern for the given value of n.

For n = 2 the pattern will be 
2 2 1 1
2 1

For n = 3 the pattern will be 
3 3 3 2 2 2 1 1 1
3 3 2 2 1 1
3 2 1
*/
	private static void pattern(int n) {
		for(int i=n;i>=1;i--){
            for(int j=n*i,k=n+1;j>=1;j--){
            	if(j%i==0) k-=1;
                System.out.print(k+" ");
            }
            System.out.println();
        }
	}

}
