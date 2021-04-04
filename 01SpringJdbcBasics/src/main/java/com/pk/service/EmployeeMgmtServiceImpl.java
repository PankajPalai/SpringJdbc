package com.pk.service;

import java.sql.SQLException;

import com.pk.dao.IEmployeeDAO;

public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	IEmployeeDAO dao;
	public EmployeeMgmtServiceImpl(IEmployeeDAO dao) {
		this.dao=dao;
	}

	@Override
	public int getEmpCount() throws SQLException {
		
		int count=dao.empCount();
		return count;
		
	}

}
