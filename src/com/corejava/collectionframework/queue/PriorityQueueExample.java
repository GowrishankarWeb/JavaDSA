package com.corejava.collectionframework.queue;
import java.util.PriorityQueue;
public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		//Insertion order - No
		//Accepts null - No
		//Accepts Duplicate - Yes
		//queue.add(null);
		queue.add("String");
		queue.add("String");
		queue.add("Hour");
		queue.add("Minutes");
		queue.add("Seconds");
		System.out.println(queue);
		System.out.println(queue.contains("Hour"));
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue);
		queue.offer("Guns");
		System.out.println(queue);
		queue.remove("Seconds");
		//queue.remove("Minutes");
		System.out.println(queue);
		
		
		
	}
}
