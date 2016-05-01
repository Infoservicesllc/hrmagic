package com.hrmagiccore.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrmagiccore.domain.Employee;
import com.hrmagiccore.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Resource
	private EmployeeRepo employeeRepo;

	public List<Employee> getEmployeeList() {

		return employeeRepo.findAll();
	}

	public Employee getEmployee(int id) {

		return employeeRepo.findByEmpID(id);

	}

	public boolean addEmployee(Employee emp) {

		employeeRepo.save(emp);
		return true;

	}

	public boolean updateEmployee(int id, Employee emp) {

		// return employeeRepo.updateEmployee(emp);
		return false;
	}

	public boolean deleteEmployee(int id) {

		// return employeeRepo.deleteEmployee(id);
		return false;
	}

}
