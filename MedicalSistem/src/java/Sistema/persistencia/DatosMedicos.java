/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.persistencia;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author roberto.abregoUSAM
 */
@Entity
@Table(name = "datos_medicos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatosMedicos.findAll", query = "SELECT d FROM DatosMedicos d")
    , @NamedQuery(name = "DatosMedicos.findByIdDatosMedicos", query = "SELECT d FROM DatosMedicos d WHERE d.idDatosMedicos = :idDatosMedicos")
    , @NamedQuery(name = "DatosMedicos.findByPeso", query = "SELECT d FROM DatosMedicos d WHERE d.peso = :peso")
    , @NamedQuery(name = "DatosMedicos.findByAltura", query = "SELECT d FROM DatosMedicos d WHERE d.altura = :altura")
    , @NamedQuery(name = "DatosMedicos.findByImc", query = "SELECT d FROM DatosMedicos d WHERE d.imc = :imc")
    , @NamedQuery(name = "DatosMedicos.findByTipoSangre", query = "SELECT d FROM DatosMedicos d WHERE d.tipoSangre = :tipoSangre")})
public class DatosMedicos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_datos_medicos")
    private Integer idDatosMedicos;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "peso")
    private BigDecimal peso;
    @Basic(optional = false)
    @Column(name = "altura")
    private BigDecimal altura;
    @Column(name = "IMC")
    private BigDecimal imc;
    @Basic(optional = false)
    @Column(name = "tipo_sangre")
    private String tipoSangre;
    @Lob
    @Column(name = "alergias")
    private String alergias;
    @JoinColumn(name = "codigo_expediente", referencedColumnName = "codigo_expediente")
    @ManyToOne(optional = false)
    private Expediente codigoExpediente;

    public DatosMedicos() {
    }

    public DatosMedicos(Integer idDatosMedicos) {
        this.idDatosMedicos = idDatosMedicos;
    }

    public DatosMedicos(Integer idDatosMedicos, BigDecimal peso, BigDecimal altura, String tipoSangre) {
        this.idDatosMedicos = idDatosMedicos;
        this.peso = peso;
        this.altura = altura;
        this.tipoSangre = tipoSangre;
    }

    public Integer getIdDatosMedicos() {
        return idDatosMedicos;
    }

    public void setIdDatosMedicos(Integer idDatosMedicos) {
        this.idDatosMedicos = idDatosMedicos;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }

    public BigDecimal getImc() {
        return imc;
    }

    public void setImc(BigDecimal imc) {
        this.imc = imc;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public Expediente getCodigoExpediente() {
        return codigoExpediente;
    }

    public void setCodigoExpediente(Expediente codigoExpediente) {
        this.codigoExpediente = codigoExpediente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDatosMedicos != null ? idDatosMedicos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatosMedicos)) {
            return false;
        }
        DatosMedicos other = (DatosMedicos) object;
        if ((this.idDatosMedicos == null && other.idDatosMedicos != null) || (this.idDatosMedicos != null && !this.idDatosMedicos.equals(other.idDatosMedicos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sistema.persistencia.DatosMedicos[ idDatosMedicos=" + idDatosMedicos + " ]";
    }
    
}
