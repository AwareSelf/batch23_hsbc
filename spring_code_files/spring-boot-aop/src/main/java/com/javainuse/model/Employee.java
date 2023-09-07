package com.javainuse.model;

import java.util.Objects;

public class Employee {
	private String empId;
	private String name;
	
	public Employee() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId);
	}

	@Override
	public boolean equals(Object obj) {
		
		return this.empId==((Employee)obj).empId;
	}
	

}