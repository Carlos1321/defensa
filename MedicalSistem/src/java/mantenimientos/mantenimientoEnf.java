/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimientos;

/**
 *
 * @author alejandra.centeno
 */
import java.util.Iterator;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import persistencia.PerfilPersonal;

public class mantenimientoEnf {
    mantenimientoEnf mf = new mantenimientoEnf();
   
    
    
public PerfilPersonal consultarTodosDatos() {
    List<PerfilPersonal> listaPersonal = null;
    
    EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
    em.getTransaction().begin();
    
    PerfilPersonal p = null;
    
    try{
        Query query = em.createQuery("SELECT p FROM Personal p where idpersonal=?");
        em.getTransaction().commit();
        query.setParameter(1, "p_nombre");
        query.setParameter(2, "s_nombre");
        query.setParameter(3, "t_nombre");
        query.setParameter(4, "p_apellido");
        query.setParameter(5, "s_apellido");
        query.setParameter(6, "t_apellido");
        query.setParameter(7, "sexo");
        query.setParameter(8, "pais");
        query.setParameter(9, "dui");
        query.setParameter(10,"nit");
        query.setParameter(11,"pasaporte");
        query.setParameter(12,"direccion");
        query.setParameter(13,"telefono");
        query.setParameter(14,"celular");
        query.setParameter(15,"fecha_contrato");
        query.setParameter(16,"email");
        query.setParameter(17,"rol");
        query.setParameter(18,"Especialidad");
        
        List<PerfilPersonal> resultados=query.getResultList();
        for(PerfilPersonal resultado : resultados){
            p = resultado;
        }
        
    }catch(Exception e){
              em.getTransaction().rollback();
              
          }finally{
              em.clear();
              em.close();
          }
    return p;
    }
    
     public boolean edit(PerfilPersonal personal) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        try {
            em.getTransaction().begin();
            personal = em.merge(personal);
            em.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            System.out.println("Error en \n\n" + ex);
            return false;
        } finally {
            em.clear();
            em.close();

        }
    }
     
     public int actualizarEnfermeria (PerfilPersonal personal){
          EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        int flag = 0;
        em.getTransaction().begin();
        
        try {
            em.merge(personal);
            em.getTransaction().commit();
            flag = 1;
        }catch(Exception e){
            e.printStackTrace();
            em.getTransaction().rollback();
            flag = 0;
        }finally{
            em.close();
        }
        return flag;
     }
    
}
