package com.corejava.collectionframework.set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class SetExample {
	public static void main(String[] args) {
		Set<Object> hashSet=new HashSet<>(); 
		hashSet.add("Java");
		hashSet.add(true);
		hashSet.add("Java");
		hashSet.add(true);
		hashSet.add(100);
		hashSet.add(100);
		hashSet.add(34);
		hashSet.add(23.2);
		hashSet.add(98);
		Iterator<Object> iterator= hashSet.iterator();
		int i=1;
		while(iterator.hasNext()) {
			System.out.println(i++ +" "+ iterator.next());
		}
		
		HashSet<Object> pureHashSet=new HashSet<>(); 
		pureHashSet.add(hashSet);
		pureHashSet.add("Last");
		Iterator<Object> iterator2= pureHashSet.iterator();
		int j=1;
		while(iterator2.hasNext()) {
			System.out.println(j++ +" "+ iterator2.next());
		}
		System.out.println(pureHashSet.contains(100));
		System.out.println(pureHashSet.contains("Last"));
		System.out.println(pureHashSet.size());
		System.out.println(pureHashSet.isEmpty());
		pureHashSet.clear();
		System.out.println(pureHashSet.isEmpty());
	}

}
