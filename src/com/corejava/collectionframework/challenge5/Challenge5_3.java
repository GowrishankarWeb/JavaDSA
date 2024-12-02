package com.corejava.collectionframework.challenge5;

import java.util.ArrayList;
import java.util.List;

public class Challenge5_3 {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		List<Integer> list3=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		list2.add(9);
		list2.add(10);
		list3.addAll(list1);
		list3.addAll(list2);
		System.out.println(list3);
	}

}
