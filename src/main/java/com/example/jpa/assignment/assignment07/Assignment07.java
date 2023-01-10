package com.example.jpa.assignment.assignment07;

import com.example.jpa.assignment.assignment06.Customer3;

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
    private List<CompanyCustomer> companyCustomerList = List.of(
            new CompanyCustomer("Shell", 123L),
            new CompanyCustomer("Coca Cola", 234L),
            new CompanyCustomer("Ferrari", 345L),
            new CompanyCustomer("Unilever", 456L)
    );
    private List<PrivateCustomer> privateCustomerList = List.of(
            new PrivateCustomer("Jasper", 123),
            new PrivateCustomer("Niels", 234),
            new PrivateCustomer("David", 345),
            new PrivateCustomer("Marc", 456),
            new PrivateCustomer("Ollie", 567),
            new PrivateCustomer("Tim", 678),
            new PrivateCustomer("Niek", 789)
    );

    public void persistNewEntities() {
        companyCustomerList.forEach(c -> {
            entityManager.getTransaction().begin();
            entityManager.persist(c);
            entityManager.getTransaction().commit();
        });

        privateCustomerList.forEach(c -> {
            entityManager.getTransaction().begin();
            entityManager.persist(c);
            entityManager.getTransaction().commit();
        });
    }

    public List<PrivateCustomer> findAllPrivateCustomers() {
        final var query = entityManager.createQuery("SELECT c FROM PrivateCustomer c", PrivateCustomer.class);

        return query.getResultList();
    }

    public List<CompanyCustomer> findAllCompanyCustomers() {
        final var query = entityManager.createQuery("SELECT c FROM CompanyCustomer c", CompanyCustomer.class);

        return query.getResultList();
    }
}
