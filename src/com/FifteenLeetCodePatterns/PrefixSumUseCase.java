package com.FifteenLeetCodePatterns;

import java.util.Arrays;

public class PrefixSumUseCase {

	public static void main(String[] args) {
		int arr[]= {1,1,1};
		int k=2;
        System.out.println("Normal Array = "+Arrays.toString(arr));
		System.out.println(subarraySum(arr,k));
	}
	
	public static int subarraySum(int[] nums, int k) {
        if(nums.length==1) 
            {
                if(nums[0]==k) return k;
                else return 0;
            }
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        System.out.println("PrefixSummed Array = "+Arrays.toString(nums));
        int count=0;
		for(int i=1;i<nums.length;i++) {
			if(k==nums[i]-nums[i-2]) {
				count++;
			}
		}
		return count;
    }

}
