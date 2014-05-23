package org.baali.spring.demo;

import org.baali.spring.model.OuterBean;
import org.baali.spring.model.OuterBeanInner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerBeanDemo
{

	public static void main(String[] args)
	{
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		OuterBean outerBean = (OuterBean) appContext.getBean("outerBean");
		System.out.println("Inner Bean Name: " + outerBean.getInnerBean().getName());
		
		OuterBeanInner outerBeanInner =  (OuterBeanInner)appContext.getBean("outerBeanInner");
		System.out.println("Inner Bean Name: " + outerBeanInner.getInnerBean().getName());

	}

}
