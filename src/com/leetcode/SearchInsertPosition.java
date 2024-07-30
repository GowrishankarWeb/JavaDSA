package com.leetcode;

public class SearchInsertPosition {
/*
Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4

nums =
[1,3]
target =
1

Output 0
*/

	public static void main(String[] args) {
		int[] nums = {1,3};
		int target = 1;
		System.out.println(searchInsert(nums,target));
	}
	public static int searchInsert(int[] nums, int target) {
        if(target>nums[nums.length-1]) return nums.length;
        if(target<=nums[0]) return 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=target && target<=nums[i+1]) 
            	return i+1;
        }
        return 0;
    }

}
