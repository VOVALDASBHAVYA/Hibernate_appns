package com.ojas.annotationEntity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmployee {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Employee e1=s.get(Employee.class, 1);
		e1.setEmployeName("vedulu");
		s.update(e1);
		tx.commit();
		s.close();
		sf.close();
	}

}
