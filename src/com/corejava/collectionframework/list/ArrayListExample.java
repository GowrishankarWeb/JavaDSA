package com.corejava.collectionframework.list;
import java.util.ArrayList;
public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<>();
		ArrayList<Object> list1=new ArrayList<>();
		list.add("Note");
		list.add("Pen");
		System.out.println("list : "+list);
		list1.add("Book");
		list1.add("Poems");
		list1.add("Stories");
		list1.addAll(list);
		System.out.println("list1 : "+list1);
		list.add(list1);
		System.out.println("list : "+list);
		list.remove(0);
		System.out.println("list : "+list);
		list1.removeAll(list);
		System.out.println("list1 : "+list1);
		list.clear();
		System.out.println("list : "+list);
		list.add("Note");
		System.out.println("list : "+list);
		System.out.println("Is Note element contains in list ? "+list.contains("Note"));
		System.out.println("Is list1 contains in list ? "+list1.containsAll(list));
		System.out.println("Is list empty ? "+list1.isEmpty());
		System.out.println("list1's 3rd index value : "+list1.get(3));
		System.out.println("list1's elements : "+list1.toString());
		System.out.println("List1's size : "+list1.size());
		System.out.println("List's size : "+list.size());
		ArrayList<Object> list2=new ArrayList<>();
		list2.add(list1.clone());
		System.out.println("List2's elements : "+list2);
		System.out.println("list1 equals to elements [Book, Poems, Stories, Note] ? "+list1.equals(list1));
		list1.add(0,"Journals");
		list1.add(5," ");
		System.out.println(list1);
		list1.set(5, "Novels");
		System.out.println(list1);
		list1.trimToSize();
		System.out.println(list1);
	}
}
