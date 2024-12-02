package com.corejava.collectionframework.challenge5;

import java.util.ArrayList;
import java.util.List;

public class Challenge5_2 {
	//Write a program to check if a list of integers contains
		//only even numbers in Java.

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(52);
		list.add(332);
		list.add(292);
		list.add(132);
		list.add(72);
		//list.add(21);
		boolean result=true;
		for(Integer i:list) {
			if(i%2!=0) {
				result=false;
				System.out.println("No, This list contains odd elements.");
				break;
			}
		}
		String finalResult = (result == true) ? "It contains only even elements.": "It contains odd numbers also.";
		System.out.println(finalResult);
	}
}
