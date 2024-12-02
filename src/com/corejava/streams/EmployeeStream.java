package com.corejava.streams;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStream {

	public static void main(String[] args) {
		List<Employee> employeeList=new ArrayList<>();
		
		employeeList.add(new Employee(1, 3, 30000, "Ajith"));
		employeeList.add(new Employee(2, 4, 40000, "Vijay"));
		employeeList.add(new Employee(3, 5, 50000, "Suriya"));
		employeeList.add(new Employee(4, 6, 60000, "Vikram"));
		employeeList.add(new Employee(5, 7, 70000, "Rajni"));
		employeeList.add(new Employee(6, 8, 80000, "Kamal"));
		
		//to get salary greater than 50000
		//employeeList.stream().filter(e->e.getSalary()>50000).map(e->e.getName()+" ").forEach(System.out::print);
		
		//employeeList.stream().map(e->e.getName()).forEach(System.out::println);
		
		List<Employee> empList2=new ArrayList<>();
		employeeList.stream().forEach(e->empList2.add(e));
		empList2.stream().forEach(System.out::println);
	}

}
