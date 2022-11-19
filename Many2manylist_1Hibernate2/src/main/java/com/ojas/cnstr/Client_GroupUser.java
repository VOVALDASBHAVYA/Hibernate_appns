package com.ojas.cnstr;

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

		Group gAdmin = new Group("Administrator group");
		Group gGuest = new Group("Guest group");

		User user1 = new User("Voval", "Vovaldas", "voval@gmail.com");
		User user2 = new User("Sree", "das", "das@gmail.com");
//		Set<Group> set=new HashSet<Group>();
//		Set<User> set=new HashSet<User>();
		gAdmin.addUser(user1);
		gAdmin.addUser(user2);
		//gGuest.addUser(user1);

		user1.addGroup(gAdmin);
		user2.addGroup(gAdmin);
		//user1.addGroup(gGuest);

		s.save(gAdmin);
		s.save(gGuest);
		tx.commit();
		s.close();
		sf.close();

	}

}
