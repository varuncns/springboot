package com.example.rest.controller;

import java.util.List;
//import java.net.URI;
//import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.http.ResponseEntity;
import com.example.rest.model.Employee;
import com.example.rest.service.EmployeeService;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
public class mycontroller {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/home")
	public String home(){
		return "Homepage";
	}
	
	//GetEmployeeName
	@GetMapping("/employee")
	public List<Employee>GetAllEmployee()
	{
		return this.employeeService.GetAllEmployee();
		
	}
	
	//GetEmployeeNameByID
	@GetMapping("/employee/{employeeid}")
	public Employee getEmployee(@PathVariable String employeeid)
	{
		return this.employeeService.getEmployee(Integer.parseInt(employeeid));
	}
	
	//AddNewEmployee
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return this.employeeService.addEmployee(employee);
	}
	
	@PutMapping("/employee/{empid}")
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable String empid)
	{
		return this.employeeService.updateEmployee(employee,Integer.parseInt(empid));
	}
	
	@DeleteMapping("/employee/{id}")
	public void deleteStudent(@PathVariable String id) {
		 this.employeeService.deleteById(Integer.parseInt(id));
	}
	
	
	
}
