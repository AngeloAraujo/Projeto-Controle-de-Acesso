package com.classes.BO;

import com.classes.DTO.Funcionario;
import com.classes.DAO.FuncionarioDAO;
import java.util.List;

public class FuncionarioBO {

    public boolean inserir(Funcionario funcionario){
        if (existe(funcionario) != true) {
        	FuncionarioDAO funcionariosDAO = new FuncionarioDAO();
            return funcionariosDAO.inserir(funcionario);
        }
        return false;
    }
    public boolean alterar(Funcionario funcionario){
    	FuncionarioDAO funcionariosDAO = new FuncionarioDAO();
        return funcionariosDAO.alterar(funcionario);
    }
    public boolean excluir(Funcionario funcionario){
    	FuncionarioDAO funcionariosDAO = new FuncionarioDAO();
        return funcionariosDAO.excluir(funcionario);
    }
    public Funcionario procurarPorCodigo(Funcionario funcionario){
    	FuncionarioDAO funcionariosDAO = new FuncionarioDAO();
        return funcionariosDAO.procurarPorCodigo(funcionario);
    }
    public Funcionario procurarPorTipo(Funcionario funcionario){
    	FuncionarioDAO funcionariosDAO = new FuncionarioDAO();
        return funcionariosDAO.procurarPorTipo(funcionario);
    }
    public boolean existe(Funcionario funcionario){
    	FuncionarioDAO funcionariosDAO = new FuncionarioDAO();
        return funcionariosDAO.existe(funcionario);
    }
    public List<Funcionario> pesquisarTodos(){
    	FuncionarioDAO funcionariosDAO = new FuncionarioDAO();
        return funcionariosDAO.pesquisarTodos();
    }
}
