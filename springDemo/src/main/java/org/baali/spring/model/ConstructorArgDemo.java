package org.baali.spring.model;

public class ConstructorArgDemo
{
	private String name;
	public ConstructorArgDemo(String name)
	{
		this.name = name;
		System.out.println("From Constructor Bean... Hi " + this.name);		
	}

}
