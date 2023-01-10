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
    private List<Car2> carList = List.of(
            new Car2("Ford", "Focus", 937, 460, 560L),
            new Car2("Volkswagen", "Golf", 480, 358, 295L),
            new Car2("Tesla", "S", 395, 894, 823L)
    );

    public void persistNewCars() {
        carList.forEach(c -> {
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
        final var query = entityManager.createQuery("DELETE FROM Car2 where id = :id")
                .setParameter("id", id);

        final var result = query.executeUpdate();
        entityManager.flush();
        entityManager.getTransaction().commit();
        entityManager.clear();
        return result;
    }
}
