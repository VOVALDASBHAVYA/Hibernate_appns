package com.ojas.lombok;

import java.util.List;

import org.hibernate.Query;
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
		
		Query query=s.createQuery("from Students");
		List<Students> students=query.getResultList();
		students.forEach(System.out::println);
		Transaction tx = s.beginTransaction();//observations are important
		tx.commit();
		s.close();
		sf.close();

	}

}