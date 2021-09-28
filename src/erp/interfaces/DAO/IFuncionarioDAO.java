/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.interfaces.DAO;

import erp.OBJECTS.Funcionario;
import java.util.List;

/**
 *
 * @author Deyvid Yancey
 */
public interface IFuncionarioDAO {
    public void adicionarFuncionario(Funcionario obj) ;
    public void updateFuncionario (Funcionario obj);
    public void deletarFuncionario (Funcionario obj);
    public List<Funcionario> listarFuncionario();
    public List<Funcionario> buscarFuncionarioPorNome(String nome);
}
