package com.example.rest.service;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.dao.EmployeeDao;
import com.example.rest.model.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
//	List<Employee>list;
	
	
	public EmployeeServiceImp()
	{
//		list=new ArrayList<>();
//		list.add(new Employee(1,"Praneeth",1234567,"System Analyst"));
//		list.add(new Employee(2,"Krishna Tej",2345671,"SDE-1"));
//		list.add(new Employee(3,"Mrudul",3456721,"Application Enginner"));
		
	}
	
	@Override
	public List<Employee> GetAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployee(Integer employeeid) {
		// TODO Auto-generated method stub
//		Employee e=null;
//		for(Employee em:list)
//		{
//			if(em.getId()==employeeid)
//			{
//				e=em;
//				break;
//			}
//		}
		System.out.println(employeeDao.findById(employeeid));
		System.out.println(employeeDao.getById(employeeid));
		
		
		return employeeDao.getById(employeeid);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
//		list.add(employee);
		employeeDao.save(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee, Integer empid) {
		// TODO Auto-generated method stub
//		for(int i=1;i<list.size();i++)
//		{
//			Employee e=list.get(i);
//			if(e.getId()==empid)
//			{
//				list.set(i, employee);
//				System.out.print(e);
//			}
//		}
		employeeDao.save(employee);
		return employee;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
//		list.removeIf(t -> (t.getId()==id));
		Employee entity=employeeDao.getById(id);
		employeeDao.delete(entity);
		
	}

	

	

	

}
