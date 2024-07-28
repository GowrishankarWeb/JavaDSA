package com.palindrome;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n= ip.nextInt();
		ip.close();
		if(isPalindrome(n))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	 
    public static boolean isPalindrome(int x) {
        if(x==0)
            return true;
        if(x<0 || x%10==0)
            return false;

        /*StringBuilder sb=new StringBuilder(); //success but more time taken
        StringBuilder sbRev=new StringBuilder(sb.append(x));
        sbRev.reverse();
        if(sb.toString().equals(sbRev.toString()))
            return true;
        else
            return false;*/
        
        int rev=0;
        while(x>rev){ //checks only half of the number
            int pop=x%10;
            rev=(rev*10)+pop;
            x/=10;
        }

        if(x==rev || x==rev/10) return true;
        else return false;
    }
}
