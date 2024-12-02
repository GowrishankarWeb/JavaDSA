package com.corejava.patterns;
import java.util.Arrays;
import java.util.Scanner;
public class ArraySortingOddPositionsAndEvenPositions {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n = scanner.nextInt();
		int inputArray[]=new int[n];
		for(int i=0;i<n;i++) {
			inputArray[i]=scanner.nextInt();
		}
		scanner.close();
		int evenArray[]=new int[n];
		int oddArray[]=new int[n];
		int e=0,o=0;
		for(int i=0;i<n;i++) {
			if(inputArray[i]%2==0) {
				evenArray[e++]=inputArray[i];
			}
			else {
				oddArray[o++]=inputArray[i];
			}
		}
		for(int i=0;i<e;i++) {
			for(int j=i+1;j<e;j++) {
				if(evenArray[i]<evenArray[j]) {
					int temp=evenArray[i];
					evenArray[i]=evenArray[j];
					evenArray[j]=temp;
				}
			}
		}
		
		for(int i=0;i<o;i++) {
			for(int j=i+1;j<o;j++) {
				if(oddArray[i]>oddArray[j]) {
					int temp=oddArray[i];
					oddArray[i]=oddArray[j];
					oddArray[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(inputArray));
		System.out.println(Arrays.toString(oddArray));
		System.out.println(Arrays.toString(evenArray));
		int i=0,j=0;
		for(;i<o&&j<e;i++,j++) {
			System.out.print(oddArray[i]+" "+evenArray[j]+" ");
		}
		while(i<o) {
			System.out.print(oddArray[i]+" ");
			i++;
		}
		while(j<e) {
			System.out.print(evenArray[j]+" ");
			j++;
		}
	}
}