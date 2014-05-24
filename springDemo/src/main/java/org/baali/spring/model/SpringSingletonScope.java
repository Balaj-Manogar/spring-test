package org.baali.spring.model;

public class SpringSingletonScope
{
	private static int count = 0;
	private String name;
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	private int id;

	public SpringSingletonScope()
	{
		//SpringSingletonScope.count++;
		//System.out.println("Singleton scope: count=" + SpringSingletonScope.count);
	}
}
