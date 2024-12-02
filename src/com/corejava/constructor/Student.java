package com.corejava.constructor;

public class Student {
	

	
	
	int studentId;
	String studentName;
	String studentEmail;
	Student(){
		
	}
	void run() {
		System.out.println(this.age);
		System.out.println("Running");
	}
	int age=15;
	Student(int a,String b){
		System.out.println(a);
		System.out.println(b);
	}
	Student(int studentId, String name, String email){
		//this();
		this(1,"ooo");
		this.run();
		System.out.println(this.age);
		this.studentId=studentId;
		studentName=name;
		studentEmail=email;
	}
	public static void main(String[] args) {
		Student student=new Student();
		System.out.println("To String "+student.toString());
		System.out.println(student.studentId +" "+student.studentName+" "+student.studentEmail);
		Student student1=new Student(2,"fsdfg","sfdg");
		System.out.println(student1.studentId +" "+student1.studentName+" "+student1.studentEmail);
		
		String S1="Hello";//String Literal
		//String s1=new String("Duck"); // String object
		S1="Hi";
		for(int i=0;i<=10;i++)
		{
			S1+=i; //"Hi0"
			System.out.println(S1);
			System.out.println(S1.hashCode());			
		}
		System.out.println(S1);
		StringBuilder stringBuilder=new StringBuilder("Yell");
		for(int i=0;i<=10;i++)
		{
			stringBuilder.append(i); //"Hi0"
			System.out.println(stringBuilder);
			System.out.println(stringBuilder.hashCode());			
		}
		System.out.println(stringBuilder);
	}
	@Override
	public String toString() {
		return "Hi Student";
		
	}
}
