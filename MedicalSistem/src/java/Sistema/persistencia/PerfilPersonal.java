/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.persistencia;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "perfil_personal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PerfilPersonal.findAll", query = "SELECT p FROM PerfilPersonal p")
    , @NamedQuery(name = "PerfilPersonal.findByUsuario", query = "SELECT p FROM PerfilPersonal p WHERE p.usuario = :usuario")
    , @NamedQuery(name = "PerfilPersonal.login", query = "SELECT p FROM PerfilPersonal p WHERE p.usuario = :usuario and p.pass = :pass ")
    , @NamedQuery(name = "PerfilPersonal.findByPass", query = "SELECT p FROM PerfilPersonal p WHERE p.pass = :pass")
    , @NamedQuery(name = "PerfilPersonal.findByPrimerNombre", query = "SELECT p FROM PerfilPersonal p WHERE p.primerNombre = :primerNombre")
    , @NamedQuery(name = "PerfilPersonal.findBySegundoNombre", query = "SELECT p FROM PerfilPersonal p WHERE p.segundoNombre = :segundoNombre")
    , @NamedQuery(name = "PerfilPersonal.findByTercerNombre", query = "SELECT p FROM PerfilPersonal p WHERE p.tercerNombre = :tercerNombre")
    , @NamedQuery(name = "PerfilPersonal.findByPrimerApellido", query = "SELECT p FROM PerfilPersonal p WHERE p.primerApellido = :primerApellido")
    , @NamedQuery(name = "PerfilPersonal.findBySegundoApellido", query = "SELECT p FROM PerfilPersonal p WHERE p.segundoApellido = :segundoApellido")
    , @NamedQuery(name = "PerfilPersonal.findByTercerApellido", query = "SELECT p FROM PerfilPersonal p WHERE p.tercerApellido = :tercerApellido")
    , @NamedQuery(name = "PerfilPersonal.findByEdad", query = "SELECT p FROM PerfilPersonal p WHERE p.edad = :edad")
    , @NamedQuery(name = "PerfilPersonal.findBySexo", query = "SELECT p FROM PerfilPersonal p WHERE p.sexo = :sexo")
    , @NamedQuery(name = "PerfilPersonal.findByPais", query = "SELECT p FROM PerfilPersonal p WHERE p.pais = :pais")
    , @NamedQuery(name = "PerfilPersonal.findByDui", query = "SELECT p FROM PerfilPersonal p WHERE p.dui = :dui")
    , @NamedQuery(name = "PerfilPersonal.findByNit", query = "SELECT p FROM PerfilPersonal p WHERE p.nit = :nit")
    , @NamedQuery(name = "PerfilPersonal.findByPasaporte", query = "SELECT p FROM PerfilPersonal p WHERE p.pasaporte = :pasaporte")
    , @NamedQuery(name = "PerfilPersonal.findByDireccion", query = "SELECT p FROM PerfilPersonal p WHERE p.direccion = :direccion")
    , @NamedQuery(name = "PerfilPersonal.findByTelefono", query = "SELECT p FROM PerfilPersonal p WHERE p.telefono = :telefono")
    , @NamedQuery(name = "PerfilPersonal.findByCelular", query = "SELECT p FROM PerfilPersonal p WHERE p.celular = :celular")
    , @NamedQuery(name = "PerfilPersonal.findByFechaDeContratacion", query = "SELECT p FROM PerfilPersonal p WHERE p.fechaDeContratacion = :fechaDeContratacion")
    , @NamedQuery(name = "PerfilPersonal.findByEmail", query = "SELECT p FROM PerfilPersonal p WHERE p.email = :email")})
public class PerfilPersonal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
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
    private String pais;
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
    @Column(name = "fecha_de_contratacion")
//    @Temporal(TemporalType.DATE)
    private LocalDate fechaDeContratacion;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @JoinColumn(name = "estado", referencedColumnName = "id_estado")
    @ManyToOne(optional = false)
    private Estado estado;
    @JoinColumn(name = "rol", referencedColumnName = "id_rol")
    @ManyToOne(optional = false)
    private Rol rol;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private Collection<PerfilEspecialidad> perfilEspecialidadCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private Collection<Cita> citaCollection;

    public PerfilPersonal() {
    }

    public PerfilPersonal(String usuario) {
        this.usuario = usuario;
    }

    public PerfilPersonal(String usuario, String pass, String primerNombre, String segundoNombre, String primerApellido, int edad, String sexo, String pais, String direccion, String celular, LocalDate fechaDeContratacion, String email) {
        this.usuario = usuario;
        this.pass = pass;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.edad = edad;
        this.sexo = sexo;
        this.pais = pais;
        this.direccion = direccion;
        this.celular = celular;
        this.fechaDeContratacion = fechaDeContratacion;
        this.email = email;
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

    public LocalDate getFechaDeContratacion() {
        return fechaDeContratacion;
    }

    public void setFechaDeContratacion(LocalDate fechaDeContratacion) {
        this.fechaDeContratacion = fechaDeContratacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @XmlTransient
    public Collection<PerfilEspecialidad> getPerfilEspecialidadCollection() {
        return perfilEspecialidadCollection;
    }

    public void setPerfilEspecialidadCollection(Collection<PerfilEspecialidad> perfilEspecialidadCollection) {
        this.perfilEspecialidadCollection = perfilEspecialidadCollection;
    }

    @XmlTransient
    public Collection<Cita> getCitaCollection() {
        return citaCollection;
    }

    public void setCitaCollection(Collection<Cita> citaCollection) {
        this.citaCollection = citaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuario != null ? usuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PerfilPersonal)) {
            return false;
        }
        PerfilPersonal other = (PerfilPersonal) object;
        if ((this.usuario == null && other.usuario != null) || (this.usuario != null && !this.usuario.equals(other.usuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sistema.persistencia.PerfilPersonal[ usuario=" + usuario + " ]";
    }
    
}
