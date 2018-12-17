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
@Table(name = "tipo_examen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoExamen.findAll", query = "SELECT t FROM TipoExamen t")
    , @NamedQuery(name = "TipoExamen.findByIdTipoExamen", query = "SELECT t FROM TipoExamen t WHERE t.idTipoExamen = :idTipoExamen")
    , @NamedQuery(name = "TipoExamen.findByNombreExamen", query = "SELECT t FROM TipoExamen t WHERE t.nombreExamen = :nombreExamen")
    , @NamedQuery(name = "TipoExamen.findByTipoExamen", query = "SELECT t FROM TipoExamen t WHERE t.tipoExamen = :tipoExamen")})
public class TipoExamen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_examen")
    private Integer idTipoExamen;
    @Basic(optional = false)
    @Column(name = "nombre_examen")
    private String nombreExamen;
    @Basic(optional = false)
    @Column(name = "tipo_examen")
    private String tipoExamen;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "examen")
    private Collection<Examen> examenCollection;

    public TipoExamen() {
    }

    public TipoExamen(Integer idTipoExamen) {
        this.idTipoExamen = idTipoExamen;
    }

    public TipoExamen(Integer idTipoExamen, String nombreExamen, String tipoExamen) {
        this.idTipoExamen = idTipoExamen;
        this.nombreExamen = nombreExamen;
        this.tipoExamen = tipoExamen;
    }

    public Integer getIdTipoExamen() {
        return idTipoExamen;
    }

    public void setIdTipoExamen(Integer idTipoExamen) {
        this.idTipoExamen = idTipoExamen;
    }

    public String getNombreExamen() {
        return nombreExamen;
    }

    public void setNombreExamen(String nombreExamen) {
        this.nombreExamen = nombreExamen;
    }

    public String getTipoExamen() {
        return tipoExamen;
    }

    public void setTipoExamen(String tipoExamen) {
        this.tipoExamen = tipoExamen;
    }

    @XmlTransient
    public Collection<Examen> getExamenCollection() {
        return examenCollection;
    }

    public void setExamenCollection(Collection<Examen> examenCollection) {
        this.examenCollection = examenCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoExamen != null ? idTipoExamen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoExamen)) {
            return false;
        }
        TipoExamen other = (TipoExamen) object;
        if ((this.idTipoExamen == null && other.idTipoExamen != null) || (this.idTipoExamen != null && !this.idTipoExamen.equals(other.idTipoExamen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sistema.persistencia.TipoExamen[ idTipoExamen=" + idTipoExamen + " ]";
    }
    
}
