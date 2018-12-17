/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.persistencia.DatosMedicos;
import java.util.List;

/**
 *
 * @author roberto.abregoUSAM
 */
public interface FuncionDatosMedicos {

    public boolean Crear(DatosMedicos DatosMedicos);

    public boolean Borrar(DatosMedicos DatosMedicos);

    public boolean Borrar(int id);

    public boolean Borrar(String consulta);

    public boolean Actualizar(DatosMedicos DatosMedicos);

    public List<DatosMedicos> Consultar();

    public DatosMedicos ConsultarID(DatosMedicos id);

    public DatosMedicos ConsultarID(int id);

    public DatosMedicos ConsultarID(String id);
}
