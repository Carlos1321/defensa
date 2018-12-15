/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimientos;

import java.util.List;
import persistencia.TipoExamen;
import persistencia.Examen;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
/**
 *
 * @author alejandra.centeno
 */
public class mantenimientoExamen {
    
    //METODOS PARA MOSTRAR EL LISTADO DE EXAMENES AL MEDICO
    
    public List<TipoExamen> Mostrar_TipoExamen1(){
        EntityManager em = /*Persistence.createEntityManagerFactory("loginPU").createEntityManager();/*/JpaUtil.getEntityManagerFactory().createEntityManager();
        List<TipoExamen> listadodeExamenporTipo = null;
        em.getTransaction().begin();
        try{
            Query query = em.createQuery("SELECT t FROM TipoExamen t where t.tipoExamen = 'Análisis de Sangre'");
            em.getTransaction().commit();
            listadodeExamenporTipo = query.getResultList();  
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return listadodeExamenporTipo;
    }
    
    public List<TipoExamen> Mostrar_TipoExamen2(){
        EntityManager em = /*Persistence.createEntityManagerFactory("loginPU").createEntityManager();/*/JpaUtil.getEntityManagerFactory().createEntityManager();
        List<TipoExamen> listadodeExamenporTipo = null;
        em.getTransaction().begin();
        try{
            Query query = em.createQuery("SELECT t FROM TipoExamen t where t.tipoExamen = 'Análisis de Heces' or t.tipoExamen ='Análisis de Orina'");
            em.getTransaction().commit();
            listadodeExamenporTipo = query.getResultList();  
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return listadodeExamenporTipo;
    }
    
    public List<TipoExamen> Mostrar_TipoExamen3(){
        EntityManager em = /*Persistence.createEntityManagerFactory("loginPU").createEntityManager();/*/JpaUtil.getEntityManagerFactory().createEntityManager();
        List<TipoExamen> listadodeExamenporTipo = null;
        em.getTransaction().begin();
        try{
            Query query = em.createQuery("SELECT t FROM TipoExamen t where t.tipoExamen = 'Examen prenatal'");
            em.getTransaction().commit();
            listadodeExamenporTipo = query.getResultList();  
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return listadodeExamenporTipo;
    }
       
    public List<TipoExamen> Mostrar_TipoExamen4(){
        EntityManager em = /*Persistence.createEntityManagerFactory("loginPU").createEntityManager();/*/JpaUtil.getEntityManagerFactory().createEntityManager();
        List<TipoExamen> listadodeExamenporTipo = null;
        em.getTransaction().begin();
        try{
            Query query = em.createQuery("SELECT t FROM TipoExamen t where t.tipoExamen = 'Prueba estreptocócica'");
            em.getTransaction().commit();
            listadodeExamenporTipo = query.getResultList();  
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return listadodeExamenporTipo;
    }
           
    public List<TipoExamen> Mostrar_TipoExamen5(){
        EntityManager em = /*Persistence.createEntityManagerFactory("loginPU").createEntityManager();/*/JpaUtil.getEntityManagerFactory().createEntityManager();
        List<TipoExamen> listadodeExamenporTipo = null;
        em.getTransaction().begin();
        try{
            Query query = em.createQuery("SELECT t FROM TipoExamen t where t.tipoExamen = 'Otros'");
            em.getTransaction().commit();
            listadodeExamenporTipo = query.getResultList();  
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return listadodeExamenporTipo;
    }
    public List<TipoExamen> Mostrar_TipoExamen6(){
        EntityManager em = /*Persistence.createEntityManagerFactory("loginPU").createEntityManager();/*/JpaUtil.getEntityManagerFactory().createEntityManager();
        List<TipoExamen> listadodeExamenporTipo = null;
        em.getTransaction().begin();
        try{
            Query query = em.createQuery("SELECT t FROM TipoExamen t where t.tipoExamen = 'Radiografía'");
            em.getTransaction().commit();
            listadodeExamenporTipo = query.getResultList();  
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return listadodeExamenporTipo;
    }
       
    public List<TipoExamen> Mostrar_TipoExamen7(){
        EntityManager em = /*Persistence.createEntityManagerFactory("loginPU").createEntityManager();/*/JpaUtil.getEntityManagerFactory().createEntityManager();
        List<TipoExamen> listadodeExamenporTipo = null;
        em.getTransaction().begin();
        try{
            Query query = em.createQuery("SELECT t FROM TipoExamen t where t.tipoExamen = 'Tomografía computada'");
            em.getTransaction().commit();
            listadodeExamenporTipo = query.getResultList();  
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return listadodeExamenporTipo;
    }
       
    public List<TipoExamen> Mostrar_TipoExamen8(){
        EntityManager em = /*Persistence.createEntityManagerFactory("loginPU").createEntityManager();/*/JpaUtil.getEntityManagerFactory().createEntityManager();
        List<TipoExamen> listadodeExamenporTipo = null;
        em.getTransaction().begin();
        try{
            Query query = em.createQuery("SELECT t FROM TipoExamen t where t.tipoExamen = 'Resonancia magnética'");
            em.getTransaction().commit();
            listadodeExamenporTipo = query.getResultList();  
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return listadodeExamenporTipo;
    }
      
    public List<TipoExamen> Mostrar_TipoExamen9(){
        EntityManager em = /*Persistence.createEntityManagerFactory("loginPU").createEntityManager();/*/JpaUtil.getEntityManagerFactory().createEntityManager();
        List<TipoExamen> listadodeExamenporTipo = null;
        em.getTransaction().begin();
        try{
            Query query = em.createQuery("SELECT t FROM TipoExamen t where t.tipoExamen = 'Ultrasonido'");
            em.getTransaction().commit();
            listadodeExamenporTipo = query.getResultList();  
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return listadodeExamenporTipo;   
    }
       
    public List<TipoExamen> Mostrar_TodoTipoExamen(){
        EntityManager em = /*Persistence.createEntityManagerFactory("loginPU").createEntityManager();/*/JpaUtil.getEntityManagerFactory().createEntityManager();
        List<TipoExamen> listadodeExamenporTipo = null;
        em.getTransaction().begin();
        try{
            Query query = em.createQuery("SELECT t FROM TipoExamen t ORDER BY t.tipoExamen");
            em.getTransaction().commit();
            listadodeExamenporTipo = query.getResultList();  
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return listadodeExamenporTipo;   
    } 
       
    //METODO QUE MUESTRA TIPOS DE EXAMENES EN MODEL PANEL TABLA DE EXAMENES
       
    public List<TipoExamen> Select_TipoExamen(){
        EntityManager em = /*Persistence.createEntityManagerFactory("loginPU").createEntityManager();/*/JpaUtil.getEntityManagerFactory().createEntityManager();
        List<TipoExamen> listadodeExamenporTipo = null;
        em.getTransaction().begin();
        try{
            Query query = em.createQuery("SELECT t.tipoExamen FROM TipoExamen t group by t.tipoExamen");
            em.getTransaction().commit();
            listadodeExamenporTipo = query.getResultList();  
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return listadodeExamenporTipo;   
    } 
       
    //METODO PARA INSERTAR UN NUEVO EXAMEN EN TABLA TIPO EXAMEN
       
    public int Insertar_TipoExamen(TipoExamen tipoExamen){
           EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        int flag = 0;
        em.getTransaction().begin();
        try {
            em.persist(tipoExamen);
            em.getTransaction().commit();
            flag = 1;
        } catch (Exception ex) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return flag;
       }
    
    //METODO PARA INSERTAR NUEVO EXAMEN A UN PACIENTE EN TABLA EXAMEN
    
    public int Insertar_ExamenPaciente(Examen examen){
           EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        int flag = 0;
        em.getTransaction().begin();
        try {
            em.persist(examen);
            em.getTransaction().commit();
            flag = 1;
        } catch (Exception ex) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return flag;
       }

    public TipoExamen estetipo(int id){
    TipoExamen este = null;
    EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
    em.getTransaction().begin();
        try {
            este = em.find(TipoExamen.class, id);
        } catch (Exception e) {
            em.getTransaction().rollback();
        }finally{
        em.close();
        }
    return este;
    }

}
