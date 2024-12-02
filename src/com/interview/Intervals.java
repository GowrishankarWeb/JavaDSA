package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intervals {

	public static void main(String[] args) {
		int intervals[][]= {{1,3},{2,6},{8,10},{15,18}};
		List<int[]> result=new ArrayList<>();
		for(int i=0,j=0;i<intervals.length-1;i++) {
			if(intervals[i][1] >= intervals[i+1][0]) {
				int res[]=new int[2];
				res[0]=Math.min(intervals[i][0], intervals[i+1][0]);
				res[1]=Math.max(intervals[i][1],intervals[++i][1]);
				result.add(res);
			}
			else {
				int res[]=new int[2];
				res[0]=intervals[i][0];
				res[1]=intervals[i][1];
				result.add(res);
				if(i+1==intervals.length-1) {
					int res1[]=new int[2];
					res1[0]=intervals[++i][0];
					res1[1]=intervals[i][1];
					result.add(res1);
				}
			}
		}
		int returnArray[][]=new int[result.size()][2];
		for(int i=0;i<result.size();i++) {
			returnArray[i][0]=result.get(i)[0];
			returnArray[i][1]=result.get(i)[1];
		}
		
		for(int a[]:returnArray) {
			System.out.println(Arrays.toString(a));
		}
	}

}
