package com.shashi.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shashi.dao.EmployeeDao;
import com.shashi.service.EmployeeService;

/**
 * @author vagrant
 *
 */
@Component
public class EmployeeServiceImpl implements EmployeeService {

	public EmployeeDao employeeDao;

	@Autowired
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void create() {
		getEmployeeDao().create();

	}

}
