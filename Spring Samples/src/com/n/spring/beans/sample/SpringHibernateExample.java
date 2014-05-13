package com.n.spring.beans.sample;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.n.hibernate.entity.Employee;
import com.n.spring.hibernate.service.EmployeeService;

public class SpringHibernateExample {
	
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("/springConfig.xml");
		Employee employee = new Employee();
		employee.setEmployeeId("44444");
		employee.setFirstName("Martha");
		employee.setLastName("Jones");
		employee.setAddress("#1234, 14th main, Srinagar, Bangalore");
		
		EmployeeService employeeService = (EmployeeService)context.getBean("employeeService");
		employeeService.addEmployee(employee);
		
		List<Employee> employeeList = employeeService.getAllEmployees();
		if(null != employeeList && employeeList.size() > 0){
			for(Employee emp : employeeList){
				System.out.println(emp);
			}
		}
		
		Employee emp = employeeService.getEmployee("12345");
		employeeService.deleteEmployee(emp);
	}

}
