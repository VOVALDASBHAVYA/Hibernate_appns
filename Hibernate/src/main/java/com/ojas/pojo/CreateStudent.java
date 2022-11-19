package com.ojas.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateStudent {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		Student s1=new Student();
		
//		s1.setSid(4);
//		s1.setSname("Vedu");
//		s1.setMarks(100);
		s1.setSid(1);
		s1.setSname("Vedu");
		s1.setMarks(100);
		s.save(s1);
		tx.commit();
		s.close();
		sf.close();
		
	}

}
