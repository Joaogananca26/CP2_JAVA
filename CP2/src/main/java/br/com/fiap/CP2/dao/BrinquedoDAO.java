package br.com.fiap.CP2.dao;

import br.com.fiap.CP2.exceptions.CommitException;
import br.com.fiap.CP2.exceptions.IdNaoEncontradoException;
import br.com.fiap.CP2.model.Brinquedo;

import java.util.List;

public interface BrinquedoDAO extends GenericDao<Brinquedo,Integer>{
    Brinquedo atualizar(Integer id, Brinquedo brinquedo);
}
