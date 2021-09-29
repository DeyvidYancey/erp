/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.servico;

import erp.DAO.FuncionarioDAO;
import erp.OBJECTS.Funcionario;
import erp.exceptions.FornecedorException;
import erp.exceptions.FuncionarioException;
import erp.exceptions.ProdutoException;
import erp.interfaces.servico.IFuncionarioServico;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Deyvid Yancey
 */
public class FuncionarioServico implements IFuncionarioServico {

    @Override
    public void adicionarFuncionario(Funcionario obj) throws FuncionarioException {
        try {
     
    
         
     if ("".equals(obj.getNome()) || "".equals(obj.getRg()) || "".equals(obj.getCpf()) || "".equals(obj.getEndereco()) || "".equals(obj.getCep())
            || "".equals(obj.getCidade()) || "".equals(obj.getUf()) || "".equals(obj.getNumero())|| "".equals(obj.getBairro())|| "".equals(obj.getLogin())|| "".equals(obj.getSenha())|| "".equals(obj.getNivelDeAcesso())) {
         throw new ProdutoException("CERTIFIQUE-SE DE QUE NENHUM CAMPO ESTÁ EM BRANCO");
            }

           

           
            FuncionarioDAO dao = new FuncionarioDAO();
            dao.adicionarFuncionario(obj);
            System.out.println("O PRODUTO FOI CADASTRADO COM SUCESSO!!!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO NO SERVIÇO DO PRODUTO" + e);
        }    
    }

    @Override
    public void updateFuncionario (Funcionario obj) throws FuncionarioException {
        
    }

    @Override
    public void deletarFuncionario (Funcionario obj) throws FuncionarioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Funcionario> listarFuncionario () throws FuncionarioException {
       return null; 
    }
    
}
