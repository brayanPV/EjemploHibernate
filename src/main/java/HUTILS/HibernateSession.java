/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HUTILS;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author stive
 */
public class HibernateSession {
    private static final SessionFactory sessionFactory = buildSessionFactory();
    private static Session session;
    
    private static SessionFactory buildSessionFactory(){
        Configuration configuration = new Configuration();  
        configuration.configure();
        //StandardServiceRegistryBuilder serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        //SessionFactory sessionFactory = configuration.buildSessionFactory((ServiceRegistry) serviceRegistry);
        SessionFactory sessionFactory = configuration.buildSessionFactory(/*serviceRegistry*/);
        return sessionFactory;
    } 

    public static SessionFactory getSessionFactory() 
    { 
        return sessionFactory; 
    } 
    
    public static Session getSession(){
    if(null == session){
        session = sessionFactory.openSession();
    }
    return session;
    }
}
