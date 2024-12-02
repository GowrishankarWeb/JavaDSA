package com.corejava.collectionframework.challenge5;

import java.util.ArrayList;
import java.util.List;

public class Challenge5_1 {
	//Write a program to check if a list of integers contains
	//only odd numbers in Java.
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(5);
		list.add(33);
		list.add(29);
		list.add(13);
		list.add(7);
		//list.add(2);
		boolean result=true;
		for(Integer i:list) {
			if(i%2==0) {
				result=false;
				System.out.println("No, This list contains even elements.");
				break;
			}
		}
		String finalResult = (result == true) ? "It contains only odd elements.": "It contains Even numbers also.";
		System.out.println(finalResult);
	}

}
