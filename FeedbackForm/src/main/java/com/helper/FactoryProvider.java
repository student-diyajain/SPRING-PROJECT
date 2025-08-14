package com.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {
	public static SessionFactory Factory; 
	
	public static  SessionFactory getFactory() {
		if (Factory==null) {
			Factory=new Configuration().configure().buildSessionFactory();
			}
		return Factory;
	}
	
		public  void closeFactory() {
			if(Factory.isOpen()) {
				Factory.close();
			}
		}
	
	
}













	
