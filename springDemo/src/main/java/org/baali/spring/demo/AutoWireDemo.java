package org.baali.spring.demo;

import org.baali.spring.model.SpringAutoWireByName;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireDemo
{

	public static void main(String[] args)
	{
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		SpringAutoWireByName autoWireByName = (SpringAutoWireByName) appContext.getBean("autoWireByName");
		System.out.println("Auto wire by name: " + autoWireByName.getUser().getName());
	}

}
