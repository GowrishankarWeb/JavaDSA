package com.interview;

import java.util.Arrays;
import java.util.OptionalInt;

public class SecondMaxInArray {
	public static void main(String[] args) {
		int[] array = { 5, 2, 1, 4, 7, 49, 4, 7, 4, 41, 254, 2, 5, 51, 54, 2, 29, 5, 5, 322, 565, 464, 4, 6 };
		System.out.println(print2largest(array));
	}

	public static int print2largest(int[] arr) {
        // Code Here
        OptionalInt max=Arrays.stream(arr).max();
        int maxInArray=max.getAsInt();
        int secondMax=0;
        for(int i:arr){
            if(i>=secondMax && i<maxInArray) 
                secondMax=i;
        }
        if(secondMax!=0)
        	return secondMax;
        else
        	return -1;
    }
}
