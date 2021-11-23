package com.techjs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Product;
import entity.Reviews;

public class OneToOneDemo 
{

	public static void main(String[] args) 
	{
//		Product p1 = new Product();
//		p1.setPid(1001);
//		p1.setPname("Product1");
//		
//		Reviews r = new Reviews();
//		r.setComments("Good Product");
//		r.setRating(4);
//		r.setId(101);
//		
//		p1.setPreviews(r);
//	
//
//		
//        Configuration config = new Configuration().configure();
//        config.addAnnotatedClass(Reviews.class);
//        config.addAnnotatedClass(Product.class);
//        
//        SessionFactory sf = config.buildSessionFactory();
//        
//        Session session = sf.openSession();
//        
//        Transaction ts = session.beginTransaction();
//        
//        session.save(r);
//        session.save(p1);
//        
//        ts.commit();
//        session.close();
//        sf.close();
       
	}

}
