package com.shashi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.shashi.EmployeeApplication;
import com.shashi.dao.EmployeeDao;
import com.shashi.daoImpl.EmployeeDaoImpl;
import com.shashi.service.EmployeeService;
import com.shashi.serviceImpl.EmployeeServiceImpl;

/**
 * @author vagrant
 *
 */
@Configuration
public class EmployeeConfig {

	@Bean
	public EmployeeDao employeeDao() {
		return new EmployeeDaoImpl();
	}

	@Bean
	public EmployeeService employeeService() {
		return new EmployeeServiceImpl(employeeDao());
	}

	@Bean
	public EmployeeApplication employeeApplication() {
		return new EmployeeApplication(employeeService());
	}
}
