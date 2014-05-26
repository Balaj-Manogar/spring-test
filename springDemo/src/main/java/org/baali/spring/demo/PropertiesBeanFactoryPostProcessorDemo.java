package org.baali.spring.demo;

import org.baali.spring.model.PropertiesBeanFactoryPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesBeanFactoryPostProcessorDemo
{

	public static void main(String[] args)
	{
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		PropertiesBeanFactoryPostProcessor propBean = (PropertiesBeanFactoryPostProcessor) appContext.getBean("propBean");
		propBean.printName();

	}

}
