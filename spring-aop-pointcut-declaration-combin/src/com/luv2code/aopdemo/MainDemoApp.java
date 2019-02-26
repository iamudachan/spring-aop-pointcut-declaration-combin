package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		// read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccountDAO = 
				context.getBean("accountDAO", AccountDAO.class);
		
		MembershipDAO theMembershipDAO = 
				context.getBean("membershipDAO",MembershipDAO.class);
		
		// call the business method point cut
		Account acc =  new Account();
		theAccountDAO.addAccount(acc, true);
		theAccountDAO.doWork();
		theAccountDAO.setName("football");
		theAccountDAO.setServiceCode("Helloservice");
		
		String name = theAccountDAO.getName();
		String service = theAccountDAO.getServiceCode();
		System.out.println("===============");
		theMembershipDAO.addAccount();
		theMembershipDAO.addSillyAccount();

		// close the context
		context.close();
	}

}










