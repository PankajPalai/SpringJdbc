package com.pk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pk.service.EmployeeMgmtServiceImpl;
import com.pk.service.IEmployeeMgmtService;

public class DbOperationTest{
	public static void main(String[] args) {
		
		System.out.println("DbOperationTest.main()");
		
		ApplicationContext act=new ClassPathXmlApplicationContext("com/pk/cfgs/applicationContext.xml");
		
		IEmployeeMgmtService service=act.getBean("empService",EmployeeMgmtServiceImpl.class);
		try {
			System.out.println(service.fetchEmpCount());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		((AbstractApplicationContext) act).close();
		System.out.println("DbOperationTest.main() end");
		
	}
	
	
	

	
	
}