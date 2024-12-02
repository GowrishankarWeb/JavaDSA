package com.corejava.patterns;
//44444444
//43333334
//43222234
//43211234
//43211234
//43222234
//43333334
//44444444

public class PatternBox {

	public static void main(String[] args) {
		int n=4;
		int size=n*2;
		int front=0;
		int last=size-1;
		int arr[][]=new int[100][100];
		while(n!=0) {
			for(int i=front;i<=last;i++) {
				for(int j=front;j<=last;j++) {
					if(i==front || i==last || j==front || j==last) {
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

}
