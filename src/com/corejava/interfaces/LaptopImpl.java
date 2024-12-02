package com.corejava.interfaces;

public class LaptopImpl implements Laptop{
	
	public static void main(String []args) {
		Laptop lt=new LaptopImpl();
		System.out.println("Loose Coupling");
		lt.camera();
		lt.printer();
		lt.mouse();
		lt.keyboard();
		Laptop.speakers();
		lt.earphones();
		
		LaptopImpl lp=new LaptopImpl();
		System.out.println("Tight Coupling");
		lp.camera();
		lp.printer();
		lp.mouse();
		lp.keyboard();
		lp.joystick();
		lp.earphones();
		Laptop.speakers();
		
	}

	@Override
	public void keyboard() {
		// TODO Auto-generated method stub
		System.out.println("Used for entering information on Computer.");
		
	}

	@Override
	public void mouse() {
		// TODO Auto-generated method stub
		System.out.println("Used for selecting information on Computer.");
	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		System.out.println("Used for entering photos on Computer.");
	}

	@Override
	public void printer() {
		// TODO Auto-generated method stub
		System.out.println("Used for getting information from Computer using papers.");
	}
	
	public void joystick()
	{
		System.out.println("Used for entering information on games in a computer.");
	}
	


}
