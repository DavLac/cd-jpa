package com.example.jpa.solution.assignment07;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Assignment 07: Inheritance
 **/
public class Assignment07 {

    private final EntityManager entityManager;

    public Assignment07(final EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<PrivateCustomer> findAllPrivateCustomers() {
        final var query = entityManager.createQuery("SELECT c FROM nl.yoink.courses.dev.java.jpa.assignments.assignment07.PrivateCustomer c", PrivateCustomer.class);

        return query.getResultList();
    }

    public List<CompanyCustomer> findAllCompanyCustomers() {
        final var query = entityManager.createQuery("SELECT c FROM nl.yoink.courses.dev.java.jpa.assignments.assignment07.CompanyCustomer c", CompanyCustomer.class);

        return query.getResultList();
    }
}
