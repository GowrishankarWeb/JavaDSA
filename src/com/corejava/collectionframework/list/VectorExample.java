package com.corejava.collectionframework.list;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		List<Object> vector=new Vector<>();
		vector.add("Java");
		vector.add(2);
		vector.add(13.5);
		vector.add('$');
		System.out.println("Vector equals vector ? : "+vector.equals(vector));
		vector.addAll(vector);
		System.out.println(vector.get(vector.size()-1));
		vector.set(7, "Android");
		System.out.println(vector);
		vector.remove("Android");
		System.out.println(vector);
		Vector<Object> vector1=new Vector<>();
		vector1.addAll(vector);
		System.out.println(vector1);
		System.out.println(vector1.capacity());
		System.out.println(vector1.size());
		
	}

}
