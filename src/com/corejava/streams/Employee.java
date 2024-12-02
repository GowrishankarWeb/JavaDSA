package com.corejava.streams;

public class Employee {
	
	private int id, exp, salary;
	private String name;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", exp=" + exp + ", salary=" + salary + ", name=" + name + "]";
	}

	public Employee(int id, int exp, int salary, String name) {
		super();
		this.id = id;
		this.exp = exp;
		this.salary = salary;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
