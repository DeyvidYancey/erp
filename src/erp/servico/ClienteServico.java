/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.servico;

import erp.DAO.ClientesDAO;
import erp.OBJECTS.Cliente;
import erp.exceptions.ClienteException;
import erp.interfaces.servico.IClienteServico;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Deyvid Yancey
 */
public class ClienteServico implements IClienteServico {

    @Override
    public void adicionarCliente(Cliente obj) throws ClienteException{
        try {
            if ("".equals(obj.getNome()) || "".equals(obj.getRg()) || "".equals(obj.getCpf()) || "".equals(obj.getEndereco()) || "".equals(obj.getCidade())
            || "".equals(obj.getUf()) || "".equals(obj.getCep()) || "".equals(obj.getCep()) || "".equals(obj.getBairro()) || "".equals(obj.getNumero())) {
         throw new ClienteException("CERTIFIQUE-SE DE QUE NENHUM CAMPO ESTÁ EM BRANCO");
            }

           

           
            ClientesDAO dao = new ClientesDAO();
            dao.adicionarCliente(obj);
            System.out.println("O PRODUTO FOI CADASTRADO COM SUCESSO!!!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO NO SERVIÇO DO CLIENTE" + e);
        }
    }

    @Override
    public void updateCliente(Cliente obj) {
        try {
            if ("".equals(obj.getNome()) || "".equals(obj.getRg()) || "".equals(obj.getCpf()) || "".equals(obj.getEndereco()) || "".equals(obj.getCidade())
            || "".equals(obj.getUf()) || "".equals(obj.getCep()) || "".equals(obj.getCep()) || "".equals(obj.getBairro()) || "".equals(obj.getNumero())) {
         throw new ClienteException("CERTIFIQUE-SE DE QUE NENHUM CAMPO ESTÁ EM BRANCO");
            }
        ClientesDAO dao = new ClientesDAO();
        dao.updateCliente(obj);
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"ERRO AO ATUALIZAR CLIENTE NO SERVICO" + e);
        }
        
        }
    

    @Override
    public void deletarCliente(Cliente obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> listarClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
