package br.com.pooestoque.hibernate;

import java.util.Properties;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory object.
 *
 * @author augusto.ortolan
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory;
    
        

    private static final Properties properties;

    static {
        try {
            Configuration annotationConfiguration = new Configuration().configure();

            properties = annotationConfiguration.getProperties();

            sessionFactory = annotationConfiguration.buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }

    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static Session getSession() {
        return sessionFactory.openSession();
    }


    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
