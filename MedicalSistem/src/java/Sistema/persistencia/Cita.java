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
@Table(name = "cita")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cita.findAll", query = "SELECT c FROM Cita c")
    , @NamedQuery(name = "Cita.findByIdCita", query = "SELECT c FROM Cita c WHERE c.idCita = :idCita")
    , @NamedQuery(name = "Cita.findByFecha", query = "SELECT c FROM Cita c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "Cita.findByHora", query = "SELECT c FROM Cita c WHERE c.hora = :hora")
    , @NamedQuery(name = "Cita.findByTriaje", query = "SELECT c FROM Cita c WHERE c.triaje = :triaje")
    , @NamedQuery(name = "Cita.findByEstado", query = "SELECT c FROM Cita c WHERE c.estado = :estado")})
public class Cita implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cita")
    private Integer idCita;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @Basic(optional = false)
    @Column(name = "triaje")
    private String triaje;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "usuario", referencedColumnName = "usuario")
    @ManyToOne(optional = false)
    private PerfilPersonal usuario;
    @JoinColumn(name = "codigo_expediente", referencedColumnName = "codigo_expediente")
    @ManyToOne(optional = false)
    private Expediente codigoExpediente;
    @JoinColumn(name = "tipo_cita", referencedColumnName = "id_tipo_cita")
    @ManyToOne(optional = false)
    private TipoCita tipoCita;
    @JoinColumn(name = "area", referencedColumnName = "id_zona")
    @ManyToOne(optional = false)
    private Zona area;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cita")
    private Collection<Consulta> consultaCollection;

    public Cita() {
    }

    public Cita(Integer idCita) {
        this.idCita = idCita;
    }

    public Cita(Integer idCita, Date fecha, Date hora, String triaje, String estado) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.hora = hora;
        this.triaje = triaje;
        this.estado = estado;
    }

    public Integer getIdCita() {
        return idCita;
    }

    public void setIdCita(Integer idCita) {
        this.idCita = idCita;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getTriaje() {
        return triaje;
    }

    public void setTriaje(String triaje) {
        this.triaje = triaje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public PerfilPersonal getUsuario() {
        return usuario;
    }

    public void setUsuario(PerfilPersonal usuario) {
        this.usuario = usuario;
    }

    public Expediente getCodigoExpediente() {
        return codigoExpediente;
    }

    public void setCodigoExpediente(Expediente codigoExpediente) {
        this.codigoExpediente = codigoExpediente;
    }

    public TipoCita getTipoCita() {
        return tipoCita;
    }

    public void setTipoCita(TipoCita tipoCita) {
        this.tipoCita = tipoCita;
    }

    public Zona getArea() {
        return area;
    }

    public void setArea(Zona area) {
        this.area = area;
    }

    @XmlTransient
    public Collection<Consulta> getConsultaCollection() {
        return consultaCollection;
    }

    public void setConsultaCollection(Collection<Consulta> consultaCollection) {
        this.consultaCollection = consultaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCita != null ? idCita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cita)) {
            return false;
        }
        Cita other = (Cita) object;
        if ((this.idCita == null && other.idCita != null) || (this.idCita != null && !this.idCita.equals(other.idCita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sistema.persistencia.Cita[ idCita=" + idCita + " ]";
    }
    
}
