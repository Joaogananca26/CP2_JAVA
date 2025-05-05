package br.com.fiap.CP2.dao;

import br.com.fiap.CP2.model.Brinquedo;
import jakarta.transaction.Transactional;

import java.util.List;

public interface BrinquedoDAO {
    public Brinquedo buscar(int id);
    public List<Brinquedo> buscarTodos();
    public void salvar(Brinquedo brinquedo) ;
    public void atualizar(int id, Brinquedo brinquedo);
    public void commit();
}
