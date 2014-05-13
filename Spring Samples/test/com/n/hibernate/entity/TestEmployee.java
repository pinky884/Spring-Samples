package com.n.hibernate.entity;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestEmployee {
	
	public static void main(String[] args){
		Session session = new Configuration().configure("com/n/hibernate/entity/testHibernateConfig.hbm.xml").buildSessionFactory().openSession();
		Employee testEmp = new Employee();
		testEmp.setEmployeeId("1112");
		testEmp.setFirstName("TestFirstName1");
		testEmp.setLastName("testLastName1");
		testEmp.setAddress("test dummy1 address");
		
		Transaction trx = session.beginTransaction();
		session.save(testEmp);
		trx.commit();
		
	    Query query = session.createQuery("from Employee where employeeId= 1111");
	    List<Employee> empList = query.list();
	    if(null != empList){
	    	System.out.println(empList.get(0));
	    }
	}

}
