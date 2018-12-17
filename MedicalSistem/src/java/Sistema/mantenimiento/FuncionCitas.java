/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.persistencia.Cita;
import java.util.List;

/**
 *
 * @author roberto.abregoUSAM
 */
public interface FuncionCitas {

    public boolean Crear(Cita entity);

    public boolean Borrar(Cita entity);

    public boolean Borrar(int entity);

    public boolean Borrar(String entity);

    public boolean Actualizar(Cita entity);

    public List<Cita> Consultar();

    public Cita ConsultarID(Cita enti);

    public Cita ConsultarID(int enti);

    public Cita ConsultarID(String enti);
}
