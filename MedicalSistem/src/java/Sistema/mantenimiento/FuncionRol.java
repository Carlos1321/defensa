/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.persistencia.Rol;
import java.util.List;

/**
 *
 * @author roberto.abregoUSAM
 */
public interface FuncionRol {

    public boolean Crear(Rol Rol);

    public boolean Borrar(Rol Rol);

    public boolean Borrar(int id);

    public boolean Borrar(String consulta);

    public boolean Actualizar(Rol Rol);

    public List<Rol> Consultar();

    public Rol ConsultarID(Rol id);

    public Rol ConsultarID(int id);

    public Rol ConsultarID(String id);
}
