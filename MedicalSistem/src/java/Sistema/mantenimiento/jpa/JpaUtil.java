/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author roberto.abregoUSAM
 */
public class JpaUtil {
    
    private static final EntityManagerFactory emf;
    static{
        try {
            emf=Persistence.createEntityManagerFactory("MedicalSistemPU");
        } catch (Throwable e) {
           throw new ExceptionInInitializerError(e);
        }
        
    }
    
    public static EntityManagerFactory getEntityManagerFactory(){
        return emf;
    }
    
    public static EntityManager getEntityManager(){
        return getEntityManagerFactory().createEntityManager();
    }
}
