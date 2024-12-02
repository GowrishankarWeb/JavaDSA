package com.corejava.typecasting;
public class Boxing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int integer=84902;
		long longValue=integer;
		System.out.println(longValue);//widening
		
		int i=342;
		char c=(char)i;
		System.out.println(c);//narrowing
		
		float floatPrimitive=23.2332f;
		Float floatObject=Float.valueOf(floatPrimitive);
		System.out.println(floatObject);//converting primitive to object   Wrapping
		
		int intPrimitive=56;
		float floatClassObject=intPrimitive;
		System.out.println(floatClassObject);  // autoboxing converting primitive to object
		
		Integer integerObject=453;
		int intPrimitive2=integerObject;
		System.out.println(intPrimitive2); // unboxing converting object to primitive
		
		String sstr= "1100";
		int str=Integer.valueOf(sstr);
		int str2=Integer.parseInt(sstr);
		System.out.println(str+" "+str2);		
	}
}