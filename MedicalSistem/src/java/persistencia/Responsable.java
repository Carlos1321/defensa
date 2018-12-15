/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

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
 * @author angel.lopezusam
 */
@Entity
@Table(name = "responsable")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Responsable.findAll", query = "SELECT r FROM Responsable r")
    , @NamedQuery(name = "Responsable.findByIdResponsable", query = "SELECT r FROM Responsable r WHERE r.idResponsable = :idResponsable")
    , @NamedQuery(name = "Responsable.findByPrimerNombre", query = "SELECT r FROM Responsable r WHERE r.primerNombre = :primerNombre")
    , @NamedQuery(name = "Responsable.findBySegundoNombre", query = "SELECT r FROM Responsable r WHERE r.segundoNombre = :segundoNombre")
    , @NamedQuery(name = "Responsable.findByTercerNombre", query = "SELECT r FROM Responsable r WHERE r.tercerNombre = :tercerNombre")
    , @NamedQuery(name = "Responsable.findByPrimerApellido", query = "SELECT r FROM Responsable r WHERE r.primerApellido = :primerApellido")
    , @NamedQuery(name = "Responsable.findBySegundoApellido", query = "SELECT r FROM Responsable r WHERE r.segundoApellido = :segundoApellido")
    , @NamedQuery(name = "Responsable.findByTercerApellido", query = "SELECT r FROM Responsable r WHERE r.tercerApellido = :tercerApellido")
    , @NamedQuery(name = "Responsable.findByEdad", query = "SELECT r FROM Responsable r WHERE r.edad = :edad")
    , @NamedQuery(name = "Responsable.findBySexo", query = "SELECT r FROM Responsable r WHERE r.sexo = :sexo")
    , @NamedQuery(name = "Responsable.findByPais", query = "SELECT r FROM Responsable r WHERE r.pais = :pais")
    , @NamedQuery(name = "Responsable.findByDui", query = "SELECT r FROM Responsable r WHERE r.dui = :dui")
    , @NamedQuery(name = "Responsable.findByNit", query = "SELECT r FROM Responsable r WHERE r.nit = :nit")
    , @NamedQuery(name = "Responsable.findByPasaporte", query = "SELECT r FROM Responsable r WHERE r.pasaporte = :pasaporte")
    , @NamedQuery(name = "Responsable.findByParentesco", query = "SELECT r FROM Responsable r WHERE r.parentesco = :parentesco")})
public class Responsable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_responsable")
    private Integer idResponsable;
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
    @Column(name = "parentesco")
    private String parentesco;
    @JoinColumn(name = "codigo_expediente", referencedColumnName = "codigo_expediente")
    @ManyToOne(optional = false)
    private Expediente codigoExpediente;

    public Responsable() {
    }

    public Responsable(Integer idResponsable) {
        this.idResponsable = idResponsable;
    }

    public Responsable(Integer idResponsable, String primerNombre, String segundoNombre, String primerApellido, int edad, String sexo, String pais) {
        this.idResponsable = idResponsable;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.edad = edad;
        this.sexo = sexo;
        this.pais = pais;
    }

    public Integer getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(Integer idResponsable) {
        this.idResponsable = idResponsable;
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

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
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
        hash += (idResponsable != null ? idResponsable.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Responsable)) {
            return false;
        }
        Responsable other = (Responsable) object;
        if ((this.idResponsable == null && other.idResponsable != null) || (this.idResponsable != null && !this.idResponsable.equals(other.idResponsable))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Responsable[ idResponsable=" + idResponsable + " ]";
    }
    
}
