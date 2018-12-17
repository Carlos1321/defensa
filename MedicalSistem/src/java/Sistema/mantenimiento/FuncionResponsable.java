/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.persistencia.Responsable;
import java.util.List;

/**
 *
 * @author roberto.abregoUSAM
 */
public interface FuncionResponsable {

    public boolean Crear(Responsable Responsable);

    public boolean Borrar(Responsable Responsable);

    public boolean Borrar(int id);

    public boolean Borrar(String consulta);

    public boolean Actualizar(Responsable Responsable);

    public List<Responsable> Consultar();

    public Responsable ConsultarID(Responsable id);

    public Responsable ConsultarID(int id);

    public Responsable ConsultarID(String id);
}
