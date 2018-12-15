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
 * @author angel.lopezusam
 */
@Entity
@Table(name = "internamiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Internamiento.findAll", query = "SELECT i FROM Internamiento i")
    , @NamedQuery(name = "Internamiento.findByIdInternamiento", query = "SELECT i FROM Internamiento i WHERE i.idInternamiento = :idInternamiento")
    , @NamedQuery(name = "Internamiento.findByHabitacion", query = "SELECT i FROM Internamiento i WHERE i.habitacion = :habitacion")
    , @NamedQuery(name = "Internamiento.findByNumeroDeCama", query = "SELECT i FROM Internamiento i WHERE i.numeroDeCama = :numeroDeCama")
    , @NamedQuery(name = "Internamiento.findByHoraIngreso", query = "SELECT i FROM Internamiento i WHERE i.horaIngreso = :horaIngreso")
    , @NamedQuery(name = "Internamiento.findByFechaIngreso", query = "SELECT i FROM Internamiento i WHERE i.fechaIngreso = :fechaIngreso")
    , @NamedQuery(name = "Internamiento.findByHoraSalida", query = "SELECT i FROM Internamiento i WHERE i.horaSalida = :horaSalida")
    , @NamedQuery(name = "Internamiento.findByFechaSalida", query = "SELECT i FROM Internamiento i WHERE i.fechaSalida = :fechaSalida")})
public class Internamiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_internamiento")
    private Integer idInternamiento;
    @Basic(optional = false)
    @Column(name = "habitacion")
    private int habitacion;
    @Basic(optional = false)
    @Column(name = "numero_de_cama")
    private int numeroDeCama;
    @Basic(optional = false)
    @Column(name = "hora_ingreso")
    @Temporal(TemporalType.TIME)
    private Date horaIngreso;
    @Basic(optional = false)
    @Column(name = "fecha_ingreso")
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;
    @Column(name = "hora_salida")
    @Temporal(TemporalType.TIME)
    private Date horaSalida;
    @Column(name = "fecha_salida")
    @Temporal(TemporalType.DATE)
    private Date fechaSalida;
    @OneToMany(mappedBy = "internamiento")
    private Collection<Consulta> consultaCollection;

    public Internamiento() {
    }

    public Internamiento(Integer idInternamiento) {
        this.idInternamiento = idInternamiento;
    }

    public Internamiento(Integer idInternamiento, int habitacion, int numeroDeCama, Date horaIngreso, Date fechaIngreso) {
        this.idInternamiento = idInternamiento;
        this.habitacion = habitacion;
        this.numeroDeCama = numeroDeCama;
        this.horaIngreso = horaIngreso;
        this.fechaIngreso = fechaIngreso;
    }

    public Integer getIdInternamiento() {
        return idInternamiento;
    }

    public void setIdInternamiento(Integer idInternamiento) {
        this.idInternamiento = idInternamiento;
    }

    public int getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    public int getNumeroDeCama() {
        return numeroDeCama;
    }

    public void setNumeroDeCama(int numeroDeCama) {
        this.numeroDeCama = numeroDeCama;
    }

    public Date getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(Date horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
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
        hash += (idInternamiento != null ? idInternamiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Internamiento)) {
            return false;
        }
        Internamiento other = (Internamiento) object;
        if ((this.idInternamiento == null && other.idInternamiento != null) || (this.idInternamiento != null && !this.idInternamiento.equals(other.idInternamiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Internamiento[ idInternamiento=" + idInternamiento + " ]";
    }
    
}
