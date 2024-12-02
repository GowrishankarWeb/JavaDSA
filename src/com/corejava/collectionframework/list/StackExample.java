package com.corejava.collectionframework.list;

import java.util.List;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		List<Object> stack=new Stack<>();
		stack.add(89);
		stack.add("Bright");
		stack.add(29);
		stack.add("Glowing");
		System.out.println("Is Stack Empty ? "+ stack.isEmpty());
		System.out.println(stack.contains("Glowing"));
		//stack1.push(1);
		System.out.println(stack.remove(0));
		Stack<Object> stack1=new Stack<>();
		System.out.println(stack1.empty());
		stack1.push(1);
		stack1.push(91);
		stack1.push(23);
		stack1.push("Kyle");
		stack1.push("Napolean");
		stack1.push("Comment");
		System.out.println(stack1);
		stack1.pop();
		System.out.println(stack1);
		stack1.pop();
		System.out.println(stack1);
		stack1.pop();
		System.out.println(stack1);
		System.out.println(stack1.peek());
	}

}
