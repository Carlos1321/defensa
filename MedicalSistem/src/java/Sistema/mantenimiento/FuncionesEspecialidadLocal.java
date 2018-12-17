/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.mantenimiento.jpa.JpaUtil;
import Sistema.persistencia.Especialidad;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;

/**
 *
 * @author roberto.abregoUSAM
 */
@ManagedBean(name = "FuncionEspecialidad")
@ApplicationScoped
public class FuncionesEspecialidadLocal extends AbstracFacade<Especialidad> implements FuncionEspecialidad {
    
    private final EntityManager em = JpaUtil.getEntityManager();

    public FuncionesEspecialidadLocal() {
        super(Especialidad.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return em;
    }
    
}
