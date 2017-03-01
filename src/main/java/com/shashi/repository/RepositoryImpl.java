package com.shashi.repository;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author vagrant
 *
 */
public class RepositoryImpl implements JdbcRepository {

	public JdbcTemplate jdbcTemplate;

	@Autowired
	public RepositoryImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void create() {
		jdbcTemplate.execute("Insert into Emp values('10001','shashi','Male')");
	}

}
