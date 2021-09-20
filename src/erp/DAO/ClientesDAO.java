/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.DAO;

import erp.JDBC.ConnectionFactory;
import erp.OBJECTS.Cliente;
import erp.exceptions.ClienteException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import erp.interfaces.DAO.IClienteDAO;

/**
 *
 * @author Deyvid
 */
public class ClientesDAO implements IClienteDAO {

    private Connection con;

    public ClientesDAO() {
        this.con = new ConnectionFactory().getConnection();
        
    }

    @Override
    public void adicionarCliente(Cliente obj) {
        try {
            String sql = "insert into clientes (nome, rg, cpf, endereco, cep, cidade,"
                    + "uf, numero, bairro) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, obj.getNome());
            stm.setString(2, obj.getRg());
            stm.setString(3, obj.getCpf());
            stm.setString(4, obj.getEndereco());
            stm.setString(5, obj.getCep());
            stm.setString(6, obj.getCidade());
            stm.setString(7, obj.getUf());
            stm.setString(8, obj.getNumero());
            stm.setString(9, obj.getBairro());
            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no metodo de adicionar" + e);
        }
    }    

    @Override
    public void updateCliente(Cliente obj) {
        
        con = new ConnectionFactory().getConnection();
        try {
            String sql = "update clientes set nome = ?, rg = ?, cpf = ? , endereco = ?, cep = ?, cidade = ?,"
                    + "uf = ?, numero = ?, bairro = ? where id =?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, obj.getNome());
            stm.setString(2, obj.getRg());
            stm.setString(3, obj.getCpf());
            stm.setString(4, obj.getEndereco());
            stm.setString(5, obj.getCep());
            stm.setString(6, obj.getCidade());
            stm.setString(7, obj.getUf());
            stm.setString(8, obj.getNumero());
            stm.setString(9, obj.getBairro());
            stm.setInt(10, obj.getId());
            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null, " Cliente alterado com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar cliente" + e);
        }
        
    }

    @Override
    public void deletarCliente(Cliente obj) {
        try {
            String sql = "delete from clientes where id=?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, obj.getId());
            
            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null, "Excluido");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar cliente" + e);
        }
    }
    
    @Override
    public List<Cliente> listarClientes() {
        try {
            List<Cliente> lista = new ArrayList<>();
            String sql = "Select * from clientes";
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {                
                Cliente obj = new Cliente();
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setCep(rs.getString("cep"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("uf"));
                obj.setNumero(rs.getString("numero"));
                obj.setBairro(rs.getString("bairro"));
                lista.add(obj);
           
            }            
                 return lista;
        } catch (Exception e) {
         JOptionPane.showMessageDialog(null,"Erro ao listar clientes " + e);
        }
      return null;
    }
    
}
