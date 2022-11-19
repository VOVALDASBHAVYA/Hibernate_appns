package com.ojas.entity;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client_BooknAuth {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		Author author=new Author();
		author.setAuthorId(1);
		author.setName("Stephen Hawkins");
		
		Book book=new Book();
		book.setTitle("Digital Signals and Systems");
		book.setDescription("Content is about signals like Amplitude and Frrequency modulation");
		book.setPublishedDate(new Date());
		
		s.save(author);
		s.save(book);
		tx.commit();
		s.close();
		sf.close();
	}

}
