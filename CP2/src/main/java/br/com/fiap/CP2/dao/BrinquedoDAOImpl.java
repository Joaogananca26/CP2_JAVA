package br.com.fiap.CP2.dao;

import br.com.fiap.CP2.model.Brinquedo;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BrinquedoDAOImpl implements BrinquedoDAO {

    @Autowired
    private EntityManager em;

    @Override
    public Brinquedo buscar(int id) {
        return em.find(Brinquedo.class, id);
    }

    @Override
    @Transactional
    public void salvar(Brinquedo brinquedo) {
        em.persist(brinquedo);
    }

    @Override
    @Transactional
    public void atualizar(int id, Brinquedo brinquedo) {
        Brinquedo brinquedoExistente = em.find(Brinquedo.class, id);
        if (brinquedoExistente != null) {
            brinquedoExistente.setNome(brinquedo.getNome());
            brinquedoExistente.setPreco(brinquedo.getPreco());
            brinquedoExistente.setTamanho(brinquedo.getTamanho());
            brinquedoExistente.setTipo(brinquedo.getTipo());
            brinquedoExistente.setClassificacao(brinquedo.getClassificacao());
            em.merge(brinquedoExistente);
        }
    }

    @Override
    @Transactional
    public void commit() {
    }

}