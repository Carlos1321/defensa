/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.persistencia.ConsultaExamen;
import java.util.List;

/**
 *
 * @author roberto.abregoUSAM
 */
public interface FuncionConsultaExamen {

    public boolean Crear(ConsultaExamen consultaExamen);

    public boolean Borrar(ConsultaExamen consultaExamen);

    public boolean Borrar(int id);

    public boolean Borrar(String consulta);

    public boolean Actualizar(ConsultaExamen consultaExamen);

    public List<ConsultaExamen> Consultar();

    public ConsultaExamen ConsultarID(ConsultaExamen id);

    public ConsultaExamen ConsultarID(int id);

    public ConsultaExamen ConsultarID(String id);
}
