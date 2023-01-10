package com.example.jpa.solution.assignment08;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * Assignment 08: JPQL
 **/
public class Assignment08 {

    private static final EntityManagerFactory entityManagerFactory = Persistence
            .createEntityManagerFactory("assignment-08");
    private static final EntityManager entityManager = entityManagerFactory
            .createEntityManager();

    private final List<Car5> entityList = List.of(
            new Car5("Ford", "Focus", 10_000, 15_000, 1234L),
            new Car5("Mercedes", "E", 100_000, 150_000, 456L),
            new Car5("BMW", "Xcs", 180_000, 18_000, 789L),
            new Car5("Fiat", "500", 80_000, 8_000, 108L)
    );

    private final List<Customer5> customerList = List.of(
            new Customer5("paul", "Utrecht"),
            new Customer5("john", "Amsterdam"),
            new Customer5("david", "Amsterdam"),
            new Customer5("gabriel", "Utrecht")
    );

    private <T> T getEntityById(final Integer id, Class<T> clazz) {
        final var query = entityManager
                .createQuery("SELECT c FROM " + clazz.getName() + " c WHERE c.id = :id", clazz);

        T response = query
                .setParameter("id", id)
                .getSingleResult();
        entityManager.refresh(response);
        return response;
    }

    public void persistNewEntities() {
        entityManager.getTransaction().begin();
        entityList.forEach(entityManager::persist);
        customerList.forEach(entityManager::persist);

        var rentalContract = List.of(
                new RentalContract2(getEntityById(1, Customer5.class), getEntityById(1, Car5.class), 1000, 2000),
                new RentalContract2(getEntityById(1, Customer5.class), getEntityById(2, Car5.class), 2000, 3000),
                new RentalContract2(getEntityById(3, Customer5.class), getEntityById(3, Car5.class), 3000, 4000),
                new RentalContract2(getEntityById(4, Customer5.class), getEntityById(4, Car5.class), 4000, 5000)
        );

        rentalContract.forEach(entityManager::persist);
        entityManager.getTransaction().commit();
    }

    public List<RentalContract2> findAllContractsFromPeopleFromUtrecht() {
        final Query q = entityManager.createNamedQuery("RentalContract2.findByCustomerAddress", RentalContract2.class);
        q.setParameter(1, "Utrecht");
        return q.getResultList();
    }

    public List<Customer5> findAllPeopleThatRentedFordCars() {
        final Query q = entityManager.createNamedQuery("Customer5.findByRentedCarMake", Customer5.class);
        q.setParameter(1, "Ford");
        return q.getResultList();
    }

    public List<Customer5> findAllPeopleThatRentedAtLeastTwoDifferentCars() {
        final Query q = entityManager.createNamedQuery("Customer5.findAllPeopleThatRentedAtLeastXDifferentCars", Customer5.class);
        q.setParameter(1, 2L);
        return q.getResultList();
    }
}
