package com.interview;

public class isPalindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome("0P"));
	}
	public static boolean isPalindrome(String s) {
	        StringBuilder sb=new StringBuilder();
	        s=s.trim();
	        s=s.toLowerCase();
	        for(char c:s.toCharArray()){
	            if((c>=65 && c<=90) || (c>=97 && c<=122) || (c>=48 && c<=57)){
	            	sb.append(c);
	            }
	        }
	        if(sb.toString().equals(sb.reverse().toString()))
	            return true;
	        else
	            return false;
	    }
}

