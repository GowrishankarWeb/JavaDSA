// Java implementation to check if characters of a given string can be rearranged to form a palindrome
package com.corejava.patterns;
import java.util.*;
class PalindromeShuffled {

	static int NO_OF_CHARS = 256;

	/* function to check whether characters of a string can form a palindrome */
	static boolean canFormPalindrome(String str)
	{	
		int count[]=new int [NO_OF_CHARS];
		Arrays.fill(count, 0);
		for(int i=0;i<str.length();i++) {
			count[(int)(str.charAt(i))]++;
		}
		int odd=0;
		for(int i=0;i<NO_OF_CHARS;i++) {
			if((count[i]&1)==1) {
				odd++;
			}
			if(odd>1) {
				return false;
			}
		}
		return true;
	}

	// Driver code
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine().toLowerCase();
		scanner.close();
		if (canFormPalindrome(string))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

// This code is contributed by Nikita Tiwari.
