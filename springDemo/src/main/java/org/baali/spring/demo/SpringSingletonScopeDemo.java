package org.baali.spring.demo;

import org.baali.spring.model.SpringSingletonScope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSingletonScopeDemo
{
	public static void main(String[] args)
	{
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		SpringSingletonScope singletonScope = (SpringSingletonScope) appContext.getBean("singletonScope1");
		singletonScope.setName("Boopathi. M");
		System.out.println(singletonScope.getName());
		SpringSingletonScope singletonScope2 = (SpringSingletonScope) appContext.getBean("singletonScope1");
		singletonScope.setName("Ramesh. M");
		System.out.println(singletonScope2.getName() + " ...");
		System.out.println(singletonScope.getName());
	}
}
