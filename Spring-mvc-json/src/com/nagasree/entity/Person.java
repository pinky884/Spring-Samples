package com.nagasree.entity;

public class Person {
	private String firstName;
	private String lastName;
	private String gender;
	private float age;
	
	public Person(){
		firstName = null;
		lastName = null;
		gender = null;
		age = 0;
	}
	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}

	@Override
	public String toString() {
		String value = "firstName:" + firstName + ",lastName:" + lastName + ",gender:" + gender + ",age:" + age;
		return value;
	}
	
    
}
