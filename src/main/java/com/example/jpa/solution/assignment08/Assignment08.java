package com.example.jpa.solution.assignment08;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Assignment 08: JPQL
 **/
public class Assignment08 {

    private static final EntityManagerFactory entityManagerFactory = Persistence
            .createEntityManagerFactory("assignment-08");
    private static final EntityManager entityManager = entityManagerFactory
            .createEntityManager();

    public List<RentalContract2> findAllContractsFromPeopleFromUtrecht() {
        final var query = entityManager.createQuery("<YOUR QUERY GOES HERE>", RentalContract2.class);

        return query.getResultList();
    }

    public List<Customer5> findAllPeopleThatRentedFordCars() {
        final var query = entityManager.createQuery("<YOUR QUERY GOES HERE>", Customer5.class);

        return query.getResultList();
    }

    public List<Customer5> findAllPeopleThatRentedAtLeastTwoDifferentCars() {
        final var query = entityManager.createQuery("<YOUR QUERY GOES HERE>", Customer5.class);

        return query.getResultList();
    }
}
