package com.javainuse.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.javainuse.model.Employee;

@Service
public class EmployeeService {
	
	List<Employee> lst;
	
	public EmployeeService()
	{
		this.lst= new ArrayList<Employee>();
	}

	public Employee createEmployee(String name, String empId) {

		Employee emp = new Employee();
		emp.setName(name);
		emp.setEmpId(empId);
		this.lst.add(emp);
		return emp;
	}

	public void deleteEmployee(String empId) {
		
	}
}