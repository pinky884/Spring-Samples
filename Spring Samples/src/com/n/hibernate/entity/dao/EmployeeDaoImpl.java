package com.n.hibernate.entity.dao;

import java.util.List;

import javax.transaction.NotSupportedException;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.n.hibernate.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSessionInstance(){
		//return this.sessionFactory.getCurrentSession();
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public void addEmployee(Employee employee) throws HibernateException, NotSupportedException, Exception {
		// TODO Auto-generated method stub
		Session session =  getCurrentSessionInstance();
		session.save(employee);
	
	}

	@Override
	public void updateEmployee(Employee employee) throws HibernateException {
		Session session =  getCurrentSessionInstance();
		session.update(employee);
	}

	@Override
	public void deleteEmployee(Employee employee) {
		Session session =  getCurrentSessionInstance();		
		session.delete(employee);
	}

	@Override
	public Employee getEmployee(String employeeId) {
		// TODO Auto-generated method stub
		Session session =  getCurrentSessionInstance();		
		Query hql = session.createQuery("from Employee where employeeId = " + employeeId);
		List<Employee> employeeList = hql.list();
		if(employeeList != null && employeeList.size() > 0){
			return employeeList.get(0);
		}
		else{
			return null;
		}
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		Session session =  getCurrentSessionInstance();	
		Query hql = session.createQuery("from Employee");
		List<Employee> employeeList = hql.list();
		return employeeList;
	}

	

}
