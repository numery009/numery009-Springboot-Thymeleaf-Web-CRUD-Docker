package com.springboot.employee.service;

import java.util.List;

import com.springboot.employee.model.Employee;

public interface EmployeeService {
	public List<Employee> findAll();

	public Employee findById(int id);

	public void SaveOrUpdate(Employee employee);

	public void Delete(int id);
}
