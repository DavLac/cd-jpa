package com.example.jpa.solution.assignment04;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Assignment 04: UPDATE queries
 * Add correct queries to the class methods
 **/
public class Assignment04 {

    private static final EntityManagerFactory entityManagerFactory = Persistence
            .createEntityManagerFactory("assignment-04");
    private static final EntityManager entityManager = entityManagerFactory
            .createEntityManager();

    private final List<Car> entityList = List.of(
            new Car("Ford", "Focus", 10_000, 15_000, 1234L),
            new Car("Mercedes", "E", 100_000, 150_000, 456L),
            new Car("BMW", "Xcs", 180_000, 18_000, 789L),
            new Car("Fiat", "500", 80_000, 8_000, 108L)
    );

    public void persistNewEntities() {
        entityList.forEach(c -> {
            entityManager.getTransaction().begin();
            entityManager.persist(c);
            entityManager.getTransaction().commit();
        });
    }

    public Car getById(final Integer id) {
        final var query = entityManager.createQuery("SELECT c FROM Car c WHERE c.id = :id", Car.class);

        Car response = query
                .setParameter("id", id)
                .getSingleResult();
        entityManager.refresh(response);
        return response;
    }

    public int updateMileage(final Integer id, final Integer newMileage) {
        entityManager.getTransaction().begin();
        final var result = entityManager.createQuery("UPDATE Car " +
                        "SET mileage = :newMileage " +
                        "WHERE id = :id")
                .setParameter("newMileage", newMileage)
                .setParameter("id", id)
                .executeUpdate();
        entityManager.flush();
        entityManager.getTransaction().commit();
        return result;
    }

    public int updateRemainingValue(final Integer id, final Integer newRemainingValue) {
        entityManager.getTransaction().begin();
        final var result = entityManager.createQuery("UPDATE Car " +
                        "SET value = :newRemainingValue " +
                        "WHERE id = :id")
                .setParameter("newRemainingValue", newRemainingValue)
                .setParameter("id", id)
                .executeUpdate();
        entityManager.flush();
        entityManager.getTransaction().commit();
        return result;
    }

    public int updateLastCleaned(final Integer id, final Long newLastCleaned) {
        entityManager.getTransaction().begin();
        final var result = entityManager.createQuery("UPDATE Car " +
                        "SET lastCleaned = :newLastCleaned " +
                        "WHERE id = :id")
                .setParameter("newLastCleaned", newLastCleaned)
                .setParameter("id", id)
                .executeUpdate();
        entityManager.flush();
        entityManager.getTransaction().commit();
        return result;
    }
}
