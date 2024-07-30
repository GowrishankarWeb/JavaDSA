package com.leetcode;

import java.util.Arrays;
import java.util.Stack;

public class PlusOne {

	public static void main(String[] args) {
		int []digits = {9,8,7,6,5,4,3,2,1,0};
		System.out.println(Arrays.toString(plusOne(digits)));
	}
	 public static int[] plusOne(int[] digits) {
		 long n = getNum(digits)+1;
		 Stack<Integer> s=new Stack<>();
	        while(n>0) {
	            int rem=(int) (n%10);
	            n/=10;
	            s.push(rem);
	        }
	        int []returnArray=new int[s.size()];
	        for(int i=0;s.size()!=0;i++) {
	            returnArray[i]=s.peek();
	            s.pop();
	        }
	        return returnArray;
/*		 if(digits[digits.length-1]%9==0) {
			 Stack<Integer> s=new Stack<>();
			 int n=digits[digits.length-1]+1;
			 while(n>0) {
				 int rem=n%10;
				 n/=10;
				 s.push(rem);
			 }
			 int []returnArray=new int[s.size()];
			 for(int i=0;s.size()!=0;i++) {
				 returnArray[i]=s.peek();
				 s.pop();
			 }
			 return returnArray;
		 }
        digits[digits.length-1]=digits[digits.length-1]+1;
        return digits;*/
     }
	private static long getNum(int[] digits) {
		long n=0;
		for(long i=0;i<digits.length;i++) {
			n*=10;
			n+=digits[(int) i];
		}
		return n;
	}
	 
}	
