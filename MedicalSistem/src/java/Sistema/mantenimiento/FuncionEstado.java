/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.persistencia.Estado;
import java.util.List;

/**
 *
 * @author roberto.abregoUSAM
 */
public interface FuncionEstado {

    public boolean Crear(Estado Estado);

    public boolean Borrar(Estado Estado);

    public boolean Borrar(int id);

    public boolean Borrar(String consulta);

    public boolean Actualizar(Estado Estado);

    public List<Estado> Consultar();

    public Estado ConsultarID(Estado id);

    public Estado ConsultarID(int id);

    public Estado ConsultarID(String id);
}
