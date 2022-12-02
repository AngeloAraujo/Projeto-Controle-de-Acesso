package com.classes.BO;

import com.classes.DTO.Visitante;
import com.classes.DAO.VisitanteDAO;
import java.util.List;

public class VisitanteBO {

    public boolean inserir(Visitante visitante){
        if (existe(visitante) != true) {
        	VisitanteDAO visitantesDAO = new VisitanteDAO();
            return visitantesDAO.inserir(visitante);
        }
        return false;
    }
    public boolean alterar(Visitante visitante){
    	VisitanteDAO visitantesDAO = new VisitanteDAO();
        return visitantesDAO.alterar(visitante);
    }
    public boolean excluir(Visitante visitante){
    	VisitanteDAO visitantesDAO = new VisitanteDAO();
        return visitantesDAO.excluir(visitante);
    }
    public Visitante procurarPorCodigo(Visitante visitante){
    	VisitanteDAO visitantesDAO = new VisitanteDAO();
        return visitantesDAO.procurarPorCodigo(visitante);
    }
    public Visitante procurarPorCidade (Visitante visitante){
    	VisitanteDAO funcionariosDAO = new VisitanteDAO();
        return funcionariosDAO.procurarPorCidade(visitante);
    }
    public boolean existe(Visitante visitante){
    	VisitanteDAO visitantesDAO = new VisitanteDAO();
        return visitantesDAO.existe(visitante);
    }
    public List<Visitante> pesquisarTodos(){
    	VisitanteDAO visitantesDAO = new VisitanteDAO();
        return visitantesDAO.pesquisarTodos();
    }
}
