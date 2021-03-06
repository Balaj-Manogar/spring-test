package org.baali.spring.model;

public class InitAndDestroyXML
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


	public void destroy()
	{
		System.out.println("Bean is destroying...");
	}

	
	public void afterPropertiesSet() 
	{
		System.out.println("Bean is Initializing...");
	}

}
