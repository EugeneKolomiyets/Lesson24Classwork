package com.alevel;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;


public class HibernateUtils {
    public static SessionFactory getSessionFactory(){
        //try{
        try{
            //Create registry
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
            //Create MetadataSources
            MetadataSources sources = new MetadataSources(serviceRegistry);

            //Create Metadata
            Metadata metadata = sources.getMetadataBuilder().build();

            //Create SessionFactory
            return metadata.getSessionFactoryBuilder().build();
        } catch (Throwable e) {
            System.err.println("Faled to creatre sessionFactory object."+e);
            throw new ExceptionInInitializerError(e);
        }
        /*} catch (Exception e) {
         System.out.printen(e.getMessage());
         }*/
         //return null

    }

}
