/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.interfaces.DAO;

import erp.OBJECTS.Produto;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Deyvid Yancey
 */
public interface IProdutoDAO {

    public void adicionarProduto(Produto obj) ;
    public void updateProduto (Produto obj);
    public void deletarProduto (Produto obj);
    public List<Produto> listarProduto();
    public List<Produto> buscarProdutoPorNome(String nome);
    public ResultSet listarFornecedor();

    
}
