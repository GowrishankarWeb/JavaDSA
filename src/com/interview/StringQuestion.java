package com.interview;

public class StringQuestion {

	public static void main(String[] args) {
		String s1="0123456789";
		String s2="5793";
		int output=0;
		for(char c:s2.toCharArray()) {
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)==c) {
					output+=i;
					break;
				}
			}
		}
		System.out.println(output);
		int out2=0;
		for(int j=0;j<s2.length();j++) {
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					out2+=i;
					break;
				}
			}
		}
		System.out.println(out2);
	}

}
