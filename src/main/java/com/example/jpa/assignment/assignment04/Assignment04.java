package com.example.jpa.assignment.assignment04;

import com.example.jpa.assignment.assignment03.Customer2;

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
    private List<Car> carList = List.of(
            new Car("Ford", "Focus", 937, 460, 560L),
            new Car("Volkswagen", "Golf", 480, 358, 295L),
            new Car("Tesla", "S", 395, 894, 823L)
    );
    public void persistNewCars() {
        carList.forEach(c -> {
            entityManager.getTransaction().begin();
            entityManager.persist(c);
            entityManager.getTransaction().commit();
        });
    }

    public Assignment04() {
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
        final var query = entityManager.createQuery("UPDATE Car SET mileage = :mileage WHERE id = :id")
                .setParameter("mileage", newMileage)
                .setParameter("id", id);

        final var result = query.executeUpdate();
        entityManager.flush();
        entityManager.getTransaction().commit();
        return result;
    }

    public int updateRemainingValue(final Integer id, final Integer newRemainingValue) {
        entityManager.getTransaction().begin();
        final var query = entityManager.createQuery("UPDATE Car SET value = :value WHERE id = :id")
                .setParameter("value", newRemainingValue)
                .setParameter("id", id);

        final var result = query.executeUpdate();
        entityManager.flush();

        entityManager.getTransaction().commit();
        return result;
    }

    public int updateLastCleaned(final Integer id, final Long newLastCleaned) {
        entityManager.getTransaction().begin();
        final var query = entityManager.createQuery("UPDATE Car SET last_cleaned = :lastCleaned WHERE id = :id")
                .setParameter("lastCleaned", newLastCleaned)
                .setParameter("id", id);

        final var result = query.executeUpdate();
        entityManager.flush();

        entityManager.getTransaction().commit();

        return result;
    }
}
