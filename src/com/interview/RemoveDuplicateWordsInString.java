package com.interview;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordsInString {

	public static void main(String[] args) {
		String str="Hi Hi  Hello";
		String[] strArray=str.split(" ");
		for(String p:strArray)
			System.out.println(p);
		System.out.println();
		Set<String> s=new LinkedHashSet<>();
		StringBuilder sb=new StringBuilder();
		for(String st:strArray) {
			if(!s.contains(st)) {
				s.add(st);
				sb.append(st+" ");
			}
		}
		System.out.println(sb.toString());
	}

}
