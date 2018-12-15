/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author angel.lopezusam
 */
@Entity
@Table(name = "consulta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Consulta.findAll", query = "SELECT c FROM Consulta c")
    , @NamedQuery(name = "Consulta.findByIdConsulta", query = "SELECT c FROM Consulta c WHERE c.idConsulta = :idConsulta")})
public class Consulta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_consulta")
    private Integer idConsulta;
    @Basic(optional = false)
    @Lob
    @Column(name = "diagnostico")
    private String diagnostico;
    @Basic(optional = false)
    @Lob
    @Column(name = "tratamiento")
    private String tratamiento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "consulta")
    private Collection<ConsultaMedicamento> consultaMedicamentoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "consulta")
    private Collection<ConsultaExamen> consultaExamenCollection;
    @JoinColumn(name = "cita", referencedColumnName = "id_cita")
    @ManyToOne(optional = false)
    private Cita cita;
    @JoinColumn(name = "internamiento", referencedColumnName = "id_internamiento")
    @ManyToOne
    private Internamiento internamiento;

    public Consulta() {
    }

    public Consulta(Integer idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Consulta(Integer idConsulta, String diagnostico, String tratamiento) {
        this.idConsulta = idConsulta;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }

    public Integer getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Integer idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    @XmlTransient
    public Collection<ConsultaMedicamento> getConsultaMedicamentoCollection() {
        return consultaMedicamentoCollection;
    }

    public void setConsultaMedicamentoCollection(Collection<ConsultaMedicamento> consultaMedicamentoCollection) {
        this.consultaMedicamentoCollection = consultaMedicamentoCollection;
    }

    @XmlTransient
    public Collection<ConsultaExamen> getConsultaExamenCollection() {
        return consultaExamenCollection;
    }

    public void setConsultaExamenCollection(Collection<ConsultaExamen> consultaExamenCollection) {
        this.consultaExamenCollection = consultaExamenCollection;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public Internamiento getInternamiento() {
        return internamiento;
    }

    public void setInternamiento(Internamiento internamiento) {
        this.internamiento = internamiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConsulta != null ? idConsulta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consulta)) {
            return false;
        }
        Consulta other = (Consulta) object;
        if ((this.idConsulta == null && other.idConsulta != null) || (this.idConsulta != null && !this.idConsulta.equals(other.idConsulta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Consulta[ idConsulta=" + idConsulta + " ]";
    }
    
}
