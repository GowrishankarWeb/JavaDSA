package com.sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[]= {26,4,7,55,32,3,12};
		insertion(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void insertion(int[] arr) {
		for(int i=0;i<=arr.length-2;i++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j-1] > arr[j])
					swap(arr, j-1, j);
				else
					break;
			}
		}
	}

	private static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
	
	
}
