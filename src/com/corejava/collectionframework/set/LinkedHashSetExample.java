package com.corejava.collectionframework.set;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
public class LinkedHashSetExample {
	public static void main(String[] args) {
		Set<Object> linkedHashSet=new LinkedHashSet<>(); 
		linkedHashSet.add("Java");
		linkedHashSet.add(true);
		linkedHashSet.add("Java");
		linkedHashSet.add(true);
		linkedHashSet.add(null);linkedHashSet.add(null);
		linkedHashSet.add(100);
		linkedHashSet.add(100);
		linkedHashSet.add(34);
		linkedHashSet.add(23.2);
		linkedHashSet.add(98);
		Iterator<Object> iterator= linkedHashSet.iterator();
		int i=1;
		while(iterator.hasNext()) {
			System.out.println(i++ +" "+ iterator.next());
		}
		
		LinkedHashSet<Object> pureLinkedHashSet=new LinkedHashSet<>(); 
		pureLinkedHashSet.add(linkedHashSet);
		pureLinkedHashSet.add("Last");
		pureLinkedHashSet.add(45);
		Iterator<Object> iterator2= pureLinkedHashSet.iterator();
		//int j=1;
		while(iterator2.hasNext()) {
			//System.out.println(j++ +" "+ iterator2.next());
			//if(45==iterator2.next())
			pureLinkedHashSet.remove(iterator2.next());
		}
		System.out.println(pureLinkedHashSet.contains(100));
		System.out.println(pureLinkedHashSet.contains("Last"));
		System.out.println(pureLinkedHashSet.size());
		System.out.println(pureLinkedHashSet.isEmpty());
		pureLinkedHashSet.clear();
		System.out.println(pureLinkedHashSet.isEmpty());
		
		
	}

}
