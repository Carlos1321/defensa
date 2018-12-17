/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.persistencia.Zona;
import java.util.List;

/**
 *
 * @author roberto.abregoUSAM
 */
public interface FuncionZona {

    public boolean Crear(Zona Zona);

    public boolean Borrar(Zona Zona);

    public boolean Borrar(int id);

    public boolean Borrar(String consulta);

    public boolean Actualizar(Zona Zona);

    public List<Zona> Consultar();

    public Zona ConsultarID(Zona id);

    public Zona ConsultarID(int id);

    public Zona ConsultarID(String id);
}
