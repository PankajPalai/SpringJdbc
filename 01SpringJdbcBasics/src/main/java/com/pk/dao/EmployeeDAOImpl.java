package com.pk.dao;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String EMP_COUNT="SELECT COUNT(*) FROM EMPLOYEE";
	//DataSource ds;
	JdbcTemplate jt;
	
public EmployeeDAOImpl(JdbcTemplate jt) {
	this.jt=jt;
}
//	@Override
	public int empCount() throws SQLException {
		int count=0;
		count=jt.queryForObject(EMP_COUNT,Integer.class);	
		return count;
	}

}
