package com.corejava.collectionframework.challenge5;

import java.util.ArrayList;
import java.util.List;

public class Challenge5_5 {

	public static void main(String[] args) {
		//Write a program to convert an Array to a List.
		int[] array=new int[5];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		array[4]=5;
		List<Integer> list1=new ArrayList<>();
		for(int i:array) {
			list1.add(i);
		}
		System.out.println(list1);
	}
	

}
