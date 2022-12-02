package com.classes.BO;

import java.util.List;

import com.classes.DAO.PessoaDAO;
import com.classes.DTO.Pessoa;

public class PessoaBO {

    public boolean inserir(Pessoa pessoa){
        if (existe(pessoa) != true) {
        	PessoaDAO pessoasDAO = new PessoaDAO();
            return pessoasDAO.inserir(pessoa);
        }
        return false;
    }
    public boolean alterar(Pessoa pessoa){
    	PessoaDAO pessoasDAO = new PessoaDAO();
        return pessoasDAO.alterar(pessoa);
    }
    public boolean excluir(Pessoa pessoa){
    	PessoaDAO pessoasDAO = new PessoaDAO();
        return pessoasDAO.excluir(pessoa);
    }
    public Pessoa procurarPorCpf(Pessoa pessoa){
    	PessoaDAO pessoasDAO = new PessoaDAO();
        return pessoasDAO.procurarPorCpf(pessoa);
    }
    public Pessoa procurarPorNome(Pessoa pessoa){
    	PessoaDAO pessoasDAO = new PessoaDAO();
        return pessoasDAO.procurarPorNome(pessoa);
    }
    public boolean existe(Pessoa pessoa){
        PessoaDAO pessoasDAO = new PessoaDAO();
        return pessoasDAO.existe(pessoa);
    }
    public List<Pessoa> pesquisarTodos(){
        PessoaDAO pessoasDAO = new PessoaDAO();
        return pessoasDAO.pesquisarTodos();
    
}
}
