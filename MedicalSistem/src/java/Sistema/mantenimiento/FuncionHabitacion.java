/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.persistencia.Habitacion;
import java.util.List;

/**
 *
 * @author roberto.abregoUSAM
 */
public interface FuncionHabitacion {

    public boolean Crear(Habitacion Habitacion);

    public boolean Borrar(Habitacion Habitacion);

    public boolean Borrar(int id);

    public boolean Borrar(String consulta);

    public boolean Actualizar(Habitacion Habitacion);

    public List<Habitacion> Consultar();

    public Habitacion ConsultarID(Habitacion id);

    public Habitacion ConsultarID(int id);

    public Habitacion ConsultarID(String id);
}
