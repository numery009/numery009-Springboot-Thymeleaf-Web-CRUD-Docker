package com.springboot.employee.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.employee.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it .. no need to write any code LOL!

	// add a method to sort by last name
	public List<Employee> findAllByOrderByLastNameAsc();

	// spring data jpa will parse the method name looks for a specific format and
	// pattern
	// Creates appropriate query .. behind the scenes
	// query will be - "form Employee order by lastName asc"

}
