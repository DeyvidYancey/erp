/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.interfaces.servico;

import erp.OBJECTS.Fornecedor;
import erp.exceptions.FornecedorException;
import java.util.List;

/**
 *
 * @author Deyvid Yancey
 */
public interface IFornecedorServico {
    public void adicionarFornecedor(Fornecedor obj)throws FornecedorException;
    public void updateFornecedor (Fornecedor obj)throws FornecedorException;
    public void deletarFornecedor (Fornecedor obj)throws FornecedorException;
    public List<Fornecedor> listarFornecedor()throws FornecedorException;
}
