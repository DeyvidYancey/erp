/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.servico;

import erp.OBJECTS.Funcionario;
import erp.exceptions.FornecedorException;
import erp.exceptions.FuncionarioException;
import erp.interfaces.servico.IFuncionarioServico;
import java.util.List;

/**
 *
 * @author Deyvid Yancey
 */
public class FuncionarioServico implements IFuncionarioServico {

    @Override
    public void adicionarFornecedor(Funcionario obj) throws FuncionarioException {
        
    }

    @Override
    public void updateFornecedor(Funcionario obj) throws FuncionarioException {
        
    }

    @Override
    public void deletarFornecedor(Funcionario obj) throws FuncionarioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Funcionario> listarFornecedor() throws FuncionarioException {
       return null; 
    }
    
}
