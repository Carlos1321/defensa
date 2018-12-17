/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.mantenimiento.jpa.JpaUtil;
import Sistema.persistencia.Estado;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;

/**
 *
 * @author roberto.abregoUSAM
 */
@ManagedBean(name = "FuncionEstado")
@ApplicationScoped
public class FuncionesEstadoLocal extends AbstracFacade<Estado> implements FuncionEstado {
    
    private final EntityManager em = JpaUtil.getEntityManager();

    public FuncionesEstadoLocal() {
        super(Estado.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return em;
    }
    
}
