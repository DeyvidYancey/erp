/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.servico;

import erp.DAO.ProdutoDAO;
import erp.OBJECTS.Produto;
import erp.exceptions.ProdutoException;
import erp.interfaces.servico.IProdutoServico;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Deyvid Yancey
 */
public class ProdutoServico implements IProdutoServico {

    @Override
    public void adicionarProduto(Produto obj) throws ProdutoException {
 try {
     
    
         
     if ("".equals(obj.getNome()) || "".equals(obj.getEstoque()) || "".equals(obj.getPrecoDeCompra()) || "".equals(obj.getTipo()) || "".equals(obj.getPrecoDeVenda())
            || "".equals(obj.getPorcentagem()) || "".equals(obj.getId()) || "".equals(obj.getFornecedor())|| "".equals(obj.getUnidade())) {
         throw new ProdutoException("CERTIFIQUE-SE DE QUE NENHUM CAMPO ESTÁ EM BRANCO");
            }

           

           
            ProdutoDAO dao = new ProdutoDAO();
            dao.adicionarProduto(obj);
            System.out.println("O PRODUTO FOI CADASTRADO COM SUCESSO!!!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO NO SERVIÇO DO PRODUTO" + e);
        }    
    }

    @Override
    public void updateProduto(Produto obj) throws ProdutoException {
        try {
            if ("".equals(obj.getNome()) || "".equals(obj.getEstoque()) || "".equals(obj.getPrecoDeCompra()) || "".equals(obj.getTipo()) || "".equals(obj.getPrecoDeVenda())
            || "".equals(obj.getPorcentagem()) || "".equals(obj.getId()) || "".equals(obj.getFornecedor()) || "".equals(obj.getUnidade())) {
         throw new ProdutoException("CERTIFIQUE-SE DE QUE NENHUM CAMPO ESTÁ EM BRANCO");
            }

           

           
            ProdutoDAO dao = new ProdutoDAO();
            dao.adicionarProduto(obj);
            System.out.println("O PRODUTO FOI EDITADO COM SUCESSO!!!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO NO EDITAR DO PRODUTO" + e);
        }    
    }

    @Override
    public void deletarProduto(Produto obj) throws ProdutoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produto> listarProduto() throws ProdutoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
