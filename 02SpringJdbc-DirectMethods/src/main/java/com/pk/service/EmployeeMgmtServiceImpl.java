package com.pk.service;

import java.sql.SQLException;

import com.pk.dao.IEmployeeDAO;

public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	IEmployeeDAO dao;
	public EmployeeMgmtServiceImpl(IEmployeeDAO dao) {
		this.dao=dao;			
		System.out.println("EmployeeMgmtServiceImpl.EmployeeMgmtServiceImpl() 1 param constructor");
	}
	
	
	

	public String fetchEmpCount() throws Exception {
		int count=dao.getEmpCount();
		return "total employess are :"+count;
		
	}
	

}
