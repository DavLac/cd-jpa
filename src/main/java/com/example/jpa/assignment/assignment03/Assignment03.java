package com.example.jpa.assignment.assignment03;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Assignment 03: SELECT queries
 * Add correct queries to the class methods
 **/
public class Assignment03 {
    private static final EntityManagerFactory entityManagerFactory = Persistence
            .createEntityManagerFactory("assignment-03");
    private static final EntityManager entityManager = entityManagerFactory
            .createEntityManager();

    public List<Customer2> findAll() {
        final var query = entityManager.createQuery("<ADD YOUR OWN QUERY HERE>", Customer2.class);

        return query.getResultList();
    }

    public Customer2 getById(final int id) {
        final var query = entityManager.createQuery("<ADD YOUR OWN QUERY HERE>", Customer2.class);

        return query.getSingleResult();
    }

    public List<Customer2> getByMaxAge(final int maxAge) {
        final var query = entityManager.createQuery("<ADD YOUR OWN QUERY HERE>", Customer2.class);

        return query.getResultList();
    }
}
