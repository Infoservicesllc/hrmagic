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
	public ResponseEntity<Employee> getEmployee(@PathVariable int empID) {
		ResponseEntity<Employee> entity = new ResponseEntity<Employee>(employeeService.getEmployee(empID), HttpStatus.OK);
		return entity; 
	}
    
	@RequestMapping(value = "/addEmployee", method = RequestMethod.GET)
	public ResponseEntity<Boolean> addEmployee(@PathVariable Employee emp) {
		ResponseEntity<Boolean> entity = new ResponseEntity<Boolean>(employeeService.addEmployee(emp), HttpStatus.CREATED);
		return entity; 
	}
	
	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deleteEmployee(@PathVariable int empID) {
		ResponseEntity<Boolean> entity = new ResponseEntity<Boolean>(employeeService.deleteEmployee(empID), HttpStatus.OK);
		return entity; 
	}

	@RequestMapping(value = "/updateEmployee", method = RequestMethod.PUT)
	public ResponseEntity<Boolean> updateEmployee(@PathVariable Employee emp) {
		ResponseEntity<Boolean> entity = new ResponseEntity<Boolean>(employeeService.addEmployee(emp), HttpStatus.OK);
		return entity;
	}
}

