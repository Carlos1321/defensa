package managed_Beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import mantenimientos.mantenimientoHabitacion;
import persistencia.Habitacion;

/**
 *
 * @author alejandra.centeno
 */
@ManagedBean
@RequestScoped
public class BeanHabitacion {
    
    private int id_habitacion;
    private int numero_habitacion;
    private int area;
    private String tipo_habitacion;
    private int numero_camas;
    private int camas_vacias;
    private int camas_ocupadas;

    public int getId_habitacion() {
        return id_habitacion;
    }

    public void setId_habitacion(int id_habitacion) {
        this.id_habitacion = id_habitacion;
    }

    public int getNumero_habitacion() {
        return numero_habitacion;
    }

    public void setNumero_habitacion(int numero_habitacion) {
        this.numero_habitacion = numero_habitacion;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getTipo_habitacion() {
        return tipo_habitacion;
    }

    public void setTipo_habitacion(String tipo_habitacion) {
        this.tipo_habitacion = tipo_habitacion;
    }

    public int getNumero_camas() {
        return numero_camas;
    }

    public void setNumero_camas(int numero_camas) {
        this.numero_camas = numero_camas;
    }

    public int getCamas_vacias() {
        return camas_vacias;
    }

    public void setCamas_vacias(int camas_vacias) {
        this.camas_vacias = camas_vacias;
    }

    public int getCamas_ocupadas() {
        return camas_ocupadas;
    }

    public void setCamas_ocupadas(int camas_ocupadas) {
        this.camas_ocupadas = camas_ocupadas;
    }
    
    /**
     * Creates a new instance of BeanHabitacion
     */
    public BeanHabitacion() {
    }
    
    private List<Habitacion> listahabitacion;
    
    public List<Habitacion> getListahabitacion(){
        mantenimientoHabitacion mh = new mantenimientoHabitacion();
        return mh.Mostrar_habitaciones();
    }
    
    public static void main(String[] args) {
        BeanHabitacion b = new BeanHabitacion();
        System.out.println(b.listahabitacion);
    }
    
}
