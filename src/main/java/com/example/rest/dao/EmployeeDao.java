package com.example.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rest.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
