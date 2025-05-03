package br.com.fiap.CP2.dao;

import br.com.fiap.CP2.model.Brinquedo;
import jakarta.transaction.Transactional;

public interface BrinquedoDAO {
    public Brinquedo buscar(int id);
    public void salvar(Brinquedo brinquedo) ;
    public void atualizar(int id, Brinquedo brinquedo);
    public void commit();
}
