/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.DAO;

import erp.JDBC.ConnectionFactory;
import erp.OBJECTS.Funcionario;
import erp.interfaces.DAO.IFuncionarioDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Deyvid Yancey
 */
public class FuncionarioDAO implements IFuncionarioDAO {

    private Connection con;

    public FuncionarioDAO() {
        this.con = new ConnectionFactory().getConnection();

    }

    @Override
    public void adicionarFuncionario(Funcionario obj) {
        try {
            String sql = "insert into funcionario (nome, rg, cpf, endereco, cep, cidade,"
                    + "uf, numero, bairro, login, senha, niveldeacesso) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
            stm.setString(10, obj.getLogin());
            stm.setString(11, obj.getSenha());
            stm.setString(12, obj.getNivelDeAcesso());
            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no metodo de adicionar" + e);
        }

    }

    @Override
    public void updateFuncionario(Funcionario obj) {
        try {
            String sql = "update funcionario set nome = ?, rg =?, cpf=?, login =?, senha =?, nivelDeAcesso = ?, endereco=?, cep=?, cidade=?, uf=?, numero=?, bairro=? where id =?";

            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, obj.getNome());
            stm.setString(2, obj.getRg());
            stm.setString(3, obj.getCpf());
            stm.setString(4, obj.getLogin());
            stm.setString(5, obj.getSenha());
            stm.setString(6, obj.getNivelDeAcesso());
            stm.setString(7, obj.getEndereco());
            stm.setString(8, obj.getCep());
            stm.setString(9, obj.getCidade());
            stm.setString(10, obj.getUf());
            stm.setString(11, obj.getNumero());
            stm.setString(12, obj.getBairro());
            stm.setInt(13, obj.getId());

            stm.execute();
            stm.close();

            JOptionPane.showMessageDialog(null, "Alteração efetuada com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar funcionario! " + e);
        }
    }

    @Override
    public void deletarFuncionario(Funcionario obj) {
        try {
            String sql = "delete from funcionario where id=?";
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
    public List<Funcionario> listarFuncionario() {
        try {
            List<Funcionario> lista = new ArrayList<>();
            String sql = "Select * from funcionario";
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Funcionario obj = new Funcionario();
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
                obj.setLogin(rs.getString("login"));
                obj.setSenha(rs.getString("senha"));
                obj.setNivelDeAcesso(rs.getString("niveldeacesso"));
                lista.add(obj);

            }
            return lista;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar Funcionario " + e);
        }
        return null;
    }

    @Override
    public List<Funcionario> buscarFuncionarioPorNome(String nome) {
        try {
            List<Funcionario> lista = new ArrayList<>();
            String sql = "Select * from funcionario where nome like  ? ";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Funcionario obj = new Funcionario();
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
                obj.setLogin(rs.getString("login"));
                obj.setSenha(rs.getString("senha"));
                obj.setNivelDeAcesso(rs.getString("niveldeacesso"));
                lista.add(obj);
            }

            return lista;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO AO PESQUISAR CLIENTE POR NOME NO DAO" + e);
            return null;
        }
    }

}
