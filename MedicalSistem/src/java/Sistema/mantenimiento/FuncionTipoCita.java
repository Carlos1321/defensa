/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.persistencia.TipoCita;
import java.util.List;

/**
 *
 * @author roberto.abregoUSAM
 */
public interface FuncionTipoCita {

    public boolean Crear(TipoCita TipoCita);

    public boolean Borrar(TipoCita TipoCita);

    public boolean Borrar(int id);

    public boolean Borrar(String consulta);

    public boolean Actualizar(TipoCita TipoCita);

    public List<TipoCita> Consultar();

    public TipoCita ConsultarID(TipoCita id);

    public TipoCita ConsultarID(int id);

    public TipoCita ConsultarID(String id);
}
