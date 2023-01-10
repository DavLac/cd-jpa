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
    private List<Customer2>  customer2List = List.of(
            new Customer2("Jasper", 32),
            new Customer2("Niels", 25),
            new Customer2("David", 34),
            new Customer2("Marc", 30),
            new Customer2("Ollie", 21),
            new Customer2("Tim", 35),
            new Customer2("Niek", 28)
    );
    public void persistNewCustomers() {
        customer2List.forEach(c -> {
            entityManager.getTransaction().begin();
            entityManager.persist(c);
            entityManager.getTransaction().commit();
        });
    }

    public List<Customer2> findAll() {
        final var query = entityManager.createQuery("SELECT c FROM Customer2 c", Customer2.class);

        return query.getResultList();
    }

    public Customer2 getById(final int id) {
        final var query = entityManager.createQuery("SELECT c FROM Customer2 c WHERE c.id = :id", Customer2.class);

        return query.setParameter("id", id).getSingleResult();
    }

    public List<Customer2> getByMaxAge(final int maxAge) {
        final var query = entityManager.createQuery("SELECT c FROM Customer2 c WHERE c.age <= :maxAge", Customer2.class);

        return query.setParameter("maxAge", maxAge).getResultList();
    }
}


