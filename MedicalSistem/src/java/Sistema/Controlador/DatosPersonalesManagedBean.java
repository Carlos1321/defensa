/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.Controlador;

import Sistema.mantenimiento.FuncionDatosPersonales;
import Sistema.mantenimiento.FuncionExpediente;
import Sistema.mantenimiento.FuncionPais;
import Sistema.mantenimiento.FuncionesDatosPersonalesLocal;
import Sistema.mantenimiento.FuncionesExpedienteLocal;
import Sistema.mantenimiento.FuncionesPaisLocal;
import Sistema.persistencia.DatosPersonales;
import Sistema.persistencia.Expediente;
import Sistema.persistencia.Pais;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author roberto.abregoUSAM
 */
@ManagedBean(name = "DatosPersonales")
@SessionScoped
public class DatosPersonalesManagedBean {

//    private FuncionDatosPersonales funcionDatosPersonales;
    private FuncionExpediente expediente;
    private FuncionPais funcionPais;

//    public void setFuncionDatosPersonales(FuncionDatosPersonales funcionDatosPersonales) {
//        this.funcionDatosPersonales = funcionDatosPersonales;
//    }
    private List<Pais> pais;

    public List<Pais> getPais() {
        return pais;
    }

    public void setPais(List<Pais> pais) {
        this.pais = pais;
    }

    private DatosPersonales datosPersonales;

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }

    public void setDatosPersonales(DatosPersonales datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

    @PostConstruct
    public void init() {
        this.expediente = new FuncionesExpedienteLocal();
        this.funcionPais = new FuncionesPaisLocal();
        this.datosPersonales = new DatosPersonales();
        this.pais = this.funcionPais.Consultar();

    }

    public void guardar() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Expediente e = new Expediente();
        String s1 = "";
        String s2 = "";
        int i = 1;
        List<Expediente> es = expediente.Consultar();
        String[] s = sdf.format(this.datosPersonales.getFechaDeNacimiento()).split("-");
        for (Expediente expediente : es) {
            i++;
        }
        for (String sout : s) {
            s1 = s1 + sout;
        }
        s2 = i + "-" + s1.substring(2, 4) + "-" + this.datosPersonales.getPrimerNombre().substring(0, 1).toUpperCase() + this.datosPersonales.getPrimerApellido().substring(0, 1).toUpperCase();

        e.setCodigoExpediente(s2);
        e.setDatosPersonales(datosPersonales);

        if (this.expediente.Crear(e)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Exito", " Se a creado el expediente exitosamento."));
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "", " El codigo de expediente es "+s2));
            this.datosPersonales=new DatosPersonales();
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "A ocurrido un error al crear el expediente."));
        }

    }

   
}
