package com.palindrome;

public class PalindromeUsingStringBuilder {

	public static void main(String[] args) {
		int num=-121;
        StringBuilder sb=new StringBuilder();
        StringBuilder sbRev=new StringBuilder(sb.append(num));
        sbRev.reverse();
        System.out.println(sb.toString());
        System.out.println(sbRev.toString());
        System.out.println(sb.toString().equals(sbRev.toString()));
	}

}
