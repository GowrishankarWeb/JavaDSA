package com.corejava.test;

public class Sorting {

	public static void main(String[] args) {
			int arr[]={23,43,12,54,32,11,76,32,83,73,9,5,84,83,29,30};
			int temp=0;
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr.length;j++){
					if(arr[i]>arr[j]){
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			for(int i=0;i<arr.length;i++){
				System.out.println(arr[i]);
			}

	}

}
