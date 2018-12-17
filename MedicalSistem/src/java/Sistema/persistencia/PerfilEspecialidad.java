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
@Table(name = "perfil_especialidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PerfilEspecialidad.findAll", query = "SELECT p FROM PerfilEspecialidad p")
    , @NamedQuery(name = "PerfilEspecialidad.findByIdPerfilEspecialidad", query = "SELECT p FROM PerfilEspecialidad p WHERE p.idPerfilEspecialidad = :idPerfilEspecialidad")})
public class PerfilEspecialidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_perfil_especialidad")
    private Integer idPerfilEspecialidad;
    @JoinColumn(name = "usuario", referencedColumnName = "usuario")
    @ManyToOne(optional = false)
    private PerfilPersonal usuario;
    @JoinColumn(name = "especialidad", referencedColumnName = "id_especialidad")
    @ManyToOne(optional = false)
    private Especialidad especialidad;

    public PerfilEspecialidad() {
    }

    public PerfilEspecialidad(Integer idPerfilEspecialidad) {
        this.idPerfilEspecialidad = idPerfilEspecialidad;
    }

    public Integer getIdPerfilEspecialidad() {
        return idPerfilEspecialidad;
    }

    public void setIdPerfilEspecialidad(Integer idPerfilEspecialidad) {
        this.idPerfilEspecialidad = idPerfilEspecialidad;
    }

    public PerfilPersonal getUsuario() {
        return usuario;
    }

    public void setUsuario(PerfilPersonal usuario) {
        this.usuario = usuario;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPerfilEspecialidad != null ? idPerfilEspecialidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PerfilEspecialidad)) {
            return false;
        }
        PerfilEspecialidad other = (PerfilEspecialidad) object;
        if ((this.idPerfilEspecialidad == null && other.idPerfilEspecialidad != null) || (this.idPerfilEspecialidad != null && !this.idPerfilEspecialidad.equals(other.idPerfilEspecialidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sistema.persistencia.PerfilEspecialidad[ idPerfilEspecialidad=" + idPerfilEspecialidad + " ]";
    }
    
}
