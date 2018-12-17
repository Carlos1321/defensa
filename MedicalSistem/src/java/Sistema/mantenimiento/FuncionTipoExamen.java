/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.persistencia.TipoExamen;
import java.util.List;

/**
 *
 * @author roberto.abregoUSAM
 */
public interface FuncionTipoExamen {

    public boolean Crear(TipoExamen TipoExamen);

    public boolean Borrar(TipoExamen TipoExamen);

    public boolean Borrar(int id);

    public boolean Borrar(String consulta);

    public boolean Actualizar(TipoExamen TipoExamen);

    public List<TipoExamen> Consultar();

    public TipoExamen ConsultarID(TipoExamen id);

    public TipoExamen ConsultarID(int id);

    public TipoExamen ConsultarID(String id);
}
