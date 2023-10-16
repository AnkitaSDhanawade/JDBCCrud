package com.tut;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project started!" );
     
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println(factory);
        //creating dtudent
        
        Student st=new Student();
        st.setId(108);
        st.setName("Ashii");
        st.setCity("vashi");
        
        //creating ob of adress 
        Address ad=new Address();
        ad.setStreet("Moan nagar");    
        ad.setCity("Nashik");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(3232);
        
        //reading file
        
        FileInputStream fis=new FileInputStream ("src/main/java/download.jpg");
        byte [] data =new byte [fis.available()];
        fis.read(data);
        ad.setImages(data);
        Session session = factory.openSession();
       org.hibernate.Transaction tx= session.beginTransaction();
        session.save(st);
        session.save(ad);
       tx.commit();
       session.close();
       System.out.println("Done.....");
    }
}
