/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.persistencia;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author roberto.abregoUSAM
 */
@Entity
@Table(name = "consulta_examen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConsultaExamen.findAll", query = "SELECT c FROM ConsultaExamen c")
    , @NamedQuery(name = "ConsultaExamen.findByIdConsultaExamen", query = "SELECT c FROM ConsultaExamen c WHERE c.idConsultaExamen = :idConsultaExamen")})
public class ConsultaExamen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_consulta_examen")
    private Integer idConsultaExamen;
    @JoinColumn(name = "consulta", referencedColumnName = "id_consulta")
    @ManyToOne(optional = false)
    private Consulta consulta;
    @JoinColumn(name = "examen", referencedColumnName = "id_examen")
    @ManyToOne(optional = false)
    private Examen examen;

    public ConsultaExamen() {
    }

    public ConsultaExamen(Integer idConsultaExamen) {
        this.idConsultaExamen = idConsultaExamen;
    }

    public Integer getIdConsultaExamen() {
        return idConsultaExamen;
    }

    public void setIdConsultaExamen(Integer idConsultaExamen) {
        this.idConsultaExamen = idConsultaExamen;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConsultaExamen != null ? idConsultaExamen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConsultaExamen)) {
            return false;
        }
        ConsultaExamen other = (ConsultaExamen) object;
        if ((this.idConsultaExamen == null && other.idConsultaExamen != null) || (this.idConsultaExamen != null && !this.idConsultaExamen.equals(other.idConsultaExamen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sistema.persistencia.ConsultaExamen[ idConsultaExamen=" + idConsultaExamen + " ]";
    }
    
}
