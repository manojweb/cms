/** Model Class or Entity Bean */

package com.cms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author
 *
 */
@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@Column(name="empid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int empid;
	private String ename;
	private String ecountry;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEcountry() {
		return ecountry;
	}
	public void setEcountry(String ecountry) {
		this.ecountry = ecountry;
	}

	@Override
	public String toString(){
		return "id="+empid+", name="+ename+", country="+ecountry;
	}

}
