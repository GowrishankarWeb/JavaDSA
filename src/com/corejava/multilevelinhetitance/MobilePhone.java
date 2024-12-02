package com.corejava.multilevelinhetitance;

public class MobilePhone extends CellPhone {
	
	String MobilePhoneRAM="2GB RAM";
	String MobilePhoneScreen="10cms Screen Size";
	String MobilePhoneCamera="16mp Camera";
	
	public void MobilePhoneVoiceCall() {
		System.out.println("HD Voice call feature in MobilePhone");
	}
	
	public void MobilePhoneSMS() {
		System.out.println("Short Message Service in MobilePhone");
	}
	
	public void MobilePhoneMMS() {
		System.out.println("Multimedia Message Service in MobilePhone");
	}

}
