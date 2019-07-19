package com.cms.api.dao;

import java.util.List;

import com.cms.api.model.Employee;

public interface EmpDao {

   // Create employee record
	public void save(Employee emp);
	
    public List<Employee> list();
}
