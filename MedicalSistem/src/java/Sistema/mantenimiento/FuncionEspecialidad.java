/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.persistencia.Especialidad;
import java.util.List;

/**
 *
 * @author roberto.abregoUSAM
 */
public interface FuncionEspecialidad {

    public boolean Crear(Especialidad Especialidad);

    public boolean Borrar(Especialidad Especialidad);

    public boolean Borrar(int id);

    public boolean Borrar(String consulta);

    public boolean Actualizar(Especialidad Especialidad);

    public List<Especialidad> Consultar();

    public Especialidad ConsultarID(Especialidad id);

    public Especialidad ConsultarID(int id);

    public Especialidad ConsultarID(String id);
}
