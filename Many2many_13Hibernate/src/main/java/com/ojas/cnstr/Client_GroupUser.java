package com.ojas.cnstr;

import java.util.ArrayList;
import java.util.List;

//import java.util.HashSet;
//import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Client_GroupUser {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		
		Group group=new Group();
		group.setName("admistration");
		group.setUsers(user);
		Group group1=new Group();
		group1.setName("Guest");
		
		
		
		User user=new User("bhavya", "bhavya@1234", "bhavyavovaldas@gmail.com", group);


	}

}
