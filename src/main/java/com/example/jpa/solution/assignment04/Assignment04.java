package com.example.jpa.solution.assignment04;

import javax.persistence.EntityManager;

/**
 * Assignment 04: UPDATE queries
 * Add correct queries to the class methods
 **/
public class Assignment04 {

    private final EntityManager entityManager;

    public Assignment04(final EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Car getById(final Integer id) {
        final var query = entityManager.createQuery("SELECT c FROM nl.yoink.courses.dev.java.jpa.assignments.assignment04.Car c WHERE c.id = :id", Car.class);

        return query
                .setParameter("id", id)
                .getSingleResult();
    }

    public int updateMileage(final Integer id, final Integer newMileage) {
        entityManager.getTransaction().begin();
        final var query = entityManager.createQuery("<ADD YOUR OWN QUERY HERE>");

        final var result = query.executeUpdate();
        entityManager.flush();
        entityManager.getTransaction().commit();
        return result;
    }

    public int updateRemainingValue(final Integer id, final Integer newRemainingValue) {
        entityManager.getTransaction().begin();
        final var query = entityManager.createQuery("<ADD YOUR OWN QUERY HERE>");

        final var result = query.executeUpdate();
        entityManager.flush();

        entityManager.getTransaction().commit();
        return result;
    }

    public int updateLastCleaned(final Integer id, final Long newLastCleaned) {
        entityManager.getTransaction().begin();
        final var query = entityManager.createQuery("<ADD YOUR OWN QUERY HERE>");

        final var result = query.executeUpdate();
        entityManager.flush();

        entityManager.getTransaction().commit();

        return result;
    }
}
