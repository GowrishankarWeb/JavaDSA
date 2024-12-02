package com.corejava.collectionframework.challenge5;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Challenge5_7 {
	public static void main(String []args) {
		//Write a program to remove all the duplicate values from ArrayList.
		List<Integer> list=new ArrayList<>();List<Integer> list1=new ArrayList<>();
		list.add(1);list.add(1);list.add(1);
		list.add(2);list.add(2);list.add(2);
		list.add(3);list.add(3);list.add(3);
		System.out.println(list);
		Set<Integer> set=new LinkedHashSet<>(list);
		System.out.println(set);
		for(Integer i:list) {
			if(!list1.contains(i)) {
				list1.add(i);
			}
		}
		System.out.println(list1);
	}
}
