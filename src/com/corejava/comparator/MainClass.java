package com.corejava.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MainClass {
	public static void main(String[] args) {
		List<Integer> intList=new ArrayList<Integer>();
		intList.add(23);
		intList.add(54);
		intList.add(37);
		intList.add(13);
		intList.add(94);
		intList.add(73);
		intList.add(86);
		
		List<Student> list=new ArrayList<>();
		list.add(new Student(8,"Arun",23));
		list.add(new Student(5,"Jade",27));
		list.add(new Student(6,"Mani",25));
		list.add(new Student(1,"Lal",21));
		list.add(new Student(10,"Kodi",39));
		list.add(new Student(9,"Pal",36));
		list.add(new Student(2,"Singh",32));
		list.add(new Student(3,"Kali",43));
		list.add(new Student(7,"Ravi",27));
		list.add(new Student(4,"Yuva",24));
		
		Comparator<Student> ageComparator = (Student o1, Student o2) -> {
			if(o1.getAge()>o2.getAge()) return 1;
			else if(o1.getAge()<o2.getAge()) return -1;
			else return 0;
		};
		
		Comparator<Student> idComparator = (Student o1, Student o2) -> {
			if(o1.getId()>o2.getId()) return 1;
			else if(o1.getId()<o2.getId()) return -1;
			else return 0;
		};
		
		Comparator<Student> nameLengthComparator = (Student o1, Student o2) -> {
			if(o1.getName().length()>o2.getName().length()) return 1;
			else if(o1.getName().length()<o2.getName().length()) return -1;
			else return 0;
		};
		
		Comparator<Student> nameComparator = (Student o1, Student o2) -> {
			int result=o1.getName().compareTo(o2.getName());
			if(result>0) return 1;
			else if(result<0) return -1;
			else return 0;
		};
		
		Comparator<Integer> intComparator = (Integer o1, Integer o2) -> {
			if(o1>o2) return 1;
			else if(o1<o2) return -1;
			else return 0;
		};
		
		Collections.sort(intList, intComparator);
		System.out.println(intList);
		
		System.out.println("Id Sorting");
		Collections.sort(list, idComparator);
		for(Student s:list)
			System.out.println(s.toString());
		
		System.out.println("Age Sorting");
		Collections.sort(list, ageComparator);
		for(Student s:list)
			System.out.println(s.toString());
		
		System.out.println("Name Length Sorting");
		Collections.sort(list, nameLengthComparator);
		for(Student s:list)
			System.out.println(s.toString());
		
		System.out.println("Name Sorting");
		Collections.sort(list, nameComparator);
		for(Student s:list)
			System.out.println(s.toString());

	}
}
