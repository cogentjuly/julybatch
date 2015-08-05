package com.saran;

 

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
public class Main {
	
	
	public static void main(String args[]){
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s1=sf.openSession();
		s1.beginTransaction();
	//	UserDetails22 u0=new UserDetails22();
		/*u0.setUserId(1);
		u0.setUserName("Yao");
		s1.save(u0);*/
		UserDetails22 u1=(UserDetails22)s1.get(UserDetails22.class,1);
		
		
		UserDetails22 u2=(UserDetails22)s1.get(UserDetails22.class,1);
		
		s1.getTransaction().commit();
		
		Session s2=sf.openSession();
		s2.beginTransaction();
		UserDetails22 u22=(UserDetails22)s2.get(UserDetails22.class,1);
		
		s2.getTransaction().commit();
		
	}

}
