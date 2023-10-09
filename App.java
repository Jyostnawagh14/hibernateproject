package com.project.hibernateproject1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App  // main class name
{
	 public static void main(String args[]) //main method
	    {
	        System.out.println( "Project Started" );
	        Configuration cfg=new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        
	        //creating the session factory
	        SessionFactory factory=cfg.buildSessionFactory();
	        
	        //creating the object of the product in Customer
	        Customer c1=new Customer();
	        c1.setCid(101);
	        c1.setCname("Trisha");
	        
	       //Creating the object of product
	        Product p1=new Product();
	        p1.setPid(201);
	        p1.setPname("Sneakers");
	        
	        //passing the object of project in student
	        c1.setProduct(p1);
	        
	        //Opening the session
	        Session session=factory.openSession();
	        
	        //Starting the transaction
	        Transaction tx=session.beginTransaction();
	        session.save(c1);
	        session.save(p1);
	        tx.commit();
	        
	        session.close();
	        factory.close();
	    }
}
