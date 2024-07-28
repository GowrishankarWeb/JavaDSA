package com.leetcode;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s= ip.nextLine();
		ip.close();
		System.out.println(isValid(s));
	}
	
	private static boolean isValid(String s) {
		Stack<Character> brackets=new Stack<>();
		if(s.length()%2!=0) return false;
		
		for(char ch : s.toCharArray()) {
			Character c=ch;
			if(c=='(' || c=='{' || c=='[') brackets.push(c);
			else if(c==')' && !brackets.isEmpty() && brackets.peek()=='(') brackets.pop();
			else if(c==']' && !brackets.isEmpty() && brackets.peek()=='[') brackets.pop();
			else if(c=='}' && !brackets.isEmpty() && brackets.peek()=='{') brackets.pop();
			else brackets.push(c);
		}
		
		return brackets.isEmpty();
	}

	public static int translate(char c){
        switch(c){
            case '(': return 1;
            case ')': return -1;
            case '[': return 2;
            case ']': return -2;
            case '{': return 3;
            case '}': return -3;
            default: return 0;
        }
    }
    public static boolean isValid2(String s) { //failure
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=translate(s.charAt(i));
            if(sum<0) return false;
        }
        if(sum==0) return true;
        else return false;
    }

}
