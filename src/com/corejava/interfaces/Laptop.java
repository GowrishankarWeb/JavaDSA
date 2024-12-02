package com.corejava.interfaces;

public interface Laptop {
	
	public abstract void keyboard();
	public void mouse();
	public void camera();
	public void printer();
	static public void speakers(){
		System.out.println("Used for getting sound information from computer.");
	}
	default public void earphones() {
		System.out.println("Used for getting sound information using earphones.");
	}
}
