package com.corejava.collectionframework.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();  
		//Insertion order - Yes
		//Accepts null - No
		//Accepts Duplicate - Yes
		//deque.add(null);
		//faster than arraylist and linkedlist
		deque.add("Red");
		deque.add("Blue");
		deque.add("Green");
		deque.add("Green");
		System.out.println(deque);
		System.out.println(deque.equals(deque));
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		System.out.println(deque.offerFirst("Orange"));
		System.out.println(deque);
		System.out.println(deque.offerLast("Yellow"));
		System.out.println(deque);
		System.out.println(deque.poll());
		System.out.println(deque);
		System.out.println(deque.pop());
		System.out.println(deque);
		System.out.println(deque.size());
		deque.addFirst("White");
		deque.addLast("Black");
		System.out.println(deque);
		
	}

}
