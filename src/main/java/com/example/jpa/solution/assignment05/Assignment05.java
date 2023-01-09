package com.example.jpa.solution.assignment05;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Assignment 05: DELETE queries
 * Add correct queries to the class methods
 **/
public class Assignment05 {

    private final EntityManager entityManager;

    public Assignment05(final EntityManager entityManager) {
        this.entityManager = entityManager;
    }

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
