package com.n.hibernate.entity;

public class Employee {
	
	private String employeeId;
	private String firstName;
	private String lastName;
	private String address;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	public String toString(){
		String value = "___________" + this.employeeId + "name:" + this.firstName + "," + this.lastName + "address: " + this.address + "___________";
		return value;		
	}
	

}
