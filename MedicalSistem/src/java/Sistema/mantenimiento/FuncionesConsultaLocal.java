/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.mantenimiento.jpa.JpaUtil;
import Sistema.persistencia.Consulta;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;

/**
 *
 * @author roberto.abregoUSAM
 */
@ManagedBean(name = "FuncionConsulta")
@ApplicationScoped
public class FuncionesConsultaLocal extends AbstracFacade<Consulta> implements FuncionConsulta{
    
    private final EntityManager em = JpaUtil.getEntityManager();

    public FuncionesConsultaLocal() {
        super(Consulta.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return em;
    }
    
}
