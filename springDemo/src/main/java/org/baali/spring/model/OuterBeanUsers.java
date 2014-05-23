package org.baali.spring.model;

import java.util.List;

public class OuterBeanUsers
{
	private List<User> usersList;

	public List<User> getUsersList()
	{
		return usersList;
	}

	public void setUsersList(List<User> usersList)
	{
		this.usersList = usersList;
	}

	public void getUserDetails()
	{
		for (User user : usersList)
		{
			System.out.println("ID: " + user.getId());
			System.out.println("Name: " + user.getName());
			System.out.println("------------------");
		}
	}
}
