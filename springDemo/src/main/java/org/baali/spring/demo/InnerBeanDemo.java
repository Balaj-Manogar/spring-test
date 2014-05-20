package org.baali.spring.demo;

import org.baali.spring.model.OuterBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerBeanDemo
{

	public static void main(String[] args)
	{
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		OuterBean outerBean = (OuterBean) appContext.getBean("outerBean");
		System.out.println("Inner Bean Name: " + outerBean.getInnerBean().getName());

	}

}
