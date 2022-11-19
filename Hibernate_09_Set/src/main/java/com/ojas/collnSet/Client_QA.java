package com.ojas.collnSet;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client_QA {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		Answers answer=new Answers();
		
		answer.setAnswer("Solution_1");
		
		Answers answer_1=new Answers();
//		answer_2.setId(2);
		answer_1.setAnswer("Soution_2");
		
		Question question=new Question();
		question.setqId(1);
		question.setqName("QuestionSet_1");
		Set<Answers> set=new HashSet<Answers>();
		set.add(answer);
		set.add(answer_1);
//		set.add(answer_2);
		question.setAnswer(set);
		
		s.save(question);
//		s.save(answer_1);
//		s.save(answer_2);
		tx.commit();
		s.close();
		sf.close();

	}

}
