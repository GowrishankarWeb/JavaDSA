package com.interview;

public class Annular {
	public static void main(String[] args) {//16,19
		int arr[]= {6,6,2,2,2,2,2,6,2,2,2,2,2,2,2,2,2,2,2,4,4,4,4,4};
		int occurance=1;
		boolean AboveHalf=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int arrI=arr[i], arrJ=arr[j];
				if(arrI==arrJ) {
					occurance++;
					if(occurance>arr.length/2) {
						System.out.println(arr[i]);
						AboveHalf=true;
						break;
					}
				}
			}
			occurance=1;
			if(AboveHalf) {
				break;
			}
		}
		if(!AboveHalf) {
			System.out.println(-1);
		}
	}
}
