package br.com.fiap.CP2.dao;


import br.com.fiap.CP2.exceptions.IdNaoEncontradoException;
import br.com.fiap.CP2.model.Brinquedo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


public class BrinquedoDAOImpl extends GenericDaoImpl<Brinquedo,Integer> implements BrinquedoDAO {
	public BrinquedoDAOImpl(EntityManager em){super(em);}

	@PersistenceContext
	private EntityManager em;

	public Brinquedo atualizar(Integer id, Brinquedo brinquedo) {
		try {

			Brinquedo brinquedoExistente = em.find(Brinquedo.class, id);
			if (brinquedoExistente != null) {

				brinquedoExistente.setNome(brinquedo.getNome());
				brinquedoExistente.setPreco(brinquedo.getPreco());
				brinquedoExistente.setTamanho(brinquedo.getTamanho());
				brinquedoExistente.setTipo(brinquedo.getTipo());
				brinquedoExistente.setClassificacao(brinquedo.getClassificacao());

				return em.merge(brinquedoExistente);
			} else {
				throw new IdNaoEncontradoException("Brinquedo não encontrado!");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}