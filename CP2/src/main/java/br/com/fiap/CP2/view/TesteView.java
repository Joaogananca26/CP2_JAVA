package br.com.fiap.CP2.view;

import br.com.fiap.CP2.dao.BrinquedoDAOImpl;
import br.com.fiap.CP2.model.Brinquedo;
import br.com.fiap.CP2.model.Tamanho;
import br.com.fiap.CP2.singleton.EntityManagerFactorySingleton;
import jakarta.persistence.EntityManager;
import org.springframework.web.bind.annotation.RequestBody;

public class TesteView {
    public static void main(String[] args) {
        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

        BrinquedoDAOImpl dao = new BrinquedoDAOImpl(em);

            Brinquedo brinquedo = new Brinquedo();
            brinquedo.setNome("jorge");
            brinquedo.setPreco(123.21);
            brinquedo.setTamanho(Tamanho.pequeno);
            brinquedo.setTipo("boneco");
            brinquedo.setClassificacao(18);

        try{
            dao.salvar(brinquedo);
            dao.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        }
}

