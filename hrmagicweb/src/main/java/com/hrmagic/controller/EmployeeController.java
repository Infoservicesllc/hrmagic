package com.hrmagic.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hrmagiccore.domain.Company;
import com.hrmagiccore.domain.Employee;
import com.hrmagiccore.domain.EndClient;
import com.hrmagiccore.domain.HomeAddress;
import com.hrmagiccore.domain.Vendor;
import com.hrmagiccore.domain.VisaStatus;
import com.hrmagiccore.domain.WorkAddress;
import com.hrmagiccore.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> getEmployees() {
		
		Employee emp =  new Employee();
		emp.setContact(254777877);
		emp.setDob(new Date());
		emp.setEmail("first.last@company.com");
		emp.setName("Firstname Last Name");
		emp.setSsn("000-00-0000");
		emp.setStartDate(new Date());
		emp.setVisaStaus(VisaStatus.H1B);
		emp.setW4onFile(true);
		emp.setWorkPhone("234-949-2344");
		emp.setVisaValidation(new Date());
		
		EndClient endClient =  new EndClient();
		endClient.setContactNumb("234-234-3444");
		endClient.setContactPerson("endl Client contact name");
		endClient.setName("End Client name INc");
		
		Vendor vendor =  new Vendor();
		vendor.setContactNumb("234-234-3444");
		vendor.setContactPerson("endl Client contact name");
		vendor.setName("End Client name INc");
		
		
		HomeAddress homeAddress =  new HomeAddress();
		homeAddress.setLine1("94854 XYZ DR");
		homeAddress.setLine2("Apt # 123");
		homeAddress.setCity("City Name");
		homeAddress.setState("MI");
		homeAddress.setZip("00999");
		
		WorkAddress workAddress =  new WorkAddress();
		workAddress.setLine1("94854 XYZ DR");
		workAddress.setLine2("Apt # 123");
		workAddress.setCity("City Name");
		workAddress.setState("MI");
		workAddress.setZip("00999");
		
		emp.setEndClient(endClient);
		emp.setHomeAddress(homeAddress);
		emp.setWorkAddress(workAddress);
		emp.setVendor(vendor);
		
		employeeService.addEmployee(emp);
		
		ResponseEntity<List<Employee>> resp = new ResponseEntity<List<Employee>>(employeeService.getEmployeeList(),
				HttpStatus.OK);
		return resp;
	}

	@RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
	public ResponseEntity<Employee> getEmployee(@PathVariable int id) {
	
		System.out.println("EmployeeController.getEmployee( )  | ID  : "+id  );
		
		ResponseEntity<Employee> entity = new ResponseEntity<Employee>(employeeService.getEmployee(id),
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
