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
    , @NamedQuery(name = "DatosPersonales.findByEdad", query = "SELECT d FROM DatosPersonales d WHERE d.edad = :edad")
    , @NamedQuery(name = "DatosPersonales.findBySexo", query = "SELECT d FROM DatosPersonales d WHERE d.sexo = :sexo")
    , @NamedQuery(name = "DatosPersonales.findByPais", query = "SELECT d FROM DatosPersonales d WHERE d.pais = :pais")
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
    @Column(name = "edad")
    private int edad;
    @Basic(optional = false)
    @Column(name = "sexo")
    private String sexo;
    @Basic(optional = false)
    @Column(name = "pais")
    private String pais;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datosPersonales")
    private Collection<Expediente> expedienteCollection;

    public DatosPersonales() {
    }

    public DatosPersonales(Integer idDatosPersonales) {
        this.idDatosPersonales = idDatosPersonales;
    }

    public DatosPersonales(Integer idDatosPersonales, String primerNombre, String segundoNombre, String primerApellido, int edad, String sexo, String pais, Date fechaDeNacimiento) {
        this.idDatosPersonales = idDatosPersonales;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.edad = edad;
        this.sexo = sexo;
        this.pais = pais;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
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
        return "Sistema.persistencia.DatosPersonales[ idDatosPersonales=" + idDatosPersonales + " ]";
    }
    
}
