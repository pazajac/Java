package com.miszcze.java;

import com.miszcze.java.View.*;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final SessionFactory sessionFactory = null;
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public static void main( String[] args ) 
    {
  
  
        View la = new View();
        la.setVisible(true);
      

    }
}
