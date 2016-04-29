package com.hrmagiccore.service;

import java.util.List;

import com.hrmagiccore.domain.Employee;


public interface EmployeeService {

	public List<Employee> getEmployeeList();

	public Employee getEmployee(int id);

	public boolean addEmployee(Employee emp);

	public boolean updateEmployee(Employee emp);

	public boolean deleteEmployee(int id);

}
