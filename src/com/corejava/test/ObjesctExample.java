package com.corejava.test;

public class ObjesctExample {
	
	static int abc;
	
	public void printABC() {
		System.out.println(this.abc);
	}
	
	public static void main(String[] args) {
		ObjesctExample obj=null;
		
		//System.out.println(obj.hashCode());
		System.gc();
		System.out.println(ObjesctExample.abc);
		
	}
	
	@Override  
	protected void finalize() throws Throwable  {
		int a=10;
		int b=10;
		System.out.println("a+b="+(a+b));
	}
}
