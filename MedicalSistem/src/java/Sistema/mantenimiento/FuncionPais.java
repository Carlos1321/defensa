/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.persistencia.Pais;
import java.util.List;

/**
 *
 * @author roberto.abregoUSAM
 */
public interface FuncionPais {

    public boolean Crear(Pais Pais);

    public boolean Borrar(Pais Pais);

    public boolean Borrar(int id);

    public boolean Borrar(String consulta);

    public boolean Actualizar(Pais Pais);

    public List<Pais> Consultar();

    public Pais ConsultarID(Pais id);

    public Pais ConsultarID(int id);

    public Pais ConsultarID(String id);
}
