package com.corejava.collectionframework.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<Object> linkedList=new LinkedList<>();
		linkedList.add("Fruits");
		linkedList.add(46);
		linkedList.add("Vegetables");
		linkedList.add(13.4);
		
		List<Object> linkedList1=new LinkedList<>();
		linkedList.add("Carrot");
		linkedList.add(55);
		linkedList.add("Beetroot");
		linkedList.add(13.7);
		linkedList.addAll(0,linkedList1);
		
		System.out.println("Is list contains Beetroot ?"
				+ " "+linkedList.contains("Beetroot"));
		System.out.println("Is linkedListcontains all linkedList1"
				+ " elements ? "+linkedList.containsAll(linkedList1));
		
		System.out.println("linkedList's size " + linkedList.size());
		System.out.println("Carrot's index in linkedList is "+ linkedList.indexOf("Carrot"));
		System.out.println("is linkedList is empty ? "+linkedList.isEmpty());
		
		System.out.println("Removing Fruits in linkedList !");
		linkedList.remove(0);
		System.out.println(linkedList);
		
	}

}
