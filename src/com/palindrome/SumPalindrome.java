package com.palindrome;

import java.util.Scanner;

public class SumPalindrome {
	
	/*Given a number, reverse it and add it to itself unless it becomes a palindrome or return -1 if the number of iterations becomes more than 5. Return that palindrome number if it becomes a palindrome else returns -1.

			Examples :

			Input: n = 23
			Output: 55 
			Explanation: reverse(23) = 32,then 32+23 = 55 which is a palindrome. 
			Input: n = 73
			Output: 121
			Explanation: reverse(73) = 37,then 37+73 = 110 which is not a palindrome, again reverse(110)= 011, then 110+11 = 121 which is a palindrome.
			Expected Time Complexity: O(n)
			Expected Auxiliary Space: O(1)

			Constraints:
			1 <= n <= 104*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		long n= ip.nextLong();
		ip.close();
		System.out.println(isSumPalindrome(n));
	}
	static long isSumPalindrome(long n) {
        if(n<=0) return -1;
        // code here
        long temp=n;
        long rev=0;
        while(n>0){
            long rem=n%10;
            rev=(rev*10)+rem;
            n/=10;
        }
        
        if(checkPalindrome(temp+rev)) return (temp+rev);
        else return isSumPalindrome(temp+rev);
    }
    static boolean checkPalindrome(long n){
        if(n<0 || n%10==0) return false;
        if(n==0) return true;
        
        long rev=0;
        while(n>rev){
            long rem=n%10;
            rev=(rev*10)+rem;
            n/=10;
        }
        
        if(n==rev || n==rev/10) return true;
        else return false;
    }

}
