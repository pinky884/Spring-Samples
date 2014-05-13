package com.n.spring.beans.sample;

public class SingletonImpl {
	 private static SingletonImpl instance;
	
	public static SingletonImpl getInstance(){
		if(instance == null){
			instance = new SingletonImpl();
		}
		return instance;
	}
	
	public void testSingletonImpl(){
		System.out.println(instance);
	}
	
	public boolean equals(SingletonImpl obj1, SingletonImpl obj2){
		if(obj1.equals(obj2)){
			return true;
		}
		else{
			return false;
		}
			
	}
	

}
