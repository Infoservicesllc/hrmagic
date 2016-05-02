package com.hrmagic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.hrmagiccore.domain.Employee;
import com.hrmagiccore.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> getEmployees() {
		ResponseEntity<List<Employee>> resp = new ResponseEntity<List<Employee>>(employeeService.getEmployeeList(),
				HttpStatus.OK);
		return resp;
	}

	@RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
	public ResponseEntity<Employee> getEmployee(@PathVariable int empID) {
		ResponseEntity<Employee> entity = new ResponseEntity<Employee>(employeeService.getEmployee(empID),
				HttpStatus.OK);
		return entity;
	}

	@RequestMapping(value = "/employees", method = RequestMethod.POST)
	public ResponseEntity<Boolean> addEmployee(@RequestBody Employee emp) {
		ResponseEntity<Boolean> entity = new ResponseEntity<Boolean>(employeeService.addEmployee(emp),
				HttpStatus.CREATED);
		return entity;
	}

	@RequestMapping(value = "/employees/{id}", method = RequestMethod.PATCH)
	public ResponseEntity<Boolean> updateEmployee(@PathVariable int empID, @RequestBody Employee emp) {
		ResponseEntity<Boolean> entity = new ResponseEntity<Boolean>(employeeService.updateEmployee(empID, emp),
				HttpStatus.OK);
		return entity;
	}

	@RequestMapping(value = "/employees/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deleteEmployee(@PathVariable int empID) {
		ResponseEntity<Boolean> entity = new ResponseEntity<Boolean>(employeeService.deleteEmployee(empID),
				HttpStatus.OK);
		return entity;
	}
}
