package org.baali.spring.demo;

import org.baali.spring.model.ConstructorArgDemo;
import org.baali.spring.model.PrimeMinister;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DisplayPMName
{

	
	public static void main(String[] args)
	{
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		PrimeMinister pmNameBean = (PrimeMinister)appContext.getBean("pmName");
		System.out.println(pmNameBean.getName());
		
		ConstructorArgDemo arg = (ConstructorArgDemo)appContext.getBean("consdemo");
		
	}

}
