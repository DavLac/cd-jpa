package com.example.jpa.solution.assignment03;

import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;
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

    @Transactional
    public void testPersistNewObject() {
        Contact newContact = new Contact();
        newContact.setName("John Doe");
        newContact.setEmail("john.doe@gmail.com");
        newContact.setAddress("Fremont, CA");
        newContact.setPhone("123456-2111");

        boolean entityManaged = entityManager.contains(newContact);
        System.out.println("Before persist, entity managed: " + entityManaged);

        entityManager.persist(newContact);

        entityManaged = entityManager.contains(newContact);
        System.out.println("After persist, entity managed: " + entityManaged);
    }

    public List<Customer2> findAll() {
        final var query = entityManager.createQuery("SELECT c FROM Customer2 c", Customer2.class);

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
