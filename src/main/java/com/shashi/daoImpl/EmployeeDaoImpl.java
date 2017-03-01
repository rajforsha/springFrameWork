package com.shashi.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.shashi.dao.EmployeeDao;
import com.shashi.repository.JdbcRepository;

/**
 * @author vagrant
 *
 */
public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcRepository jdbcRepository;

	@Autowired
	public EmployeeDaoImpl(JdbcRepository jdbcRepository) {
		this.jdbcRepository = jdbcRepository;
	}

	public void create() {
		jdbcRepository.create();
	}
	
	
}
