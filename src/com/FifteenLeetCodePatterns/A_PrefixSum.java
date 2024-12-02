package com.FifteenLeetCodePatterns;

import java.util.Arrays;

public class A_PrefixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 prefix sum
		 in 0th position, put 0th element,
		 in 1st position, put 0+1,
		 in 2nd position, put 1+2,
		 in 3rd position, put 2+3
		 
		 benefits : 
		 
		 you can get the sum of sub array easily with the i and j index by the formula array[j] - array[i-1]
		 */
		
		int[] array= {5,2,1,4,7,49,4,7,4,41,254,2,5,51,54,2,29,5,5,322,565,464,4,6};

		System.out.println(Arrays.toString(array));
		
		for(int i=1;i<array.length;i++) {
			array[i]= array[i]+array[i-1];
		}
		System.out.println(Arrays.toString(array));
		//												 array[3]  array[8] 
		System.out.println("Sum of the subarray in the index of 4 and 9 is "+(array[8]-array[2]));
	}

}
