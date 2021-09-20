/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.servico;

import erp.OBJECTS.Fornecedor;
import erp.exceptions.FornecedorException;
import erp.interfaces.servico.IFornecedorServico;
import java.util.List;
import erp.DAO.FornecedorDAO;
import javax.swing.JOptionPane;
/**
 *
 * @author Deyvid Yancey
 */
public class FornecedorServico implements IFornecedorServico {

    @Override
    public void adicionarFornecedor(Fornecedor obj) throws FornecedorException {
        try {
            if ("".equals(obj.getNome()) || "".equals(obj.getEndereco()) || "".equals(obj.getCidade()) || "".equals(obj.getUf()) || "".equals(obj.getCep())
            || "".equals(obj.getIe()) || "".equals(obj.getCnpj()) || "".equals(obj.getFone()) || "".equals(obj.getEmail()) ) {
         throw new FornecedorException("CERTIFIQUE-SE DE QUE NENHUM CAMPO ESTÁ EM BRANCO");
        } 
            FornecedorDAO dao = new FornecedorDAO();
            dao.adicionarFornecedor(obj);
            
        }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"ERRO NO SERVIÇO DO FORNECEDOR " +e);
        }
            
            
            
    }
    

    @Override
    public void updateFornecedor(Fornecedor obj) throws FornecedorException {
        try {
            if ("".equals(obj.getNome()) || "".equals(obj.getEndereco()) || "".equals(obj.getCidade()) || "".equals(obj.getUf()) || "".equals(obj.getCep())
            || "".equals(obj.getIe()) || "".equals(obj.getCnpj()) || "".equals(obj.getFone()) || "".equals(obj.getEmail()) ) {
         throw new FornecedorException("CERTIFIQUE-SE DE QUE NENHUM CAMPO ESTÁ EM BRANCO");
    }
        } catch (Exception e) {
      JOptionPane.showMessageDialog(null,"ERRO AO EDITAR FORNECEDOR NO SERVIÇO" + e);
        }
        
    }
    
    
    
    
    
    
    
    @Override
    public void deletarFornecedor(Fornecedor obj) throws FornecedorException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Fornecedor> listarFornecedor() throws FornecedorException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
