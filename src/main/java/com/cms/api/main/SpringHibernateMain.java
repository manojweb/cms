package com.cms.api.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cms.api.dao.EmpDao;
import com.cms.api.model.Employee;


public class SpringHibernateMain { 

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		EmpDao empDAO = context.getBean(EmpDao.class);
		Employee emp = new Employee();
		emp.setEname("Manoj");
		emp.setEcountry("India");
		empDAO.save(emp);

		System.out.println("Employee::"+emp);
		
		List<Employee> list = empDAO.list();
		for(Employee e : list){
			System.out.println("Person List::"+e);
		}
		
		context.close();
	
	}
	
	
	
}
