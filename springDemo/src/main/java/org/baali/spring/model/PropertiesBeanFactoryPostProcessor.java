package org.baali.spring.model;

public class PropertiesBeanFactoryPostProcessor
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
	
}
