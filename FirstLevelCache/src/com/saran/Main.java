package com.saran;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Main {
	
	 
	public static void main(String args[]){
	    
		SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();
		Session s1=sf.openSession();
		s1.beginTransaction();
		UserDetails22 u01=(UserDetails22)s1.get(UserDetails22.class,1);
		System.out.println("Emp Name"+ u01.getUserId());
		UserDetails22 u03=(UserDetails22)s1.get(UserDetails22.class,1);
		System.out.println("Emp Name"+ u01.getUserId());
		s1.getTransaction().commit();
		s1.close();
		Session s2=sf.openSession();
		s2.beginTransaction();
		UserDetails22 u02=(UserDetails22)s2.get(UserDetails22.class,1);
		System.out.println("Emp Name"+ u01.getUserId());
		 
		s2.getTransaction().commit();
		s2.close();
		
	}

}
