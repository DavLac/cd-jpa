package com.example.jpa.solution.assignment04;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Assignment 04: UPDATE queries
 * Add correct queries to the class methods
 **/
public class Assignment04 {

    private static final EntityManagerFactory entityManagerFactory = Persistence
            .createEntityManagerFactory("assignment-04");
    private static final EntityManager entityManager = entityManagerFactory
            .createEntityManager();

    public Car getById(final Integer id) {
        final var query = entityManager.createQuery("SELECT c FROM Car c WHERE c.id = :id", Car.class);

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
