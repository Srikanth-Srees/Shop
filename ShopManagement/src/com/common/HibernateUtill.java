package com.common;

public class HibernateUtill {

	public static SessionFactory sf:

		Static{
		try {
			sf = new configuration().buildSessionFactory();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		public SessionFactory getSessionFactory()
		{
			return SessionFactory;
		}
		
}
