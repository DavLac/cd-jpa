package com.example.jpa.solution.assignment07;

import com.example.jpa.solution.assignment05.Car2;

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

    private final List<PrivateCustomer> entityList = List.of(
            new PrivateCustomer("Name1", 1234),
            new PrivateCustomer("Name2", 4567),
            new PrivateCustomer("Name3", 7890)
    );

    private final List<CompanyCustomer> entityList2 = List.of(
            new CompanyCustomer("Name4", 159L),
            new CompanyCustomer("Name5", 753L),
            new CompanyCustomer("Name6", 147L)
    );

    public void persistNewEntities() {
        entityList.forEach(c -> {
            entityManager.getTransaction().begin();
            entityManager.persist(c);
            entityManager.getTransaction().commit();
        });

        entityList2.forEach(c -> {
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
