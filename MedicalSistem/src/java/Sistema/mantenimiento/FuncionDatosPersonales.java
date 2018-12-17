/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.persistencia.DatosPersonales;
import java.util.List;

/**
 *
 * @author roberto.abregoUSAM
 */
public interface FuncionDatosPersonales {

    public boolean Crear(DatosPersonales DatosPersonales);

    public boolean Borrar(DatosPersonales DatosPersonales);

    public boolean Borrar(int id);

    public boolean Borrar(String consulta);

    public boolean Actualizar(DatosPersonales DatosPersonales);

    public List<DatosPersonales> Consultar();

    public DatosPersonales ConsultarID(DatosPersonales id);

    public DatosPersonales ConsultarID(int id);

    public DatosPersonales ConsultarID(String id);
}
