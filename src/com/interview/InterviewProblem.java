package com.interview;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewProblem {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int noOfZeros=ip.nextInt();
		int array[]=new int[noOfZeros];
		for(int i=0;i<noOfZeros;i++) {
			array[i]=0;
		}
		System.out.println(Arrays.toString(array));
		int noOfInput=ip.nextInt();
		
		int start=0;
		int end=0;
		int k=0;
		for(int i=0;i<noOfInput;i++) {
			start=ip.nextInt();
			end=ip.nextInt();
			k=ip.nextInt();
			for(int j=start-1;j<end;j++) {
				array[j]+=k;
			}
			System.out.println(Arrays.toString(array));
			start=0;
			end=0;
			k=0;
		}
		
		int max=0;
		for(int i=0;i<noOfZeros;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println(max);
	}

}
/*
2.  1st length of the array, (5). 2nd no.of inputs (3).
1 is start, 2 is end, 100 is the k value should be added to the array.

First, we should initialize the array of 5 elements with zeros,

Arr={0,0,0,0,0}

Second, we should add the k value 100 to those positions given in the input,

Arr={100,100,0,0,0}

Third, we should add the k value 100 in already added array

Arr={100,200,100,0,0}

Fourth, we should do the same for the third time with the given input.

Arr={100,200,200,100,100}

Then return the greatest number in the array.

Input : 

5 3
1 2 100
2 3 100
3 5 100

Output : 

200

5
[0, 0, 0, 0, 0]
3
1
2
100
[100, 100, 0, 0, 0]
2
3
100
[100, 200, 100, 0, 0]
3
5
100
[100, 200, 200, 100, 100]
200

*/

