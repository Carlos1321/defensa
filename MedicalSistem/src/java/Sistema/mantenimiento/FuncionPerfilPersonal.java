/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.persistencia.PerfilPersonal;
import java.util.List;

/**
 *
 * @author roberto.abregoUSAM
 */
public interface FuncionPerfilPersonal {

    public boolean Crear(PerfilPersonal PerfilPersonal);

    public boolean Borrar(PerfilPersonal PerfilPersonal);

    public boolean Borrar(int id);

    public boolean Borrar(String consulta);

    public boolean Actualizar(PerfilPersonal PerfilPersonal);

    public List<PerfilPersonal> Consultar();

    public PerfilPersonal ConsultarID(PerfilPersonal id);

    public PerfilPersonal ConsultarID(int id);

    public PerfilPersonal ConsultarID(String id);
    
    public PerfilPersonal Login(String user, String pass);
}
