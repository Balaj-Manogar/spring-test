package org.baali.spring.model;

import javax.jws.soap.SOAPBinding.Use;

public class SpringAutoWireByName
{
	private User user;

	public User getUser()
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}
	
	

}
