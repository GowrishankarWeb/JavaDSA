package com.corejava.collectionframework.challenge5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Challenge5_6 {

	public static void main(String[] args) {
		//Write a program to sort and reverse the ArrayList values.
		List<Integer> list=new ArrayList<>();
		list.add(3);list.add(1);
		list.add(3589093);
		list.add(11);
		list.add(21);list.add(211);list.add(349580);
		list.add(155);
		list.add(132);list.add(2345678);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
	}

}
