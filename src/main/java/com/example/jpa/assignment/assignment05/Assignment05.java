package com.example.jpa.assignment.assignment05;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Assignment 05: DELETE queries
 * Add correct queries to the class methods
 **/
public class Assignment05 {

    private static final EntityManagerFactory entityManagerFactory = Persistence
            .createEntityManagerFactory("assignment-05");
    private static final EntityManager entityManager = entityManagerFactory
            .createEntityManager();

    public List<Car2> findAll() {
        final var query = entityManager.createQuery("SELECT c FROM nl.yoink.courses.dev.java.jpa.assignments.assignment05.Car2 c", Car2.class);

        return query.getResultList();
    }

    public int deleteById(final Integer id) {
        entityManager.getTransaction().begin();
        final var query = entityManager.createQuery("<ADD YOUR OWN QUERY HERE>");

        final var result = query.executeUpdate();
        entityManager.flush();
        entityManager.getTransaction().commit();
        entityManager.clear();
        return result;
    }
}
