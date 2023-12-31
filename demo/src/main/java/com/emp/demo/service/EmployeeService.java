package com.emp.demo.service;

import java.util.List;
import java.util.Optional;

import com.emp.demo.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> getEmployees();
	//public Employee getEmployeeById(Long parsLong);
	Optional<Employee> findById(Long id);
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public void deleteEmployee(Long parsLong);

}
