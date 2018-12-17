/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema.mantenimiento;

import Sistema.persistencia.ConsultaMedicamento;
import java.util.List;

/**
 *
 * @author roberto.abregoUSAM
 */
public interface FuncionConsultaMedicamento {

    public boolean Crear(ConsultaMedicamento ConsultaMedicamento);

    public boolean Borrar(ConsultaMedicamento ConsultaMedicamento);

    public boolean Borrar(int id);

    public boolean Borrar(String consulta);

    public boolean Actualizar(ConsultaMedicamento ConsultaMedicamento);

    public List<ConsultaMedicamento> Consultar();

    public ConsultaMedicamento ConsultarID(ConsultaMedicamento id);

    public ConsultaMedicamento ConsultarID(int id);

    public ConsultaMedicamento ConsultarID(String id);
}
