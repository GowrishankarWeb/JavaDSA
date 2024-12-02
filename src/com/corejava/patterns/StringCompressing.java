package com.corejava.patterns;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
public class StringCompressing {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String str=ip.nextLine();
		ip.close();
		Map<Character,Integer> countMap=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<str.length()-1;i++) {
			if(countMap.containsKey(str.charAt(i))) {
				int val=countMap.get(str.charAt(i));
				++val;
				countMap.replace(str.charAt(i), val);
			}
			else {
				countMap.put(str.charAt(i), 1);
			}
		}
		StringBuilder sb=new StringBuilder();
		for(Entry<Character,Integer> e:countMap.entrySet()) {
			sb.append(e.getValue()+""+e.getKey());
		}
		System.out.println(sb.toString());
	}
}