package com.corejava.collectionframework.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> hashMap=new HashMap<>();
		//duplicate yes
		//null yes
		//insertion yes
		hashMap.put(1, "Hello");
		hashMap.put(2, "Hello");
		hashMap.put(3, null);
		hashMap.put(4, "New");
		hashMap.put(5, "Dish");
		hashMap.put(6, "Born");
		hashMap.replace(5, "Fish");
		
		System.out.println(hashMap);
		Iterator<Entry<Integer,String>> it =hashMap.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getValue());
		}
//		for(Entry<Integer,String> i : hashMap.entrySet()) {
//			//System.out.println(i);
//			System.out.println(i.getKey()+" "+i.getValue());
//		}
//		System.out.println(hashMap.containsKey(2));
//		System.out.println(hashMap.get(4));
//		System.out.println(hashMap.isEmpty());
//		hashMap.remove(6);
//		System.out.println(hashMap.size());
//		hashMap.replace(3, "Believe");
//		System.out.println(hashMap.toString());
//		System.out.println(hashMap.keySet());
//		System.out.println(hashMap.values());
//		hashMap.clear();
//		
		//HashMap<Integer, String> map=new HashMap<>();
		
		
		
		
		
		
	}

}
