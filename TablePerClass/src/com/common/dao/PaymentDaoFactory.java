package com.common.dao;

public class PaymentDaoFactory {
private static PaymentDaoImpl impl;
public static synchronized Payment getInstance()
{
	if(impl==null)
	{
		impl=new PaymentDaoImpl();
	}
	return impl;
}
}
