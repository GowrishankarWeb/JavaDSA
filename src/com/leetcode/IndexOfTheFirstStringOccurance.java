package com.leetcode;

public class IndexOfTheFirstStringOccurance {
/*
Input
haystack =
"hello"
needle =
"ll"

Output
2
*/

	public static void main(String[] args) {
		String haystack="abc";
		String needle="c";
		System.out.println(strStr(haystack, needle));
	}
	public static int strStr(String haystack, String needle) {
		if(haystack.length()<=0) return -1;
        if(haystack.equals(needle)) return 0; 
        for(int i=0;i<haystack.length()&&((needle.length()+i)<=haystack.length());i++){
            if(haystack.substring(i,needle.length()+i).equals(needle)){
                return i;
            }
        }
        return -1;
    }

}
