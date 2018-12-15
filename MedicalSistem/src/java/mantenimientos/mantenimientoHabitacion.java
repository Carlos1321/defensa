package mantenimientos;

import java.util.List;
import persistencia.Habitacion;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author alejandra.centeno
 */
public class mantenimientoHabitacion {
    
    public List<Habitacion> Mostrar_habitaciones(){
        EntityManager em = /*Persistence.createEntityManagerFactory("loginPU").createEntityManager();/*/JpaUtil.getEntityManagerFactory().createEntityManager();
        List<Habitacion> listadodehabitacion = null;
        em.getTransaction().begin();
        try{
            Query query = em.createQuery("SELECT h FROM Habitacion h");
            em.getTransaction().commit();
            listadodehabitacion = query.getResultList();  
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return listadodehabitacion;
    }
    
    public static void main(String[] args) {
        mantenimientoHabitacion b = new mantenimientoHabitacion();
        System.out.println(b.Mostrar_habitaciones());
    }
}
