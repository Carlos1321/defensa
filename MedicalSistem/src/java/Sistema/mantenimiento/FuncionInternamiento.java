/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.persistencia.Internamiento;
import java.util.List;

/**
 *
 * @author roberto.abregoUSAM
 */
public interface FuncionInternamiento {

    public boolean Crear(Internamiento Internamiento);

    public boolean Borrar(Internamiento Internamiento);

    public boolean Borrar(int id);

    public boolean Borrar(String consulta);

    public boolean Actualizar(Internamiento Internamiento);

    public List<Internamiento> Consultar();

    public Internamiento ConsultarID(Internamiento id);

    public Internamiento ConsultarID(int id);

    public Internamiento ConsultarID(String id);
}
