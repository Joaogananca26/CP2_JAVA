package br.com.fiap.CP2.singleton;


import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class EntityManagerFactorySingleton {
    private static EntityManagerFactory em;

    private EntityManagerFactorySingleton(){}

    public static EntityManagerFactory getInstance(){
        if(em == null)
            em = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
        return em;
    }
}
