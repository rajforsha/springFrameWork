package com.shashi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shashi.service.EmployeeService;

/**
 * @author vagrant
 *
 */
@Component
public class EmployeeApplication {

	@Autowired
	public EmployeeService employeeService;

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void createEmployee() {
		getEmployeeService().create();
	}

	public static void main(String[] args) {
		EmployeeApplication app = new EmployeeApplication();
		app.createEmployee();

	}
}
