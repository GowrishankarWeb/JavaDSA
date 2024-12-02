package com.corejava.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicates {
	public static void main(String[] args) {
		Predicate<Integer> predicate = num -> (num>18);
		System.out.println(predicate.test(40));
		
		Predicate<String> predicate2= password -> (password.length()>=8);
		System.out.println(predicate2.test("user@ax34"));
		
		List<Integer> arrayList=Arrays.asList(1,2,55,2,1,4,7,5,4,1,1,2,2,22,5,2,96);
		
		Predicate<List<Integer>> predi3= al -> (al.size()>0);
		System.out.println(predi3.test(arrayList));
		
		Predicate<Integer> checkEven= n->(n%2==0);
		for(int n:arrayList) {
			System.out.println(checkEven.test(n));
		}
		
		Predicate<Integer> lessThan10= n->n<10;
		check(lessThan10.negate(),arrayList);
		check(lessThan10.negate().and(checkEven),arrayList);
		check(lessThan10.or(checkEven),arrayList);
		
	}

	private static void check(Predicate<Integer> lessThan10, List<Integer> arrayList) {
		for(int i:arrayList) {
			if(lessThan10.test(i)) {
				System.out.println(i);
			}
		}
	}
}
