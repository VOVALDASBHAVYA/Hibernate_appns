package com.ojas.annotationEntity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateEmployee {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		Employee e= new Employee();
//		e.setEmployeId(1);
//		e.setEmployeName("vedalu");
//		e.setEmployeSalary(1000000.00);
		e.setEmployeId(2);
		e.setEmployeName("vedansh");
		e.setEmployeSalary(2000000.00);
		s.save(e);
		tx.commit();
		s.close();
		sf.close();

	}

}
