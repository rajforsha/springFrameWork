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

	@Autowired
	public EmployeeDao employeeDao;

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void create() {
		getEmployeeDao().create();

	}

}
