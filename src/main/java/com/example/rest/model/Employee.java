package com.example.rest.model;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private Integer id;
	
	private String name;
	private long cell;
	private String designation;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", cell=" + cell + ", designation=" + designation + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCell() {
		return cell;
	}

	public void setCell(long cell) {
		this.cell = cell;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, long cell, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.cell = cell;
		this.designation = designation;
	}

}
