package com.corejava.test;

import java.util.Scanner;

public class MultiSelect {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String correctOption=ip.nextLine();
		ip.close();
		
		String[] answers=correctOption.split(",", 4); // 1,3,4,2
		boolean[] st=new boolean[4];
		for(String ans: answers) {
			ans=ans.replace(" ", "");
			int i = Integer.parseInt(ans);
			st[i-1]=true;
		}
		for(boolean s: st)
		System.out.println(s);
		System.out.println("-----------");
		for(String ans: answers)
		System.out.println(ans);
		System.out.println("-----------");
		System.out.println(correctOption);
		

	}

}
