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

    public List<RentalContract> findAllRentalContracts() {
        final var query = entityManager.createQuery("SELECT c FROM RentalContract c", RentalContract.class);

        return query.getResultList();
    }
}
