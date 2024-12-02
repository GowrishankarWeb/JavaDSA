package com.corejava.collectionframework.list;

public class Student {
	private int id;
	private String name;
	private byte age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public String toString() {
		//return super.toString();
		return "Id : "+getId()+"\nName : "+getName()+"\nAge : "+getAge();
	}
	
	public String display() {
		return "Id : "+getId()+"\nName : "+getName()+"\nAge : "+getAge();
	}
}
