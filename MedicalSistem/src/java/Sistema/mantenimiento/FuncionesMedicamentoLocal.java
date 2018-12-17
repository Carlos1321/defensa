/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.mantenimiento.jpa.JpaUtil;
import Sistema.persistencia.Medicamento;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;

/**
 *
 * @author roberto.abregoUSAM
 */
@ManagedBean(name = "FuncionMedicamento")
@ApplicationScoped
public class FuncionesMedicamentoLocal extends AbstracFacade<Medicamento> implements FuncionMedicamento {
    
    private final EntityManager em = JpaUtil.getEntityManager();

    public FuncionesMedicamentoLocal() {
        super(Medicamento.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return em;
    }
    
}
