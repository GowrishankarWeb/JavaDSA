package com.interview;

import java.util.Arrays;

public class LengthOfLastWord {

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("   fly me   to   the moon   "));
	}
	public static int lengthOfLastWord(String s) {
        String[] strArray=s.split(" ");
        System.out.println(Arrays.toString(strArray));
        return strArray[strArray.length-1].length();
    }
}
