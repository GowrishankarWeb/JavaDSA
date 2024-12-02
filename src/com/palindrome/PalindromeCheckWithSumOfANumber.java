package com.palindrome;

import java.util.Scanner;

public class PalindromeCheckWithSumOfANumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n= ip.nextInt();
		ip.close();
		if(isDigitSumPalindrome(n)==1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	static int isDigitSumPalindrome(int n) {
        int sum=sumOfDigits(n);
        System.out.println("Sum = "+sum);
        if(sum%10==0 || sum<0 ) return 0;
        if(sum==0) return 1;
        int rev=0;
        while(sum>rev){
            int rem=sum%10;
            rev=(rev*10)+rem;
            sum/=10;
        }
        System.out.println("sum = "+sum+"\nrev = "+rev);
        if(sum==rev || sum==rev/10) return 1;
        else return 0;
    }
    private static int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }
}
