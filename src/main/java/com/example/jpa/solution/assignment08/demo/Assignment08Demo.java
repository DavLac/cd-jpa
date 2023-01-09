package com.example.jpa.solution.assignment08.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * Assignment 08: JPQL
 **/
public class Assignment08Demo {

    private static final EntityManagerFactory entityManagerFactory = Persistence
            .createEntityManagerFactory("assignment-08");
    private static final EntityManager entityManager = entityManagerFactory
            .createEntityManager();

    public void persistNewEntities() {
        entityManager.getTransaction().begin();
        entityManager.persist(new Customr("Name"));
        entityManager.getTransaction().commit();
    }

    public Customr findCustomerByName(final String name) {
        final Query q = entityManager.createNamedQuery("Customr.findByName");
        q.setParameter(1, name);
        return (Customr) q.getResultList().get(0);
    }
}
