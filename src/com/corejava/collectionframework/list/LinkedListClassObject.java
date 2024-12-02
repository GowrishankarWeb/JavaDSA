package com.corejava.collectionframework.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListClassObject {

	public static void main(String[] args) {
		List<Employee> linkedList = new LinkedList<>();
		Employee employee1=new Employee();
		employee1.setId(1);
		employee1.setName("Ajith");
		employee1.setAge((byte)25);
		
		Employee employee2=new Employee();
		employee2.setId(2);
		employee2.setName("Bhanu");
		employee2.setAge((byte)24);
		
		Employee employee3=new Employee();
		employee3.setId(3);
		employee3.setName("Catherine");
		employee3.setAge((byte)26);
		
		Employee employee4=new Employee();
		employee4.setId(4);
		employee4.setName("Daniel");
		employee4.setAge((byte)21);
		
		linkedList.add(employee1);
		linkedList.add(employee2);
		linkedList.add(employee3);
		linkedList.add(employee4);
		
		for(Employee s: linkedList) {
			System.out.println("ID : "+s.getId());
			System.out.println("Name : "+ s.getName());
			System.out.println("Age : "+ s.getAge());
		}
	}

}
