/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.persistencia;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author roberto.abregoUSAM
 */
@Entity
@Table(name = "expediente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Expediente.findAll", query = "SELECT e FROM Expediente e")
    , @NamedQuery(name = "Expediente.findByCodigoExpediente", query = "SELECT e FROM Expediente e WHERE e.codigoExpediente = :codigoExpediente")})
public class Expediente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo_expediente")
    private String codigoExpediente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoExpediente")
    private Collection<Responsable> responsableCollection;
    @JoinColumn(name = "datos_personales", referencedColumnName = "id_datos_personales")
    @ManyToOne(optional = false,cascade = {CascadeType.PERSIST})
    private DatosPersonales datosPersonales;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoExpediente")
    private Collection<DatosMedicos> datosMedicosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoExpediente")
    private Collection<Cita> citaCollection;

    public Expediente() {
    }

    public Expediente(String codigoExpediente) {
        this.codigoExpediente = codigoExpediente;
    }

    public String getCodigoExpediente() {
        return codigoExpediente;
    }

    public void setCodigoExpediente(String codigoExpediente) {
        this.codigoExpediente = codigoExpediente;
    }

    @XmlTransient
    public Collection<Responsable> getResponsableCollection() {
        return responsableCollection;
    }

    public void setResponsableCollection(Collection<Responsable> responsableCollection) {
        this.responsableCollection = responsableCollection;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }

    public void setDatosPersonales(DatosPersonales datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

    @XmlTransient
    public Collection<DatosMedicos> getDatosMedicosCollection() {
        return datosMedicosCollection;
    }

    public void setDatosMedicosCollection(Collection<DatosMedicos> datosMedicosCollection) {
        this.datosMedicosCollection = datosMedicosCollection;
    }

    @XmlTransient
    public Collection<Cita> getCitaCollection() {
        return citaCollection;
    }

    public void setCitaCollection(Collection<Cita> citaCollection) {
        this.citaCollection = citaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoExpediente != null ? codigoExpediente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Expediente)) {
            return false;
        }
        Expediente other = (Expediente) object;
        if ((this.codigoExpediente == null && other.codigoExpediente != null) || (this.codigoExpediente != null && !this.codigoExpediente.equals(other.codigoExpediente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sistema.persistencia.Expediente[ codigoExpediente=" + codigoExpediente + " ]";
    }
    
}
