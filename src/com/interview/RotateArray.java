package com.interview;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int len=arr.length;
		int k=3;
		//output = {4,5,6,7,8,9,10,1,2,3}
		int output[]=new int[10];
		for(int i=0;i<len-k;i++) {
			output[i]=arr[i+k];
		}
		for(int i=0;i<k;i++) {
			output[len-k+i]=arr[i];
		}
		System.out.println(Arrays.toString(output));
	}

}
