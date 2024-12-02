package com.interview;

public class StaticDataMembers { 
	static int a = 10; //static variable 
	final static int f = 20; //final variable
	
	private int b = 1000; //instance variable
	//public  void static main(String[] args) //== not run 
	static public final void main(String[] args) { //== run 
	//public static void main(String[] args) {
		
		//System.out.println(f+=10); //f=f+10; //final variable run time exception
		
		
		StaticDataMembers sdm=new StaticDataMembers();
		sdm.b=2000;
		a=1000; // global access
		System.out.println(sdm.b+a);
		
		
		StaticDataMembers sdm2=new StaticDataMembers();
		System.out.println(sdm2.b+a);
		

		StaticDataMembers sdm3=new StaticDataMembers();
		System.out.println(sdm3.b+a);
	}
	
	/*final - class - inherit X
	           method - override X
	 		  variable - constant, cannot be changable in runtime*/ 
	
	
}
