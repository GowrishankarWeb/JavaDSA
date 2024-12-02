package com.corejava.test;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
	
	public static void main(String[] args) {
		
		List<Integer> al=new ArrayList<>();
		al.add(54);
		al.add(345);
		al.add(567);
		al.add(79);
		al.add(345);
		al.add(2);
		al.add(325);
		al.add(879);
		al.add(2758);
		al.add(456);
		al.add(386);
		al.add(486);
		al.add(76);
		
		
		for(Integer integer:al) {
			System.out.println(integer);
		}
	}

}
