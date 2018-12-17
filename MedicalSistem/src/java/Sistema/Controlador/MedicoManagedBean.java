/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.Controlador;

import Sistema.mantenimiento.FuncionExpediente;
import Sistema.persistencia.Expediente;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author roberto.abregoUSAM
 */
@ManagedBean(name="medico")
@RequestScoped
public class MedicoManagedBean {
    
        @ManagedProperty("FuncionExpediente")
        private FuncionExpediente fe;
        private String codigo;
        private Expediente expediente;

    public void setFe(FuncionExpediente fe) {
        this.fe = fe;
    }

    public FuncionExpediente getFe() {
        return fe;
    }

    
        
        
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
        
    @PostConstruct
    public void init(){
        
    }
        

    /**
     * Creates a new instance of MedicoManagedBean
     */
    public MedicoManagedBean() {
    }
    
}
