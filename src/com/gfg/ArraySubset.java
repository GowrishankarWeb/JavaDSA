package com.gfg;

import java.util.Arrays;

public class ArraySubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long a1[] = {11, 7, 1, 13, 21, 3, 7, 3};
		//long a2[] = {11, 3, 7, 1, 7};
		//System.out.println(isSubset(a1,a2,a1.length,a2.length));
		int[] arr= {1,2,3,4,6};
		
		System.out.println(searchInSorted(arr,5,6));
	}
	 static int searchInSorted(int arr[], int N, int K) {
	        int start = 0, end = N;
	        
	        int foundInd=0;
	        boolean found = false;
	        while(start>end){
	            int midInd= start+(end-start)/2;
	            int midVal= arr[midInd];
	            if(K>midVal) start = midInd;
	            else if(K<midVal) end = midInd;
	            else {foundInd=midInd; found=true;}
	        }
	        if(found) return 1;
	        else return -1;
	    }
	
	public static String isSubset( long a1[], long a2[], long n, long m) {
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        boolean contains=false;
        long min=0,max=0;
		if(n<m) {min=n; max=m;}
		else {max=n; min=m;}
        /*for(int i=0;i<max;i++){
            for(int j=0;j<max;j++){
                if(a1[i]==a2[j]){
                    contains=true;
                    break;
                }else{
                    contains=false;
                }
            }
        }*/
		
		int count =0;
		for(int i=0,j=0;i<max&&j<min;) {
			if(a1[i]==a2[j]) {
				count++;
				i++;j++;
			}else if(a1[i]!=a2[j]) {
				i++;
			}
		}
        if(count == min)
            return "Yes";
        else
            return "No";
        
    }

}
