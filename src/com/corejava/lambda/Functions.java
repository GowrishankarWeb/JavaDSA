package com.corejava.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Functions {

	public static void main(String[] args) {
		Function<String, Integer> f1=h->h.length();
		System.out.println(f1.apply("admin"));
		
		Consumer<String> c1=(s)->System.out.println(s.length());
		c1.accept("Hello");
		
		List<Integer> arrayList=Arrays.asList(1,2,55,2,1,4,7,5,4,1,1,2,2,22,5,2,96);
		arrayList.forEach(n->System.out.println(n));
		
		arrayList.forEach(System.out::println);//method reference
	}

}
