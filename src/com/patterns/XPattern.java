package com.patterns;

public class XPattern {

	public static void main(String[] args) {
		String s = "PROGRAM";
		
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				if(i==j || ((i+j+1)==s.length()))
					System.out.print(s.charAt(i));
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
