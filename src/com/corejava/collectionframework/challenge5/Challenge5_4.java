package com.corejava.collectionframework.challenge5;

import java.util.ArrayList;
import java.util.List;

public class Challenge5_4 {

	public static void main(String[] args) {
		//Write a program to convert one List to an Array.
		List<Integer> list1=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		Object[] array = list1.toArray();
		for(Object i:array) {
		System.out.println(i);
		}
	}

}
