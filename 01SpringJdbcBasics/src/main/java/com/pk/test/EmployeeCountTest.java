package com.pk.test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pk.service.IEmployeeMgmtService;

public class EmployeeCountTest {

	public static void main(String[] args) throws SQLException {
		ApplicationContext act=new ClassPathXmlApplicationContext("com/pk/cfgs/applicationContext.xml");
		IEmployeeMgmtService service=act.getBean("custService",IEmployeeMgmtService.class);
		int count=service.getEmpCount();
		System.out.println(count +" RECORDS ARE AVAILABLE");
		
		
		

	}

}
