package com.corejava.test;

import java.util.Scanner;

public class ReplaceElementWithGreatestElementOnRight {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		/*int len=ip.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<len;i++)
			arr[i]=ip.nextInt();
		*/
		int arr[]={16, 17, 4, 3, 5, 2};
		replaceElementWithGreatestElementOnRight(arr);
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		ip.close();
	}

	private static void replaceElementWithGreatestElementOnRight(int[] arr) {
		int maxFromRight=-1;
		for(int i=arr.length-1;i>=0;i--) {
			int current = arr[i];
			arr[i]=maxFromRight;
			if(current > maxFromRight)
				maxFromRight=current;
		}
	}

}
