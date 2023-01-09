package com.example.jpa.assignment.assignment07;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Assignment 07: Inheritance
 **/
public class Assignment07 {

    private static final EntityManagerFactory entityManagerFactory = Persistence
            .createEntityManagerFactory("assignment-07");
    private static final EntityManager entityManager = entityManagerFactory
            .createEntityManager();

    public List<PrivateCustomer> findAllPrivateCustomers() {
        final var query = entityManager.createQuery("SELECT c FROM nl.yoink.courses.dev.java.jpa.assignments.assignment07.PrivateCustomer c", PrivateCustomer.class);

        return query.getResultList();
    }

    public List<CompanyCustomer> findAllCompanyCustomers() {
        final var query = entityManager.createQuery("SELECT c FROM nl.yoink.courses.dev.java.jpa.assignments.assignment07.CompanyCustomer c", CompanyCustomer.class);

        return query.getResultList();
    }
}
