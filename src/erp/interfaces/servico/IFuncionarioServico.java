/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.interfaces.servico;

import erp.OBJECTS.Funcionario;
import erp.exceptions.FornecedorException;
import erp.exceptions.FuncionarioException;
import java.util.List;

/**
 *
 * @author Deyvid Yancey
 */
public interface IFuncionarioServico  {
     public void adicionarFuncionario  (Funcionario obj)throws FuncionarioException;
    public void updateFuncionario (Funcionario obj)throws FuncionarioException;
    public void deletarFuncionario  (Funcionario obj)throws FuncionarioException;
    public List<Funcionario> listarFuncionario ()throws FuncionarioException;
}
