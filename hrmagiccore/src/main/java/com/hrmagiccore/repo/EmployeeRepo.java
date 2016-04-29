package com.hrmagiccore.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrmagiccore.domain.Address;
import com.hrmagiccore.domain.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {


	//public List<Employee> findAll();

	//public Employee findOne(long id);
	
	public Employee findByEmpID(long id);

	

}
