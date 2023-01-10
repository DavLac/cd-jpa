package com.example.jpa.solution.assignment09;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Each time a Car is retrieved from the database, its details are printed to the console
 */
public class Assignment09 {

    private static final EntityManagerFactory entityManagerFactory = Persistence
            .createEntityManagerFactory("assignment-09");
    private static final EntityManager entityManager = entityManagerFactory
            .createEntityManager();

    private final List<Car6> entityList = List.of(
            new Car6("Ford", "Focus", 10_000, 15_000, 1234L),
            new Car6("Mercedes", "E", 100_000, 150_000, 456L),
            new Car6("BMW", "Xcs", 180_000, 18_000, 789L),
            new Car6("Fiat", "500", 80_000, 8_000, 108L)
    );

    public void persistNewEntities() {
        entityManager.getTransaction().begin();
        entityList.forEach(entityManager::persist);
        entityManager.getTransaction().commit();
    }

    public List<Car6> findAll() {
        final var query = entityManager.createQuery("SELECT c FROM Car6 c", Car6.class);

        return query.getResultList();
    }
}
