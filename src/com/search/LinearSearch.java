package com.search;

import java.util.Arrays;
import java.util.Random;

public class LinearSearch {
	
	//O(n)
	
	public static void main(String[] args) {
		Random random=new Random();
		int []array=new int[10];
		int target=5;
		for(int i=0;i<array.length;i++) {
			array[i]=random.nextInt(10);
		}
		
		System.out.println(Arrays.toString(array));
		
		int found=linearSearch(array, target);
		if(found==-1)
			System.out.println("Element Not Found");
		else if(found == 1)
			System.out.println("Element Found");
	}

	private static int linearSearch(int[] array, int target) {
		for(int i=0;i<array.length;i++) {
			if(array[i]==target) {
				System.out.println(target+" found at index "+i);
				return 1;
			}
		}
		return -1;
	}
	
	
}
