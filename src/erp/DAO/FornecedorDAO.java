/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.DAO;

import erp.JDBC.ConnectionFactory;

import erp.OBJECTS.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import erp.interfaces.DAO.IFornecedorDAO;

/**
 *
 * @author Deyvid
 */
public class FornecedorDAO implements IFornecedorDAO {

    private Connection con;

    public FornecedorDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    @Override
    public void adicionarFornecedor(Fornecedor obj) {
        try {
            String sql = "insert into fornecedor (nome, endereco, cidade, uf,cep, ie, cnpj,"
                    + "fone, email) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, obj.getNome());
            stm.setString(2, obj.getEndereco());
            stm.setString(3, obj.getCidade());
            stm.setString(4, obj.getUf());
            stm.setString(5, obj.getCep());
            stm.setString(6, obj.getIe());
            stm.setString(7, obj.getCnpj());
            stm.setString(8, obj.getFone());
            stm.setString(9, obj.getEmail());

            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no metodo de adicionar" + e);
        }

    }

    @Override
    public void updateFornecedor(Fornecedor obj) {
        con = new ConnectionFactory().getConnection();
        try {
            String sql = "update fornecedor set nome = ?, endereco = ?, cidade = ? , uf = ?,cep = ?, ie = ?, cnpj = ?,"
                    + "fone = ?, email = ?  where id =?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, obj.getNome());
            stm.setString(2, obj.getEndereco());
            stm.setString(3, obj.getCidade());
            stm.setString(4, obj.getUf());
            stm.setString(5, obj.getCep());
            stm.setString(6, obj.getIe());
            stm.setString(7, obj.getCnpj());
            stm.setString(8, obj.getFone());
            stm.setString(9, obj.getEmail());
            stm.setInt(10, obj.getId());
            stm.execute();
            stm.close();

            JOptionPane.showMessageDialog(null, " Fornecedor alterado com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar Fornecedor" + e);
        }
    }

    @Override
    public void deletarFornecedor(Fornecedor obj) {
        try {
            String sql = "delete from fornecedor where id=?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, obj.getId());

            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null, "Excluido");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar Fornecedor" + e);
        }
    }

    @Override
    public List<Fornecedor> listarFornecedor() {

        try {
            List<Fornecedor> lista = new ArrayList<>();
            String sql = "Select * from fornecedor";
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Fornecedor obj = new Fornecedor();
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("uf"));
                obj.setCep(rs.getString("cep"));
                obj.setIe(rs.getString("ie"));
                obj.setCnpj(rs.getString("cnpj"));
                obj.setFone(rs.getString("fone"));
                obj.setEmail(rs.getString("email"));
                lista.add(obj);

            }
            return lista;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar Fornecedor " + e);
        }
        return null;
    }

}
