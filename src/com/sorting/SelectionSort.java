package com.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {3,5,2,6,1,4};
		selection(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void selection(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int last = arr.length-i-1;
			int maxIndex=findMaxIndex(arr, last);
			swap(arr,maxIndex,last);
		}
	}

	private static void swap(int[] arr, int maxIndex, int last) {
		int temp=arr[last];
		arr[last]=arr[maxIndex];
		arr[maxIndex]=temp;
	}

	private static int findMaxIndex(int[] arr, int last) {
		int max=0, maxIndex=0;
		for(int i=0;i<=last;i++) {
			if(max<arr[i]){
				max=arr[i];
				maxIndex=i;
			}
		}
		return maxIndex;
	}
	

}
