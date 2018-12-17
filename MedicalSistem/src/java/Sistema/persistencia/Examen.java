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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "examen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Examen.findAll", query = "SELECT e FROM Examen e")
    , @NamedQuery(name = "Examen.findByIdExamen", query = "SELECT e FROM Examen e WHERE e.idExamen = :idExamen")
    , @NamedQuery(name = "Examen.findByFechaExamen", query = "SELECT e FROM Examen e WHERE e.fechaExamen = :fechaExamen")
    , @NamedQuery(name = "Examen.findByResultadoExamen", query = "SELECT e FROM Examen e WHERE e.resultadoExamen = :resultadoExamen")})
public class Examen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_examen")
    private Integer idExamen;
    @Basic(optional = false)
    @Column(name = "fecha_examen")
    @Temporal(TemporalType.DATE)
    private Date fechaExamen;
    @Basic(optional = false)
    @Column(name = "resultado_examen")
    private String resultadoExamen;
    @JoinColumn(name = "examen", referencedColumnName = "id_tipo_examen")
    @ManyToOne(optional = false)
    private TipoExamen examen;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "examen")
    private Collection<ConsultaExamen> consultaExamenCollection;

    public Examen() {
    }

    public Examen(Integer idExamen) {
        this.idExamen = idExamen;
    }

    public Examen(Integer idExamen, Date fechaExamen, String resultadoExamen) {
        this.idExamen = idExamen;
        this.fechaExamen = fechaExamen;
        this.resultadoExamen = resultadoExamen;
    }

    public Integer getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(Integer idExamen) {
        this.idExamen = idExamen;
    }

    public Date getFechaExamen() {
        return fechaExamen;
    }

    public void setFechaExamen(Date fechaExamen) {
        this.fechaExamen = fechaExamen;
    }

    public String getResultadoExamen() {
        return resultadoExamen;
    }

    public void setResultadoExamen(String resultadoExamen) {
        this.resultadoExamen = resultadoExamen;
    }

    public TipoExamen getExamen() {
        return examen;
    }

    public void setExamen(TipoExamen examen) {
        this.examen = examen;
    }

    @XmlTransient
    public Collection<ConsultaExamen> getConsultaExamenCollection() {
        return consultaExamenCollection;
    }

    public void setConsultaExamenCollection(Collection<ConsultaExamen> consultaExamenCollection) {
        this.consultaExamenCollection = consultaExamenCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idExamen != null ? idExamen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Examen)) {
            return false;
        }
        Examen other = (Examen) object;
        if ((this.idExamen == null && other.idExamen != null) || (this.idExamen != null && !this.idExamen.equals(other.idExamen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sistema.persistencia.Examen[ idExamen=" + idExamen + " ]";
    }
    
}
