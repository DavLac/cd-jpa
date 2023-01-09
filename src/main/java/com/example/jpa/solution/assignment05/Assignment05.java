package com.example.jpa.solution.assignment05;

import com.example.jpa.solution.assignment04.Car;

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

    private final List<Car2> entityList = List.of(
            new Car2("Ford", "Focus", 10_000, 15_000, 1234L),
            new Car2("Mercedes", "E", 100_000, 150_000, 456L),
            new Car2("BMW", "Xcs", 180_000, 18_000, 789L),
            new Car2("Fiat", "500", 80_000, 8_000, 108L)
    );

    public void persistNewEntities() {
        entityList.forEach(c -> {
            entityManager.getTransaction().begin();
            entityManager.persist(c);
            entityManager.getTransaction().commit();
        });
    }

    public List<Car2> findAll() {
        final var query = entityManager.createQuery("SELECT c FROM Car2 c", Car2.class);

        return query.getResultList();
    }

    public int deleteById(final Integer id) {
        entityManager.getTransaction().begin();
        final var result = entityManager.createQuery("DELETE FROM Car2 where id = :id")
                .setParameter("id", id)
                .executeUpdate();
        entityManager.flush();
        entityManager.getTransaction().commit();
        entityManager.clear();
        return result;
    }
}
