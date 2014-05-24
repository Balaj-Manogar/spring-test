package org.baali.spring.demo;

import org.baali.spring.model.SpringPrototypeScope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringPrototypeScopeDemo
{
	public static void main(String[] args)
	{
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		SpringPrototypeScope prototypeBean = (SpringPrototypeScope) appContext.getBean("prototypeScope");
		
		prototypeBean.setName("Monika. B");
		System.out.println(prototypeBean.getName());
		
		SpringPrototypeScope prototypeBean2 = (SpringPrototypeScope) appContext.getBean("prototypeScope");
		System.out.println(prototypeBean2.getName());
	}

}
