/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.mantenimiento.jpa.JpaUtil;
import Sistema.persistencia.TipoHabitacion;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;

/**
 *
 * @author roberto.abregoUSAM
 */
@ManagedBean(name = "FuncionTipoHabitacion")
@ApplicationScoped
public class FuncionesTipoHabitacionLocal extends AbstracFacade<TipoHabitacion> implements FuncionTipoHabitacion {
    
    private final EntityManager em = JpaUtil.getEntityManager();

    public FuncionesTipoHabitacionLocal() {
        super(TipoHabitacion.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return em;
    }
    
}
