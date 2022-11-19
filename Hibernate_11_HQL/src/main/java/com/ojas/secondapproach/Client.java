package com.ojas.secondapproach;

import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		Query query = s.createQuery("from Customers");
		List<Customers> customers = query.getResultList();
		for (Customers c : customers) {
			System.out.println(c);
		}
		tx.commit();
		s.close();
		sf.close();

	}
}
