package com.emp.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.demo.entity.Employee;
@Repository
public interface Employeerepo extends JpaRepository<Employee, Long> {
	
	
	

}
