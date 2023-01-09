package com.example.jpa.assignment.assignment06;

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
        final var query = entityManager.createQuery("SELECT c FROM nl.yoink.courses.dev.java.jpa.assignments.assignment06.RentalContract c", RentalContract.class);

        return query.getResultList();
    }
}
