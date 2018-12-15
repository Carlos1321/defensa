/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

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
 * @author angel.lopezusam
 */
@Entity
@Table(name = "datos_personales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatosPersonales.findAll", query = "SELECT d FROM DatosPersonales d")
    , @NamedQuery(name = "DatosPersonales.findByIdDatosPersonales", query = "SELECT d FROM DatosPersonales d WHERE d.idDatosPersonales = :idDatosPersonales")
    , @NamedQuery(name = "DatosPersonales.findByPrimerNombre", query = "SELECT d FROM DatosPersonales d WHERE d.primerNombre = :primerNombre")
    , @NamedQuery(name = "DatosPersonales.findBySegundoNombre", query = "SELECT d FROM DatosPersonales d WHERE d.segundoNombre = :segundoNombre")
    , @NamedQuery(name = "DatosPersonales.findByTercerNombre", query = "SELECT d FROM DatosPersonales d WHERE d.tercerNombre = :tercerNombre")
    , @NamedQuery(name = "DatosPersonales.findByPrimerApellido", query = "SELECT d FROM DatosPersonales d WHERE d.primerApellido = :primerApellido")
    , @NamedQuery(name = "DatosPersonales.findBySegundoApellido", query = "SELECT d FROM DatosPersonales d WHERE d.segundoApellido = :segundoApellido")
    , @NamedQuery(name = "DatosPersonales.findByTercerApellido", query = "SELECT d FROM DatosPersonales d WHERE d.tercerApellido = :tercerApellido")
    , @NamedQuery(name = "DatosPersonales.findBySexo", query = "SELECT d FROM DatosPersonales d WHERE d.sexo = :sexo")
    , @NamedQuery(name = "DatosPersonales.findByDui", query = "SELECT d FROM DatosPersonales d WHERE d.dui = :dui")
    , @NamedQuery(name = "DatosPersonales.findByNit", query = "SELECT d FROM DatosPersonales d WHERE d.nit = :nit")
    , @NamedQuery(name = "DatosPersonales.findByPasaporte", query = "SELECT d FROM DatosPersonales d WHERE d.pasaporte = :pasaporte")
    , @NamedQuery(name = "DatosPersonales.findByFechaDeNacimiento", query = "SELECT d FROM DatosPersonales d WHERE d.fechaDeNacimiento = :fechaDeNacimiento")})
public class DatosPersonales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_datos_personales")
    private Integer idDatosPersonales;
    @Basic(optional = false)
    @Column(name = "primer_nombre")
    private String primerNombre;
    @Basic(optional = false)
    @Column(name = "segundo_nombre")
    private String segundoNombre;
    @Column(name = "tercer_nombre")
    private String tercerNombre;
    @Basic(optional = false)
    @Column(name = "primer_apellido")
    private String primerApellido;
    @Column(name = "segundo_apellido")
    private String segundoApellido;
    @Column(name = "tercer_apellido")
    private String tercerApellido;
    @Basic(optional = false)
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "dui")
    private String dui;
    @Column(name = "nit")
    private String nit;
    @Column(name = "pasaporte")
    private String pasaporte;
    @Basic(optional = false)
    @Column(name = "fecha_de_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaDeNacimiento;
    @JoinColumn(name = "pais", referencedColumnName = "id_pais")
    @ManyToOne(optional = false)
    private Pais pais;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datosPersonales")
    private Collection<Expediente> expedienteCollection;

    public DatosPersonales() {
    }

    public DatosPersonales(Integer idDatosPersonales) {
        this.idDatosPersonales = idDatosPersonales;
    }

    public DatosPersonales(Integer idDatosPersonales, String primerNombre, String segundoNombre, String primerApellido, String sexo, Date fechaDeNacimiento) {
        this.idDatosPersonales = idDatosPersonales;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.sexo = sexo;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Integer getIdDatosPersonales() {
        return idDatosPersonales;
    }

    public void setIdDatosPersonales(Integer idDatosPersonales) {
        this.idDatosPersonales = idDatosPersonales;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getTercerNombre() {
        return tercerNombre;
    }

    public void setTercerNombre(String tercerNombre) {
        this.tercerNombre = tercerNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getTercerApellido() {
        return tercerApellido;
    }

    public void setTercerApellido(String tercerApellido) {
        this.tercerApellido = tercerApellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @XmlTransient
    public Collection<Expediente> getExpedienteCollection() {
        return expedienteCollection;
    }

    public void setExpedienteCollection(Collection<Expediente> expedienteCollection) {
        this.expedienteCollection = expedienteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDatosPersonales != null ? idDatosPersonales.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatosPersonales)) {
            return false;
        }
        DatosPersonales other = (DatosPersonales) object;
        if ((this.idDatosPersonales == null && other.idDatosPersonales != null) || (this.idDatosPersonales != null && !this.idDatosPersonales.equals(other.idDatosPersonales))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.DatosPersonales[ idDatosPersonales=" + idDatosPersonales + " ]";
    }
    
}
