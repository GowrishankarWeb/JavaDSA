package com.interview;

public class StringClass {
	public static void main(String[] args) {
		String ss="new"; // literal immutable
		String s = new String("Hello"); //object
		System.out.println(s.hashCode());
		System.out.println(ss.hashCode());
		StringBuilder sb=new StringBuilder("New"); //mutable
		//hashCode = An int value, representing the hash code or memory address of the string
		//equals = check the values  of string
		for(int i=0;i<=10;i++)
		{
			System.out.println(sb.append(i));
			System.out.println(sb.hashCode());
			
		}
		if(10==10) {
			System.out.println(true);
		}
		if(s.equals(ss)) {
			
		}
	}
}
