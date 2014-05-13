package com.n.spring.hibernate.service;

import java.util.List;

import javax.transaction.NotSupportedException;

import org.hibernate.HibernateException;

import com.n.hibernate.entity.Employee;
import com.n.hibernate.entity.dao.EmployeeDao;

public class EmployeeService {
	
	private EmployeeDao employeeDao;

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public void addEmployee(Employee employee){
		try{
			this.employeeDao.addEmployee(employee);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public void updateEmployee(Employee employee){
		try{
			this.employeeDao.updateEmployee(employee);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void deleteEmployee(Employee employee){
		try{
			this.employeeDao.deleteEmployee(employee);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public List<Employee> getAllEmployees(){
		try{
			List<Employee> employeeList =  this.employeeDao.getAllEmployees();
			if(null != employeeList && employeeList.size() > 0){
				return employeeList;
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;		
	}
	
	public Employee getEmployee(String employeeId){
		Employee emp = null;
		try {
			emp = this.employeeDao.getEmployee(employeeId);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}
}
