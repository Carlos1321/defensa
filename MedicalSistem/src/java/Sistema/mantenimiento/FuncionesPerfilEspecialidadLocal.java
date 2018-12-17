/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.mantenimiento.jpa.JpaUtil;
import Sistema.persistencia.PerfilEspecialidad;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;

/**
 *
 * @author roberto.abregoUSAM
 */
@ManagedBean(name = "FuncionPerfilEspecialidad")
@ApplicationScoped
public class FuncionesPerfilEspecialidadLocal extends AbstracFacade<PerfilEspecialidad> implements FuncionPerfilEspecialidad {
    
    private final EntityManager em = JpaUtil.getEntityManager();

    public FuncionesPerfilEspecialidadLocal() {
        super(PerfilEspecialidad.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return em;
    }
    
}
