package org.baali.spring.model;

public class ConstructorArgDemo
{
	private String name;
	public ConstructorArgDemo(String name)
	{
		this.name = name;
		System.out.println("Hi " + this.name);		
	}

}
