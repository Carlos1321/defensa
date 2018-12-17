/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.persistencia.Medicamento;
import java.util.List;

/**
 *
 * @author roberto.abregoUSAM
 */
public interface FuncionMedicamento {

    public boolean Crear(Medicamento Medicamento);

    public boolean Borrar(Medicamento Medicamento);

    public boolean Borrar(int id);

    public boolean Borrar(String consulta);

    public boolean Actualizar(Medicamento Medicamento);

    public List<Medicamento> Consultar();

    public Medicamento ConsultarID(Medicamento id);

    public Medicamento ConsultarID(int id);

    public Medicamento ConsultarID(String id);
}
