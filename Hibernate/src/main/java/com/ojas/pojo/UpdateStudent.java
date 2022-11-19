package com.ojas.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateStudent {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
//		Student s1=s.load(Student.class, new Integer(1));
		Student s1=s.get(Student.class, new Integer(4));
		
		System.out.println("Student Id:"+s1.getSid());
		s1.setSname("Vedansh");
		s.update(s1);
		tx.commit();
		s.close();
		sf.close();
	}

}
