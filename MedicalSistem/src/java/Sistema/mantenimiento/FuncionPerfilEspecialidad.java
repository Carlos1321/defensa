/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.persistencia.PerfilEspecialidad;
import java.util.List;

/**
 *
 * @author roberto.abregoUSAM
 */
public interface FuncionPerfilEspecialidad {

    public boolean Crear(PerfilEspecialidad PerfilEspecialidad);

    public boolean Borrar(PerfilEspecialidad PerfilEspecialidad);

    public boolean Borrar(int id);

    public boolean Borrar(String consulta);

    public boolean Actualizar(PerfilEspecialidad PerfilEspecialidad);

    public List<PerfilEspecialidad> Consultar();

    public PerfilEspecialidad ConsultarID(PerfilEspecialidad id);

    public PerfilEspecialidad ConsultarID(int id);

    public PerfilEspecialidad ConsultarID(String id);
}
