package com.bootORM.ORM.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "charanemp")
public class EmpModel {

	@Id
	int id;
	String name;
	String job;
	String salary;
	String department;

	public EmpModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpModel(int id, String name, String job, String salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.salary = salary;
		this.department = department;
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
