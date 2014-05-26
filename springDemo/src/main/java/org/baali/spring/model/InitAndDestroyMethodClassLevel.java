package org.baali.spring.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InitAndDestroyMethodClassLevel implements InitializingBean, DisposableBean
{
	private String name;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public void printName()
	{
		System.out.println(this.getName());
	}

	@Override
	public void destroy() throws Exception
	{
		System.out.println("Bean is destroying...");
	}

	@Override
	public void afterPropertiesSet() throws Exception
	{
		System.out.println("Bean is Initializing...");
	}
	
}
