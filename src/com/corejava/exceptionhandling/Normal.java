package com.corejava.exceptionhandling;
public class Normal {
	public static void main(String[] args) {
			Vote v=new Vote();
			try {
				v.vote(12);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			Divide d=new Divide();
			try {
				System.out.println(d.div(19, 0));
			}
			catch(Exception e){
				System.out.println(e);
			}
	}
}
