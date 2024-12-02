package com.interview;

public class Finalize {
	
	// class -- > object -- > f 
	
	public static void main(String[] args) {
		Finalize f=new Finalize();
		System.out.println(f.hashCode());
		f = null;   
		System.gc();
		System.out.println(f);
		
	}
	@Override
	protected void finalize() {
		System.out.println("Finalize method executed");
	}
}
