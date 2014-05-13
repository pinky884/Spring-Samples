package com.n.spring.beans.sample;

public class HelloWorld {
	private String greetings = null;
	
	public HelloWorld(){
		this.greetings = "World!";
	}
	
	public HelloWorld(String greetings){
		this.greetings = greetings; 
	}

	public String getGreetings() {
		return greetings;
	}

	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}
	
	public void sayHello(){
		System.out.println("Hello " + getGreetings());
	}
	

}
