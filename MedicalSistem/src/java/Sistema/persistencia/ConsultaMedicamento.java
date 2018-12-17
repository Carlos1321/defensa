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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "consulta_medicamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConsultaMedicamento.findAll", query = "SELECT c FROM ConsultaMedicamento c")
    , @NamedQuery(name = "ConsultaMedicamento.findByIdConsultaMedicamento", query = "SELECT c FROM ConsultaMedicamento c WHERE c.idConsultaMedicamento = :idConsultaMedicamento")})
public class ConsultaMedicamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_consulta_medicamento")
    private Integer idConsultaMedicamento;
    @JoinColumn(name = "consulta", referencedColumnName = "id_consulta")
    @ManyToOne(optional = false)
    private Consulta consulta;
    @JoinColumn(name = "medicamento", referencedColumnName = "id_medicamento")
    @ManyToOne(optional = false)
    private Medicamento medicamento;

    public ConsultaMedicamento() {
    }

    public ConsultaMedicamento(Integer idConsultaMedicamento) {
        this.idConsultaMedicamento = idConsultaMedicamento;
    }

    public Integer getIdConsultaMedicamento() {
        return idConsultaMedicamento;
    }

    public void setIdConsultaMedicamento(Integer idConsultaMedicamento) {
        this.idConsultaMedicamento = idConsultaMedicamento;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConsultaMedicamento != null ? idConsultaMedicamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConsultaMedicamento)) {
            return false;
        }
        ConsultaMedicamento other = (ConsultaMedicamento) object;
        if ((this.idConsultaMedicamento == null && other.idConsultaMedicamento != null) || (this.idConsultaMedicamento != null && !this.idConsultaMedicamento.equals(other.idConsultaMedicamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sistema.persistencia.ConsultaMedicamento[ idConsultaMedicamento=" + idConsultaMedicamento + " ]";
    }
    
}
