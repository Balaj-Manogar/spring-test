package org.baali.spring.demo;

import org.baali.spring.model.InitAndDestroyMethodClassLevel;
import org.baali.spring.model.InitAndDestroyXML;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitAndDestroyDemo
{
	public static void main(String[] args)
	{
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		appContext.registerShutdownHook();
		InitAndDestroyMethodClassLevel init1 = (InitAndDestroyMethodClassLevel)appContext.getBean("init1");
		init1.printName();
		
		InitAndDestroyXML init2 = (InitAndDestroyXML) appContext.getBean("init2");
		init2.printName();
		
		appContext.close();
	}

}
