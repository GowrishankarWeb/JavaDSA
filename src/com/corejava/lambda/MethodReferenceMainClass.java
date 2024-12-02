package com.corejava.lambda;

public class MethodReferenceMainClass {
	
	int n;
	
	MethodReferenceMainClass(){
		
	}
	MethodReferenceMainClass(int n){
		this.n=n;
		System.out.println(n+" costructor call");
	}
	
	void show(int n) {
		System.out.println(n+" Show Method");
	}
	
	static void print(int n) {
		System.out.println(n+" print Method");
	}
	
	public static void main(String[] args) {
		MethodReferenceMainClass m=new MethodReferenceMainClass();
		m.show(290);
		
		MethodReference mr=new MethodReference() {
			
			@Override
			public void display(int n) {
				System.out.println(n);
				
			}
		};
		
		mr.display(100);
		
		//instead of creating new implementation we can use already existing method
		//rule is arguments should match
		//can use static method
		//can use constructor too
		
		MethodReference mr2=m::show;
		mr2.display(543);
		
		MethodReference mr3= new MethodReferenceMainClass()::show;
		//Arbitrary method
		mr3.display(259);
		
		MethodReference mr4= MethodReferenceMainClass::print;
		mr4.display(965);
		
		MethodReference mr5= MethodReferenceMainClass::new;
		// constructor argument should match functionalInterfaceMethod's argument
		mr5.display(23500);
		
		MethodReference mr6= System.out::println;
		mr6.display(965);
	}
}
