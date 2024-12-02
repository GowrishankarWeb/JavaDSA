package com.corejava.collectionframework.collectionexample;
import java.util.Collection;
import java.util.ArrayList;
public class CollectionExample {
	public static void main(String[] args) {
		Collection<Object> collectionObject = new ArrayList<>();
		collectionObject.add("Notes");
		collectionObject.add(18);
		collectionObject.add(19);
		collectionObject.add(2.14);
		collectionObject.add(true);
		collectionObject.add('c');
		System.out.println(collectionObject);
		int i=1;
		for(Object object:collectionObject) {
			System.out.println(i++ +" "+object);
		}
		System.out.println("is contains 'Notes' data ? "+collectionObject.contains("Notes"));
		System.out.println("is this collection empty ? "+collectionObject.isEmpty());
		System.out.println("Removing 19 : "+collectionObject.remove(19));
		System.out.println(collectionObject);
		System.out.println("Size of this collection : "+collectionObject.size());
		System.out.println("is contains all [Notes, 18, 2.14, true, c] ? "+collectionObject.containsAll(collectionObject));
	}
}