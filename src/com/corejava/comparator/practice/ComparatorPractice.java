package com.corejava.comparator.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Intern{
	private int id;
	private String name;
	private int age;
	
	public Intern(int id, String name, int age) {
		super();
		this.id = id;
		this.setName(name);
		this.age = age;
	}

	@Override
	public String toString() {
		return "Intern [id=" + id + ", name=" + getName() + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

}

public class ComparatorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList=new ArrayList<Integer>();
		intList.add(23);
		intList.add(54);
		intList.add(37);
		intList.add(13);
		intList.add(94);
		intList.add(73);
		intList.add(86);
		
		Comparator<Integer> com=new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				int result = o1.compareTo(o2);
				if(result > 0) return -1;
				else if(result < 0) return +1;
				else return 0;
			}
			
		};
		
		Collections.sort(intList, com);
		System.out.println(intList.toString());
		
		
		List<String> strList=new ArrayList<String>();
		strList.add("sdgsdgd");
		strList.add("jhlhj");
		strList.add("abce");
		strList.add("ghjgh");
		strList.add("abcd");
		strList.add("vbnbvn");
		strList.add("ete");
		strList.add("lkjhg");
		strList.add("tyuty");
		strList.add("iph");
		
		Comparator<String> strCom=new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int result = o1.compareTo(o2);
				if(result > 0) return -1;
				else if(result < 0) return +1;
				else return 0;
			}
			
		};
		
		Collections.sort(strList,strCom);
		System.out.println(strList.toString());
		
		Collections.sort(strList);
		System.out.println(strList.toString());
		
		
		List<Intern> internList=new ArrayList<>();
		
		internList.add(new Intern(1,"Arun",23));
		internList.add(new Intern(2,"Kali",63));
		internList.add(new Intern(4,"sdf",45));
		internList.add(new Intern(5,"ert",46));
		internList.add(new Intern(7,"wer",97));
		internList.add(new Intern(14,"gfj",45));
		internList.add(new Intern(2,"bcf",86));
		internList.add(new Intern(13,"uo",45));
		internList.add(new Intern(5,"ert",78));
		internList.add(new Intern(4,"qwer",31));
		internList.add(new Intern(4,"jkhj",66));
		internList.add(new Intern(4,"tyi",43));

		
		Comparator<Intern> nameComparator =new Comparator<Intern>() {

			@Override
			public int compare(Intern o1, Intern o2) {
				if(o1.getAge()>(o2.getAge())) return +1;
				else if(o1.getAge()<(o2.getAge())) return -1;
				else return 0;
			}
			
		};
		
		Collections.sort(internList, nameComparator);
		for(Intern i:internList)
			System.out.println(i.toString());
	}

}
