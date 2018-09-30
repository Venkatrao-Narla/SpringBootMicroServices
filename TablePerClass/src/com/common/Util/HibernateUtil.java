package com.common.Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory;
	public static synchronized SessionFactory getSessionFactory()
	{
		if(factory==null)
		{
			factory=new Configuration().configure().buildSessionFactory();
		}
		return factory;
	}

}
