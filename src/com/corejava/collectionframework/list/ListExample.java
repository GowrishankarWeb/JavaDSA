package com.corejava.collectionframework.list;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ListExample {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		// TODO Auto-generated method stub
		List<Object> list=new ArrayList<Object>();
		List<Object> list1=new ArrayList<Object>();
		list.add("Java");
		list.add("C");
		System.out.println("list : "+list);
		list1.add("Python");
		list1.add("C++");
		list1.add("Ruby");
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
		list.add("Java");
		list.set(0, "large");
		System.out.println("list : "+list);
		System.out.println("Is Java element contains in list ? "+list.contains("Java"));
		System.out.println("Is list1 contains in list ? "+list1.containsAll(list));
		System.out.println("Is list empty ? "+list1.isEmpty());
		System.out.println("list1's 3rd index value : "+list1.get(3));
		System.out.println("list1's elements : "+list1.toString());
		list.add(ip.nextInt());
		System.out.println("list : "+list);
		ip.close();
	}

}
