package com.learn.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.repository.Employee;
import com.learn.repository.EmployeeRepository;

@RestController
public class EmployeeApi {
	
	EmployeeRepository employeeRepository;
	
	@GetMapping("/getEmployeeList")
	public ResponseEntity<?> getEmployeeList() {
		
		Employee firstEmployee = new Employee();
		firstEmployee.setEmployeeName("Kumar");
		firstEmployee.setEmailId("email@gmail.com");
		firstEmployee.setMobileNo("808080808");
		
		List<Employee> empList = null;
		try {
			employeeRepository.save(firstEmployee);
			empList = employeeRepository.findAll();
			return ResponseEntity.status(HttpStatus.OK).body(empList);
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{\"status\":\"Failure\"}");
		}
	}

}
