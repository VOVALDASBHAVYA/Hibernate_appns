package com.ojas.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client_TPH {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		Mobile mobile=new Mobile();
		
		mobile.setMobileId(1);
		mobile.setMobileBrand("vedanshBrand");
		
		IOS ios=new IOS();
		
		ios.setMobileId(2);
		ios.setMobileBrand("hrithikaBrand");
		ios.setModelType("16 Version");
		ios.setPrice(50000.10);
		
		Andriod_OS os=new Andriod_OS();
		
		os.setMobileId(3);
		os.setMobileBrand("Sree");
		os.setPrice(50000);
		os.setProcesserType("Octa_core");
		
		s.save(mobile);
		s.save(ios);
		s.save(os);
		
		tx.commit();
		s.close();
		sf.close();

	}

}
