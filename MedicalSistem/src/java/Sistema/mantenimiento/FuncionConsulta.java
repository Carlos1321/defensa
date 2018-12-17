/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.persistencia.Consulta;
import java.util.List;

/**
 *
 * @author roberto.abregoUSAM
 */
public interface FuncionConsulta {

    public boolean Crear(Consulta consulta);

    public boolean Borrar(Consulta consulta);

    public boolean Borrar(int id);

    public boolean Borrar(String consulta);

    public boolean Actualizar(Consulta consulta);

    public List<Consulta> Consultar();

    public Consulta ConsultarID(Consulta id);

    public Consulta ConsultarID(int id);

    public Consulta ConsultarID(String id);
}
