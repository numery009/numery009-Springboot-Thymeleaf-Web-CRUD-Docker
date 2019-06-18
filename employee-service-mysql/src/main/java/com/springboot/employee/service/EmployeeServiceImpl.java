package com.springboot.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.employee.dao.EmployeeRepository;
import com.springboot.employee.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		//return employeeRepository.findAll();
		return employeeRepository.findAllByOrderByLastNameAsc();
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> optionEmployee = employeeRepository.findById(id);
		return optionEmployee.get();
	}

	@Override
	public void SaveOrUpdate(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
	}

}
