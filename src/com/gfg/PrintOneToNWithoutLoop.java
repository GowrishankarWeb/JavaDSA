package com.gfg;

import java.util.Scanner;

public class PrintOneToNWithoutLoop {

	public static void main(String[] j) {
		Scanner ip=new Scanner(System.in);
		int N= ip.nextInt();
		ip.close();
		printNos(N);
	}
	public static void printNos(int N)
    {
        //Your code here
		if(N==0) 
			return; 
	
		printNos(N-1);
		System.out.println(N);
        
    }
}
