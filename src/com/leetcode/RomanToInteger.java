package com.leetcode;

import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s= ip.nextLine();
		ip.close();
		System.out.println(romanToInt(s));
	}
    public static int translate(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    public static int romanToInt(String s) {
        int n=0;
        int cur=translate(s.charAt(s.length()-1));
        n+=cur;
        for(int i=s.length()-2;i>=0;i--){
            int next = translate(s.charAt(i));
            if(cur>next)
                n-=next;
            else
                n+=next;
            cur=next;
        }
        return n;
    }
	public static int romanToInt2(String s) {
        int n=0;
        /*for(char c: s.toCharArray()){
            if(c=='I') n+=1;
            else if(c=='V') n+=5;
            else if(c=='X') n+=10;
            else if(c=='L') n+=50;
            else if(c=='C') n+=100;
            else if(c=='D') n+=500;
            else if(c=='M') n+=1000;
        }*/
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                if(i!=s.length()-1){
                    if(s.charAt(i+1)=='V'){
                        i+=1;
                        n+=4;
                        continue;
                    }
                    else if(s.charAt(i+1)=='X'){
                        i+=1;
                        n+=9;
                        continue;
                    }
                }
                n+=1;
            }
            else if(s.charAt(i)=='X'){
                if(i!=s.length()-1){
                    if(s.charAt(i+1)=='L'){
                        i+=1;
                        n+=40;
                        continue;
                    }
                    else if(s.charAt(i+1)=='C'){
                        i+=1;
                        n+=90;
                        continue;
                    }
                }
                n+=10;
            }
            else if(s.charAt(i)=='C'){
                if(i!=s.length()-1){
                    if(s.charAt(i+1)=='D'){
                        i+=1;
                        n+=400;
                        continue;
                    }
                    else if(s.charAt(i+1)=='M'){
                        i+=1;
                        n+=900;
                        continue;
                    }
                }
                n+=100;
            }
            else if(s.charAt(i)=='V') n+=5;
            else if(s.charAt(i)=='L') n+=50;
            else if(s.charAt(i)=='D') n+=500;
            else if(s.charAt(i)=='M') n+=1000;
        }
        return n;
    }
}
