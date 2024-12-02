package com.corejava.interfaces;

public class PracticeChild implements Practice{

	public static void main(String[] args) {
		Practice.display();
		Practice p=new PracticeChild();
		p.fun();
	}

}
