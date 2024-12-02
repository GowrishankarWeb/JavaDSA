package com.corejava.multilevelinhetitance;

public class SmartPhone extends MobilePhone {
	String ram="8GB RAM";
	String screen="15cms Screen Size";
	String camera="64mp Camera";
	
	public void Internet() {
		System.out.println("Internet Service in SmartPhone");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone SP=new SmartPhone();
		System.out.println("Smart phone camera : "+SP.camera);
		System.out.println("Smart phone ram : "+SP.ram);
		System.out.println("Smart phone screen : "+SP.screen);
		System.out.println("Cell phone camera : "+SP.CellPhoneCamera);
		System.out.println("Cell phone ram : "+SP.CellPhoneRAM);
		System.out.println("Cell phone screen : "+SP.CellPhoneScreen);
		System.out.println("Mobile phone camera : "+SP.MobilePhoneCamera);
		System.out.println("Mobile phone ram : "+SP.MobilePhoneRAM);
		System.out.println("Mobile phone screen : "+SP.MobilePhoneScreen);
		
		SP.cellPhoneCall();
		SP.cellPhonesms();
		
		SP.MobilePhoneMMS();
		SP.MobilePhoneSMS();
		SP.MobilePhoneVoiceCall();
		
		SP.Internet();
		
		
	}

}
