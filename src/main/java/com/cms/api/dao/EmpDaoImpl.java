package com.cms.api.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cms.api.model.Employee;

public class EmpDaoImpl implements EmpDao{
	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

  
	public void save(Employee e) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(e);
		tx.commit();
		session.close();
	}
    
    @SuppressWarnings("unchecked")
	public List<Employee> list() {
		Session session = this.sessionFactory.openSession();
		List<Employee> employeeList = session.createQuery("from Employee").list();
		session.close();
		return employeeList;
	}
    
 

}
