/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.interfaces.DAO;

import erp.OBJECTS.Fornecedor;
import erp.exceptions.FornecedorException;
import java.util.List;

/**
 *
 * @author Deyvid Yancey
 */
public interface IFornecedorDAO {
    public void adicionarFornecedor(Fornecedor obj) ;
    public void updateFornecedor (Fornecedor obj);
    public void deletarFornecedor (Fornecedor obj);
    public List<Fornecedor> listarFornecedor();
    
}
