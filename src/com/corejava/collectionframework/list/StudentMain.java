package com.corejava.collectionframework.list;

public class StudentMain {

	public static void main(String[] args) {
		Student student=new Student();
		student.setId(3);
		student.setName("Ishwaryaa");
		student.setAge((byte)23);
		System.out.println(student.toString());
		System.out.println(student.display());
	}

}
