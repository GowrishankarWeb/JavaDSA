package com.corejava.hybridinheritance;

public class HybridMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s=new Son();
		s.grandParentMethod();
		s.parentMethod();
		s.sonMethod();
		
		Daughter d=new Daughter();
		d.grandParentMethod();
		d.parentMethod();
		d.daughterMethod();
		
	}

}