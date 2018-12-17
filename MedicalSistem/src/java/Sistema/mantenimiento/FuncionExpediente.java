/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.persistencia.Expediente;
import java.util.List;

/**
 *
 * @author roberto.abregoUSAM
 */

public interface FuncionExpediente {

    public boolean Crear(Expediente Expediente);

    public boolean Borrar(Expediente Expediente);

    public boolean Borrar(int id);

    public boolean Borrar(String consulta);

    public boolean Actualizar(Expediente Expediente);

    public List<Expediente> Consultar();

    public Expediente ConsultarID(Expediente id);

    public Expediente ConsultarID(int id);

    public Expediente ConsultarID(String id);
}
