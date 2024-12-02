package com.gfg;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		long n= ip.nextLong();
		ip.close();
		System.out.println(reverse_digit(n));
	}
	public static long reverse_digit(long n)
    {
        // Code here
        long rev=0;
        while(n>0){
            long pop=n%10;
            rev=(rev*10)+pop;
            n/=10;
        }
        return rev;
    }
}
