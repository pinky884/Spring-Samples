package com.n.hibernate.entity.dao;

import java.util.List;

import javax.transaction.NotSupportedException;

import org.hibernate.HibernateException;

import com.n.hibernate.entity.Employee;

public interface EmployeeDao {
	public void addEmployee(Employee employee) throws HibernateException, NotSupportedException, Exception;
	public void updateEmployee(Employee employee) throws HibernateException, NotSupportedException, Exception;
	public void deleteEmployee(Employee employee) throws HibernateException, NotSupportedException, Exception;
	public Employee getEmployee(String employeeId) throws HibernateException, NotSupportedException, Exception;
	public List<Employee> getAllEmployees() throws HibernateException, NotSupportedException, Exception;	
}
