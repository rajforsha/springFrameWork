package com.shashi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shashi.service.EmployeeService;

/**
 * @author vagrant
 *
 */
@RestController
public class EmployeeApplication {

	public EmployeeService employeeService;

	public EmployeeApplication() {
	}

	@Autowired
	public EmployeeApplication(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@RequestMapping("/hello")
	@GetMapping
	public String HelloWorld() {
		createEmployee();
		return "Hello World !";
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void createEmployee() {
		getEmployeeService().create();
	}

}
