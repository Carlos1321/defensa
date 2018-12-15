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
@Table(name = "habitacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Habitacion.findAll", query = "SELECT h FROM Habitacion h")
    , @NamedQuery(name = "Habitacion.findByIdHabitacion", query = "SELECT h FROM Habitacion h WHERE h.idHabitacion = :idHabitacion")
    , @NamedQuery(name = "Habitacion.findByNumeroHabitacion", query = "SELECT h FROM Habitacion h WHERE h.numeroHabitacion = :numeroHabitacion")
    , @NamedQuery(name = "Habitacion.findByTipoHabitacion", query = "SELECT h FROM Habitacion h WHERE h.tipoHabitacion = :tipoHabitacion")
    , @NamedQuery(name = "Habitacion.findByNumeroCamas", query = "SELECT h FROM Habitacion h WHERE h.numeroCamas = :numeroCamas")
    , @NamedQuery(name = "Habitacion.findByCamasVacias", query = "SELECT h FROM Habitacion h WHERE h.camasVacias = :camasVacias")
    , @NamedQuery(name = "Habitacion.findByCamasOcupadas", query = "SELECT h FROM Habitacion h WHERE h.camasOcupadas = :camasOcupadas")})
public class Habitacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_habitacion")
    private Integer idHabitacion;
    @Basic(optional = false)
    @Column(name = "numero_habitacion")
    private int numeroHabitacion;
    @Basic(optional = false)
    @Column(name = "tipo_habitacion")
    private String tipoHabitacion;
    @Basic(optional = false)
    @Column(name = "numero_camas")
    private int numeroCamas;
    @Column(name = "camas_vacias")
    private Integer camasVacias;
    @Column(name = "camas_ocupadas")
    private Integer camasOcupadas;
    @JoinColumn(name = "area", referencedColumnName = "id_zona")
    @ManyToOne(optional = false)
    private Zona area;

    public Habitacion() {
    }

    public Habitacion(Integer idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public Habitacion(Integer idHabitacion, int numeroHabitacion, String tipoHabitacion, int numeroCamas) {
        this.idHabitacion = idHabitacion;
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.numeroCamas = numeroCamas;
    }

    public Integer getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(Integer idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public Integer getCamasVacias() {
        return camasVacias;
    }

    public void setCamasVacias(Integer camasVacias) {
        this.camasVacias = camasVacias;
    }

    public Integer getCamasOcupadas() {
        return camasOcupadas;
    }

    public void setCamasOcupadas(Integer camasOcupadas) {
        this.camasOcupadas = camasOcupadas;
    }

    public Zona getArea() {
        return area;
    }

    public void setArea(Zona area) {
        this.area = area;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHabitacion != null ? idHabitacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Habitacion)) {
            return false;
        }
        Habitacion other = (Habitacion) object;
        if ((this.idHabitacion == null && other.idHabitacion != null) || (this.idHabitacion != null && !this.idHabitacion.equals(other.idHabitacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Habitacion[ idHabitacion=" + idHabitacion + " ]";
    }
    
}
