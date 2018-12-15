/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author angel.lopezusam
 */
@Entity
@Table(name = "prueba_vista")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PruebaVista.findAll", query = "SELECT p FROM PruebaVista p")
    , @NamedQuery(name = "PruebaVista.findByUsuario", query = "SELECT p FROM PruebaVista p WHERE p.usuario = :usuario")
    , @NamedQuery(name = "PruebaVista.findByPass", query = "SELECT p FROM PruebaVista p WHERE p.pass = :pass")
    , @NamedQuery(name = "PruebaVista.findByPrimerNombre", query = "SELECT p FROM PruebaVista p WHERE p.primerNombre = :primerNombre")
    , @NamedQuery(name = "PruebaVista.findBySegundoNombre", query = "SELECT p FROM PruebaVista p WHERE p.segundoNombre = :segundoNombre")
    , @NamedQuery(name = "PruebaVista.findByTercerNombre", query = "SELECT p FROM PruebaVista p WHERE p.tercerNombre = :tercerNombre")
    , @NamedQuery(name = "PruebaVista.findByPrimerApellido", query = "SELECT p FROM PruebaVista p WHERE p.primerApellido = :primerApellido")
    , @NamedQuery(name = "PruebaVista.findBySegundoApellido", query = "SELECT p FROM PruebaVista p WHERE p.segundoApellido = :segundoApellido")
    , @NamedQuery(name = "PruebaVista.findByTercerApellido", query = "SELECT p FROM PruebaVista p WHERE p.tercerApellido = :tercerApellido")
    , @NamedQuery(name = "PruebaVista.findByEdad", query = "SELECT p FROM PruebaVista p WHERE p.edad = :edad")
    , @NamedQuery(name = "PruebaVista.findBySexo", query = "SELECT p FROM PruebaVista p WHERE p.sexo = :sexo")
    , @NamedQuery(name = "PruebaVista.findByPais", query = "SELECT p FROM PruebaVista p WHERE p.pais = :pais")
    , @NamedQuery(name = "PruebaVista.findByDui", query = "SELECT p FROM PruebaVista p WHERE p.dui = :dui")
    , @NamedQuery(name = "PruebaVista.findByNit", query = "SELECT p FROM PruebaVista p WHERE p.nit = :nit")
    , @NamedQuery(name = "PruebaVista.findByPasaporte", query = "SELECT p FROM PruebaVista p WHERE p.pasaporte = :pasaporte")
    , @NamedQuery(name = "PruebaVista.findByDireccion", query = "SELECT p FROM PruebaVista p WHERE p.direccion = :direccion")
    , @NamedQuery(name = "PruebaVista.findByTelefono", query = "SELECT p FROM PruebaVista p WHERE p.telefono = :telefono")
    , @NamedQuery(name = "PruebaVista.findByCelular", query = "SELECT p FROM PruebaVista p WHERE p.celular = :celular")
    , @NamedQuery(name = "PruebaVista.findByRol", query = "SELECT p FROM PruebaVista p WHERE p.rol = :rol")
    , @NamedQuery(name = "PruebaVista.findByFechaDeContratacion", query = "SELECT p FROM PruebaVista p WHERE p.fechaDeContratacion = :fechaDeContratacion")
    , @NamedQuery(name = "PruebaVista.findByEmail", query = "SELECT p FROM PruebaVista p WHERE p.email = :email")
    , @NamedQuery(name = "PruebaVista.findByEstado", query = "SELECT p FROM PruebaVista p WHERE p.estado = :estado")
    , @NamedQuery(name = "PruebaVista.findByIdPais", query = "SELECT p FROM PruebaVista p WHERE p.idPais = :idPais")
    , @NamedQuery(name = "PruebaVista.findByNombrePais", query = "SELECT p FROM PruebaVista p WHERE p.nombrePais = :nombrePais")})
public class PruebaVista implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "usuario")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "pass")
    private String pass;
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
    private int pais;
    @Column(name = "dui")
    private String dui;
    @Column(name = "nit")
    private String nit;
    @Column(name = "pasaporte")
    private String pasaporte;
    @Basic(optional = false)
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @Column(name = "celular")
    private String celular;
    @Basic(optional = false)
    @Column(name = "rol")
    private int rol;
    @Basic(optional = false)
    @Column(name = "fecha_de_contratacion")
    @Temporal(TemporalType.DATE)
    private Date fechaDeContratacion;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "estado")
    private int estado;
    @Basic(optional = false)
    @Column(name = "id_pais")
    private int idPais;
    @Basic(optional = false)
    @Column(name = "nombre_pais")
    private String nombrePais;

    public PruebaVista() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
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

    public int getPais() {
        return pais;
    }

    public void setPais(int pais) {
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public Date getFechaDeContratacion() {
        return fechaDeContratacion;
    }

    public void setFechaDeContratacion(Date fechaDeContratacion) {
        this.fechaDeContratacion = fechaDeContratacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    
}
