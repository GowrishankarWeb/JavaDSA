package com.interview;

import java.util.Scanner;
import java.util.Stack;

public class Brackets {
	
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String str=ip.nextLine();
		System.out.println(valid(str));
		ip.close();
	}

	private static boolean valid(String str) {
		Stack<Character> charStack=new Stack<>();
		for(char c:str.toCharArray()) {
			if(c=='(' || c=='{' || c=='[') { charStack.push(c); }
			else if (c==')' && !charStack.isEmpty() && charStack.peek()=='(') charStack.pop();
			else if (c=='}' && !charStack.isEmpty() && charStack.peek()=='{') charStack.pop();
			else if (c==']' && !charStack.isEmpty() && charStack.peek()=='[') charStack.pop();
			else charStack.push(c);
		}
		System.out.println(charStack.toString());
		return charStack.isEmpty();
	}
	
	

}
