package org.baali.spring.model;

public class OuterBeanInner
{
	private InnerBean innerBean;

	public InnerBean getInnerBean()
	{
		return innerBean;
	}

	public void setInnerBean(InnerBean innerBean)
	{
		this.innerBean = innerBean;
	}
}
