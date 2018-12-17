/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.persistencia;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author roberto.abregoUSAM
 */
@Entity
@Table(name = "medicamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Medicamento.findAll", query = "SELECT m FROM Medicamento m")
    , @NamedQuery(name = "Medicamento.findByIdMedicamento", query = "SELECT m FROM Medicamento m WHERE m.idMedicamento = :idMedicamento")
    , @NamedQuery(name = "Medicamento.findByNombreMedicamento", query = "SELECT m FROM Medicamento m WHERE m.nombreMedicamento = :nombreMedicamento")
    , @NamedQuery(name = "Medicamento.findByViaDeAdministracion", query = "SELECT m FROM Medicamento m WHERE m.viaDeAdministracion = :viaDeAdministracion")
    , @NamedQuery(name = "Medicamento.findByCantidadContenidad", query = "SELECT m FROM Medicamento m WHERE m.cantidadContenidad = :cantidadContenidad")
    , @NamedQuery(name = "Medicamento.findByLaboratorio", query = "SELECT m FROM Medicamento m WHERE m.laboratorio = :laboratorio")
    , @NamedQuery(name = "Medicamento.findByFechaVencimiento", query = "SELECT m FROM Medicamento m WHERE m.fechaVencimiento = :fechaVencimiento")
    , @NamedQuery(name = "Medicamento.findByLote", query = "SELECT m FROM Medicamento m WHERE m.lote = :lote")
    , @NamedQuery(name = "Medicamento.findByCantidadDisponible", query = "SELECT m FROM Medicamento m WHERE m.cantidadDisponible = :cantidadDisponible")})
public class Medicamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_medicamento")
    private Integer idMedicamento;
    @Basic(optional = false)
    @Column(name = "nombre_medicamento")
    private String nombreMedicamento;
    @Basic(optional = false)
    @Column(name = "via_de_administracion")
    private String viaDeAdministracion;
    @Basic(optional = false)
    @Column(name = "cantidad_contenidad")
    private String cantidadContenidad;
    @Basic(optional = false)
    @Column(name = "laboratorio")
    private String laboratorio;
    @Basic(optional = false)
    @Column(name = "fecha_vencimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaVencimiento;
    @Basic(optional = false)
    @Column(name = "lote")
    private int lote;
    @Basic(optional = false)
    @Column(name = "cantidad_disponible")
    private int cantidadDisponible;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "medicamento")
    private Collection<ConsultaMedicamento> consultaMedicamentoCollection;

    public Medicamento() {
    }

    public Medicamento(Integer idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public Medicamento(Integer idMedicamento, String nombreMedicamento, String viaDeAdministracion, String cantidadContenidad, String laboratorio, Date fechaVencimiento, int lote, int cantidadDisponible) {
        this.idMedicamento = idMedicamento;
        this.nombreMedicamento = nombreMedicamento;
        this.viaDeAdministracion = viaDeAdministracion;
        this.cantidadContenidad = cantidadContenidad;
        this.laboratorio = laboratorio;
        this.fechaVencimiento = fechaVencimiento;
        this.lote = lote;
        this.cantidadDisponible = cantidadDisponible;
    }

    public Integer getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(Integer idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public String getViaDeAdministracion() {
        return viaDeAdministracion;
    }

    public void setViaDeAdministracion(String viaDeAdministracion) {
        this.viaDeAdministracion = viaDeAdministracion;
    }

    public String getCantidadContenidad() {
        return cantidadContenidad;
    }

    public void setCantidadContenidad(String cantidadContenidad) {
        this.cantidadContenidad = cantidadContenidad;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    @XmlTransient
    public Collection<ConsultaMedicamento> getConsultaMedicamentoCollection() {
        return consultaMedicamentoCollection;
    }

    public void setConsultaMedicamentoCollection(Collection<ConsultaMedicamento> consultaMedicamentoCollection) {
        this.consultaMedicamentoCollection = consultaMedicamentoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMedicamento != null ? idMedicamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medicamento)) {
            return false;
        }
        Medicamento other = (Medicamento) object;
        if ((this.idMedicamento == null && other.idMedicamento != null) || (this.idMedicamento != null && !this.idMedicamento.equals(other.idMedicamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sistema.persistencia.Medicamento[ idMedicamento=" + idMedicamento + " ]";
    }
    
}
