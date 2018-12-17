/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.persistencia.TipoHabitacion;
import java.util.List;

/**
 *
 * @author roberto.abregoUSAM
 */
public interface FuncionTipoHabitacion {

    public boolean Crear(TipoHabitacion TipoHabitacion);

    public boolean Borrar(TipoHabitacion TipoHabitacion);

    public boolean Borrar(int id);

    public boolean Borrar(String consulta);

    public boolean Actualizar(TipoHabitacion TipoHabitacion);

    public List<TipoHabitacion> Consultar();

    public TipoHabitacion ConsultarID(TipoHabitacion id);

    public TipoHabitacion ConsultarID(int id);

    public TipoHabitacion ConsultarID(String id);
}
