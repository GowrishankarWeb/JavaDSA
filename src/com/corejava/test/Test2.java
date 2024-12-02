package com.corejava.test;

import java.util.Scanner;

public class Test2 {
	private static void xPattern(int n) {
		for(int i=1,c=0;i<=n;i++,c++) {
			for(int j=1;j<=n;j++) {
				if(i==j) {
					System.out.print(i);
				}
				else if(i==j-(n-i-c)) {
					System.out.print(i);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		Test2.xPattern(n);
		Test2.invertedStaircasePattern(n);
		Test2.boxPattern(n);
		
		scanner.close();
	}
	private static void boxPattern(int n) {
		int size=(n*2);
		int front=0;
		int last=size-1;
		int[][] arr=new int[size][size];
		while(n!=0) {
			for(int i=front;i<=last;i++) {
				for(int j=front;j<=last;j++) {
					if(i==front || j==front || j==last || i==last) {
						arr[i][j]=n;
					}
				}
			}
			front++;
			last--;
			n--;
		}
		print(arr,size);
	}
	private static void print(int[][] arr, int size) {
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	private static void invertedStaircasePattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n,k=n+1;j>=i;j--) {
				if(j==n) {
					System.out.print(i+" ");
					k--;
				}
				else {
					System.out.print(i+k+" ");
					k+=j;
				}
			}
			System.out.println();
		}
	}

}
