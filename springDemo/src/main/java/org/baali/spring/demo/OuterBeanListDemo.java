package org.baali.spring.demo;

import org.baali.spring.model.OuterBeanUsers;
import org.baali.spring.model.Users;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OuterBeanListDemo
{
	public static void main(String[] args)
	{
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Users users = (Users) appContext.getBean("listOuterBean");
		users.getUserDetails();
		
		OuterBeanUsers outerBeanUsers = (OuterBeanUsers) appContext.getBean("outerBeanUsers");
		outerBeanUsers.getUserDetails();
	}

}
