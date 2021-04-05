package com.pk.dao;

import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOImpl implements IEmployeeDAO {
	
	
	//	query to get employee count
	private static final String GET_EMP_COUNT=" SELECT COUNT(*) FROM EMP ";
	
	//declare dependencies
	JdbcTemplate jt;
	public EmployeeDAOImpl(JdbcTemplate jt) {
		this.jt=jt;
		System.out.println("EmployeeDAOImpl.EmployeeDAOImpl 1 param()");
		
	}

	public int getEmpCount() throws SQLException {
		int count=jt.queryForObject(GET_EMP_COUNT, Integer.class);
		
		return count;
	}

}
