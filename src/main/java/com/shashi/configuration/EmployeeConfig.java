package com.shashi.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.shashi.EmployeeApplication;
import com.shashi.dao.EmployeeDao;
import com.shashi.daoImpl.EmployeeDaoImpl;
import com.shashi.repository.JdbcRepository;
import com.shashi.repository.RepositoryImpl;
import com.shashi.service.EmployeeService;
import com.shashi.serviceImpl.EmployeeServiceImpl;

/**
 * @author vagrant
 *
 */
@Configuration
public class EmployeeConfig {

	@Bean
	public EmployeeApplication employeeApplication() {
		return new EmployeeApplication(employeeService());
	}

	@Bean
	public EmployeeService employeeService() {
		return new EmployeeServiceImpl(employeeDao());
	}

	@Bean
	public EmployeeDao employeeDao() {
		return new EmployeeDaoImpl(jdbcRepository());
	}

	@Bean
	public JdbcRepository jdbcRepository() {
		return new RepositoryImpl(dataSource());
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/test");
		dataSource.setUsername("root");
		dataSource.setPassword("shashi");
		return dataSource();
	}

}
