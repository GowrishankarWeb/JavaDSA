package com.interview;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,8,77,6,57,99,65,4,2,3,3,1,0,456,6,8,7,654,3,4,567,8,7,6541};
		int max=arr[0];
		int secMax=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min){
				 min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(max>arr[i] && arr[i]>secMax) {
				secMax=arr[i];
			}
		}
		System.out.println(min+" "+max);
		System.out.println(secMax);
	}

}
