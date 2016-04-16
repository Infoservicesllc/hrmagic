package com.hrmagic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.hrmagiccore.domain.Employee;
import com.hrmagiccore.service.EmployeeService;

@RestController
public class EmployeeController {

	private Employee employee;
	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/getEmployeeList", method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> getEmployee() {
		return (ResponseEntity<List<Employee>>) employeeService.getEmployeeList();
	}

	@RequestMapping(value = "/getEmployee", method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable int empID) {
		return employeeService.getEmployee(); 
	}
    
	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.GET)
	public boolean deleteEmployee(@PathVariable Employee emp) {
		return employeeService.deleteEmployee();
	}

	@RequestMapping(value = "/addEmployee", method = RequestMethod.GET)
	public boolean addEmployee(@PathVariable Employee emp) {
		return employeeService.addEmployee(emp);
	}

	@RequestMapping(value = "/updateEmployee", method = RequestMethod.GET)
	public boolean updateEmployee(@PathVariable Employee emp) {
		return employeeService.updateEmployee(emp);
	}
}
