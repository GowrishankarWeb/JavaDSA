package com.search;

public class BinarySearch {
	// works on sorted array only
	// suitable for large datasets like 100, 1 million data.
	// run time = 0(log N) 
	// efficient
	// arrays have default method like binary search
	
	public static void main(String[] args) {
		int []array= {18, 28 ,77 ,88 ,138 ,161 ,182 ,185 ,209 ,229 ,283 ,314 ,350 ,397 ,417 ,419 ,422 ,468 ,521 ,567 ,575 ,594 ,622 ,636 ,646 ,648 ,648 ,661 ,664 ,692 ,700 ,731 ,738 ,752 ,800 ,900 ,926};
		int target=350;
		/*for(int i=0;i<array.length;i++) {
			array[i]=i+1;
		}*/
		
		//System.out.println(Arrays.toString(array));
		//int found = Arrays.binarySearch(array, target);
		//int found=binarySearch(array, target);
		int found=binarysearch2(array, target);
		if(found==-1)
			System.out.println("Element Not Found");
		else
			System.out.println("Found at index "+ found);
	}

	private static int binarySearch(int[] array, int target) {

		int start=0, end=array.length-1;
		
		int middleIndex=0;
		int middleValue=0;
		
		while(start<=end) {
			
			middleIndex=start + (end-start)/2;
			middleValue=array[middleIndex];
			
			System.out.println(middleIndex);
			
			if(middleValue<target) start=middleIndex+1;
			else if(middleValue>target) end=middleIndex-1;
			else return middleIndex;
			
		}
		
		return -1;
	}
	public static int binarysearch2(int[] arr, int k) {
        // Code Here
       int start=0;
       int end=arr.length-1;
       while(start<=end) {
    	   int midInd=start+(end-start)/2;
    	   int midVal=arr[midInd];
    	   
    	   if(midVal<k) start=midInd+1;
    	   else if(k<midVal) end=midInd-1;
    	   else return midInd;
       }
        return -1;
    }
}
