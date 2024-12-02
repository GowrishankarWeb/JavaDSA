package com.corejava.exceptionhandling;
public class VariousExceptions {
	int arr[]= {1,2,3,4,5};
	String str="Mountain";
	public static void main(String[] args) {
		VariousExceptions VE=new VariousExceptions();
		try {
			//System.out.println(VE.arr[5]);
			System.out.println(VE.str.charAt(8));
			//int n=Integer.parseInt(VE.str);
			//System.out.println(n);
		}
		catch(ArrayIndexOutOfBoundsException aiobe){
			System.out.println(aiobe);
		}
		catch(StringIndexOutOfBoundsException siobe){
			System.out.println(siobe.toString());
		}
		catch(NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Block executed");
		}
	}
}