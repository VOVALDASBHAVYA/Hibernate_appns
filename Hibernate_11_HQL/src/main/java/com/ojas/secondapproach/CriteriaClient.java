package com.ojas.secondapproach;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CriteriaClient {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate1.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		Criteria ct = s.createCriteria(Customers.class);
		ct.setFirstResult(0);
		ct.setMaxResults(10);
		List list = ct.list();
		System.out.println("No Of Record Count = " + list.size());

		tx.commit();
		s.clear();
		sf.close();

	}

}