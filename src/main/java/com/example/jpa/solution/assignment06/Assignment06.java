package com.example.jpa.solution.assignment06;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Assignment 06: Associations
 **/
public class Assignment06 {

    private final EntityManager entityManager;

    public Assignment06(final EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<RentalContract> findAllRentalContracts() {
        final var query = entityManager.createQuery("SELECT c FROM nl.yoink.courses.dev.java.jpa.assignments.assignment06.RentalContract c", RentalContract.class);

        return query.getResultList();
    }
}
