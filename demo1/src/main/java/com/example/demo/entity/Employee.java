package com.example.demo.entity;

public class Employee {
	private int employeeId;
	private String name;
	private String address;
	
	
	

	public Employee(int employeeId, String name, String address) {
		// TODO Auto-generated constructor stub
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.address = address;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
