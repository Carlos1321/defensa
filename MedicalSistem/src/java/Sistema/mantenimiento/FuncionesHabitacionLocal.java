/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.mantenimiento.jpa.JpaUtil;
import Sistema.persistencia.Habitacion;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;

/**
 *
 * @author roberto.abregoUSAM
 */
@ManagedBean(name = "FuncionHabitacion")
@ApplicationScoped
public class FuncionesHabitacionLocal extends AbstracFacade<Habitacion> implements FuncionHabitacion {
    
    private final EntityManager em = JpaUtil.getEntityManager();

    public FuncionesHabitacionLocal() {
        super(Habitacion.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return em;
    }
    
}
