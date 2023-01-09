package com.example.jpa.solution.assignment06;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Assignment 06: Associations
 **/
public class Assignment06 {

    private static final EntityManagerFactory entityManagerFactory = Persistence
            .createEntityManagerFactory("assignment-06");
    private static final EntityManager entityManager = entityManagerFactory
            .createEntityManager();

    private final List<Car3> entityList = List.of(
            new Car3("Ford", "Focus", 10_000, 15_000, 1234L),
            new Car3("Mercedes", "E", 100_000, 150_000, 456L),
            new Car3("BMW", "Xcs", 180_000, 18_000, 789L),
            new Car3("Fiat", "500", 80_000, 8_000, 108L)
    );

    private final List<Customer3> customerList = List.of(
            new Customer3("paul"),
            new Customer3("john"),
            new Customer3("david"),
            new Customer3("gabriel")
    );

    public void persistNewEntities() {
        entityManager.getTransaction().begin();
        entityList.forEach(entityManager::persist);
        customerList.forEach(entityManager::persist);
        entityManager.getTransaction().commit();

        entityManager.getTransaction().begin();
        System.out.println(getCustomerById(1));
        System.out.println(getCarById(1));
        var rentalContract = List.of(
                new RentalContract(getCustomerById(1), getCarById(1), 1, 2)
        );

        rentalContract.forEach(entityManager::persist);
        entityManager.getTransaction().commit();
    }

    public Car3 getCarById(final Integer id) {
        final var query = entityManager.createQuery("SELECT c FROM Car3 c WHERE c.id = :id", Car3.class);

        Car3 response = query
                .setParameter("id", id)
                .getSingleResult();
        entityManager.refresh(response);
        return response;
    }

    public Customer3 getCustomerById(final Integer id) {
        final var query = entityManager.createQuery("SELECT c FROM Customer3 c WHERE c.id = :id", Customer3.class);

        Customer3 response = query
                .setParameter("id", id)
                .getSingleResult();
        entityManager.refresh(response);
        return response;
    }

    public List<RentalContract> findAllRentalContracts() {
        final var query = entityManager.createQuery("SELECT c FROM RentalContract c", RentalContract.class);

        return query.getResultList();
    }
}
