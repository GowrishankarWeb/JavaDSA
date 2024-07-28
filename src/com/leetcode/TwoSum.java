package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
1. Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?

*/

//optimised from takeuforward
public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {
        int out[]=new int[2];
        Map<Integer,Integer> valueIndexMap=new HashMap<>();
        for(int i=0;i<nums.length;i++) {
        	if(valueIndexMap.containsKey(target - nums[i])) {
        		out[0]=valueIndexMap.get(target - nums[i]);
        		out[1]=i;
        		return out;
        	}
        	valueIndexMap.put(nums[i], i);
        }
        return out;
    }
	public int[] twoSum2(int[] nums, int target) { // success but more time taken 
        int out[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    out[0]=i;
                    out[1]=j;
                    return out;
                }
            }
        }
        return out;
	}
	public static void main(String[] args) {
		int nums[]= {2,7,11,15};
		int target=9;
		int out[]=twoSum(nums, target);
		for(int i:out) {
			System.out.print(i+" ");
		}
	}

}
