package com.example.jpa.solution.assignment08;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Assignment 08: JPQL
 **/
public class Assignment08 {

    private final EntityManager entityManager;

    public Assignment08(final EntityManager entityManager) {
        this.entityManager = entityManager;
    }

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
