package com.leetcode;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int []digits = {9,8,7,6,5,4,3,2,1,0};
		System.out.println(Arrays.toString(plusOne(digits)));
	}
	 public static int[] plusOne(int[] digits) {
		 
		 for(int i=digits.length-1;i>=0;i--) {
			 if(digits[i]<9) {
				 digits[i]+=1;
				 return digits;
			 }
			 else {
				 digits[i]=0;
			 }
		 }
		 
		 int nums[]=new int[digits.length+1];
		 nums[0]=1;
		 return nums;
     }
	
	 
}	
