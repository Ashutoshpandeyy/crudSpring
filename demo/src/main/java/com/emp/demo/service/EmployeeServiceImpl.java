package com.emp.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.demo.entity.Employee;
import com.emp.demo.repo.Employeerepo;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private Employeerepo employeerepo;

	@Override
	public List<Employee> getEmployees() {
		
		return employeerepo.findAll() ;
	}

//	@Override
//	public Employee getEmployeeById(Long parsLong) {
//		
//		return this.employeerepo.getOne(parsLong);
//	}

	@Override
	public Employee addEmployee(Employee employee) {
		
		return employeerepo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
	
		return employeerepo.save(employee);
	}

	@Override
	public void deleteEmployee(Long parsLong) {
		Employee en = employeerepo.getOne(parsLong);
		employeerepo.delete(en);
		
	}
	
	
	// get single id

	@Override
	public Optional<Employee> findById(Long id) {
		
		return employeerepo.findById(id);
	}

}
