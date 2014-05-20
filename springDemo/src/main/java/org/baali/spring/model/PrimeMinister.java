package org.baali.spring.model;

import java.util.List;

public class PrimeMinister
{
	private String name;
	private List<String>canList;

	public List<String> getCanList()
	{
		return canList;
	}

	public void setCanList(List<String> canList)
	{
		this.canList = canList;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	
}
