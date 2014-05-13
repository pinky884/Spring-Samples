package com.n.spring.beans.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringLoader {
	
	public static void main(String[] args){
		// Loading spring config xml from classpath.
		ApplicationContext context = new ClassPathXmlApplicationContext("/springConfig.xml");
		// Loading spring config xml using actual classpath.
		//ApplicationContext context = new FileSystemXmlApplicationContext("c:/Nagasree/Workspaces/First/Spring Samples/src/springConfig.xml");
		HelloWorld helloSpring = (HelloWorld)context.getBean("helloWorld");
		helloSpring.sayHello();
		
		// Example of creating bean using factory method.
		SingletonImpl singletonEx = (SingletonImpl) context.getBean("singletonEx");
		singletonEx.testSingletonImpl();
		
	}

}
