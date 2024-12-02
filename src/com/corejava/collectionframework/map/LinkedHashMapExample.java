package com.corejava.collectionframework.map;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
public class LinkedHashMapExample {
	public static void main(String[] args) {
		Map<Integer,String> linkedHashMap=new LinkedHashMap<>();
		//duplicate yes
		//null yes
		//insertion yes
		linkedHashMap.put(1, null);
		linkedHashMap.put(2, "James");
		linkedHashMap.put(3, "Chris");
		linkedHashMap.put(4, "Stew");
		linkedHashMap.put(5, "Raiza");
		linkedHashMap.put(6, "Raiza");
		for(Entry<Integer,String> e:linkedHashMap.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		linkedHashMap.containsKey(2);
		linkedHashMap.replace(4, "Stew", "Albert");
		System.out.println(linkedHashMap.isEmpty());
		linkedHashMap.remove(2);
		System.out.println(linkedHashMap.keySet());
		System.out.println(linkedHashMap.values());
		System.out.println(linkedHashMap.size());
		System.out.println(linkedHashMap.containsKey(1));
		linkedHashMap.clear();
		
		
	}

}
