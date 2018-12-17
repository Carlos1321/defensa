/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.persistencia.Examen;
import java.util.List;

/**
 *
 * @author roberto.abregoUSAM
 */
public interface FuncionExamen {

    public boolean Crear(Examen Examen);

    public boolean Borrar(Examen Examen);

    public boolean Borrar(int id);

    public boolean Borrar(String consulta);

    public boolean Actualizar(Examen Examen);

    public List<Examen> Consultar();

    public Examen ConsultarID(Examen id);

    public Examen ConsultarID(int id);

    public Examen ConsultarID(String id);
}
