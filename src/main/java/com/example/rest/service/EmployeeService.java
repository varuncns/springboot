package com.example.rest.service;

import java.util.List;

import com.example.rest.model.Employee;

public interface EmployeeService {
	
	public List<Employee>GetAllEmployee();
	
	public Employee getEmployee(Integer employeeid);
	
	public Employee addEmployee(Employee employee);
	
	public Employee updateEmployee(Employee employee, Integer empid);

	public void deleteById(Integer id);

}
