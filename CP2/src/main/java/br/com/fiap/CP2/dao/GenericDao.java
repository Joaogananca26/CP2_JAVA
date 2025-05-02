package br.com.fiap.CP2.dao;


import br.com.fiap.CP2.exceptions.CommitException;
import br.com.fiap.CP2.exceptions.IdNaoEncontradoException;
import br.com.fiap.CP2.model.Brinquedo;

import java.util.List;

public interface GenericDao<T,K> {

	T salvar(T entidade);
	
	void remover(K id) throws IdNaoEncontradoException;
	
	T buscar(K id) throws IdNaoEncontradoException;
	
	void commit() throws CommitException;

	List<T> buscarTodosBrinquedos();
}