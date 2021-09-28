/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.interfaces.DAO;

import erp.OBJECTS.Cliente;
import erp.exceptions.ClienteException;
import java.util.List;

/**
 *
 * @author Deyvid Yancey
 */
public interface IClienteDAO {
    
    public void adicionarCliente(Cliente obj) ;
    public void updateCliente (Cliente obj);
    public void deletarCliente (Cliente obj);
    public List<Cliente> listarClientes();
    public List<Cliente> buscarClientesPorNome(String nome);
    
    
}
