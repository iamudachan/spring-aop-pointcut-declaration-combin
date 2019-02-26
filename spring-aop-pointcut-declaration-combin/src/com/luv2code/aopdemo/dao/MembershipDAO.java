package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	
	public void addAccount(){
		System.out.println(getClass()+ " : Doing stuff adding a membersship acc");
	}
	
	
	public boolean addSillyAccount(){
		System.out.println(getClass()+ " : Doing stuff adding a membersship acc");
		return true;
	}
}
