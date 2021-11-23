package com.techjs;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Product;
import entity.Reviews;

public class ManyToManyDemo
{

	public static void main(String[] args) 
	{
		Product p1 = new Product();
		p1.setPid(1001);
		p1.setPname("Product1");
		
		Reviews r1 = new Reviews();
		r1.setComments("Good Product");
		r1.setRating(4);
		r1.setId(101);
		r1.getProduct().add(p1);
		
		Reviews r2 = new Reviews();
		r2.setComments("Best Product");
		r2.setRating(3);
		r2.setId(102);
		r2.getProduct().add(p1);
		
		List<Reviews> reviews = new ArrayList();
		reviews.add(r1);
		reviews.add(r2);
		
		p1.setpReviews(reviews);
		
        Configuration config = new Configuration().configure();
        config.addAnnotatedClass(Reviews.class);
        config.addAnnotatedClass(Product.class);
        
        SessionFactory sf = config.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction ts = session.beginTransaction();
        session.save(p1);
        session.save(r1);
        session.save(r2);
        
        
        ts.commit();
        session.close();
        sf.close();
	}

}
