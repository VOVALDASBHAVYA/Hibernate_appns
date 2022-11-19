package com.ojas.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client_TPS {

	public static void main(String[] args) {
	Configuration cfg= new Configuration();
	cfg.configure();
	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession();
	Transaction tx=s.beginTransaction();
	
	Employee employee=new Employee();
	
	employee.setEid(1);
	employee.setName("vedansh");
	
	RegularEmployee employee1=new RegularEmployee();
	
	employee1.setEid(2);
	employee1.setName("hrithika");
	employee1.setSalary(100000);
	employee1.setBonus(5);
	
	ContractEmployee employee2=new ContractEmployee();
	
	employee2.setEid(3);
	employee2.setName("Sree");
	employee2.setPay_per_hour(1000);
	employee2.setDuration("40 hours");
	
	s.save(employee);
	s.save(employee1);
	s.save(employee2);
	
	tx.commit();
	s.close();
	sf.close();
	}

}
