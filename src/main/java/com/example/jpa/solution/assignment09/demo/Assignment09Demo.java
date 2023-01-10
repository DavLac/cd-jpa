package com.example.jpa.solution.assignment09.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Assignment09Demo {

    private static final EntityManagerFactory entityManagerFactory = Persistence
            .createEntityManagerFactory("assignment-09");
    private static final EntityManager entityManager = entityManagerFactory
            .createEntityManager();

    public void persistNewEntities() {
        entityManager.getTransaction().begin();
        entityManager.persist(new Cus("marco"));
        entityManager.persist(new Cus("polo"));
        entityManager.getTransaction().commit();
    }
}
