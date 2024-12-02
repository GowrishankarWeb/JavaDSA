package com.corejava.collectionframework.set;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> treeSet=new TreeSet<>();
		//Insertion order - No
		//Accepts null - No
		//Accepts Duplicate - No
		treeSet.add("Summer");
		treeSet.add("Summer");
		treeSet.add("Summer");
		treeSet.add("Winter");
		treeSet.add("Autumn");
		treeSet.add("Spring");
		//treeSet.add(null);
		System.out.println(treeSet);
		System.out.println(treeSet.contains("Summer"));
		System.out.println(treeSet.size());
		System.out.println(treeSet.first());
		System.out.println(treeSet.pollFirst());
		System.out.println(treeSet.pollLast());
		System.out.println(treeSet.remove("Spring"));
				
	}

}
