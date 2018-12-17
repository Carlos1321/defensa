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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "tipo_cita")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoCita.findAll", query = "SELECT t FROM TipoCita t")
    , @NamedQuery(name = "TipoCita.findByIdTipoCita", query = "SELECT t FROM TipoCita t WHERE t.idTipoCita = :idTipoCita")
    , @NamedQuery(name = "TipoCita.findByTipoCita", query = "SELECT t FROM TipoCita t WHERE t.tipoCita = :tipoCita")})
public class TipoCita implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_cita")
    private Integer idTipoCita;
    @Basic(optional = false)
    @Column(name = "tipo_cita")
    private String tipoCita;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoCita")
    private Collection<Cita> citaCollection;

    public TipoCita() {
    }

    public TipoCita(Integer idTipoCita) {
        this.idTipoCita = idTipoCita;
    }

    public TipoCita(Integer idTipoCita, String tipoCita) {
        this.idTipoCita = idTipoCita;
        this.tipoCita = tipoCita;
    }

    public Integer getIdTipoCita() {
        return idTipoCita;
    }

    public void setIdTipoCita(Integer idTipoCita) {
        this.idTipoCita = idTipoCita;
    }

    public String getTipoCita() {
        return tipoCita;
    }

    public void setTipoCita(String tipoCita) {
        this.tipoCita = tipoCita;
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
        hash += (idTipoCita != null ? idTipoCita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoCita)) {
            return false;
        }
        TipoCita other = (TipoCita) object;
        if ((this.idTipoCita == null && other.idTipoCita != null) || (this.idTipoCita != null && !this.idTipoCita.equals(other.idTipoCita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sistema.persistencia.TipoCita[ idTipoCita=" + idTipoCita + " ]";
    }
    
}
