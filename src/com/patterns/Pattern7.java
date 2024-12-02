package com.patterns;

public class Pattern7 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++){
            for(int j=1;j<2*n;j++){
                if(i==n) System.out.print("*");
            }
            System.out.println();
        }
	}
}
