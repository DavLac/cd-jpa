package com.example.jpa.solution.assignment05.demo;

import com.example.jpa.solution.assignment05.Car2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Assignment 05: DELETE queries
 * Add correct queries to the class methods
 **/
public class Assignment05Demo {

    private static final EntityManagerFactory entityManagerFactory = Persistence
            .createEntityManagerFactory("assignment-05");
    private static final EntityManager entityManager = entityManagerFactory
            .createEntityManager();

    public void persistBeer() {
        entityManager.getTransaction().begin();
        entityManager.persist(new Beer(10L, 200L));
        entityManager.getTransaction().commit();
    }

    public void persistAndGetEmployee() {
        entityManager.getTransaction().begin();
        entityManager.persist(new Employee(true, "address 1"));
        entityManager.persist(new Employee(false, "address 2"));
        entityManager.persist(new Employee(true, "address 3"));
        entityManager.persist(new Employee(false, "address 4"));
        findAllEmployees().forEach(System.out::println);
        entityManager.getTransaction().commit();
    }

    public Beer getBeerById(final Integer id) {
        final var query = entityManager.createQuery("SELECT c FROM Beer c WHERE c.id = :id", Beer.class);

        Beer response = query
                .setParameter("id", id)
                .getSingleResult();
        entityManager.refresh(response);
        return response;
    }

    public List<Employee> findAllEmployees() {
        final var query = entityManager.createQuery("SELECT c FROM Employee c", Employee.class);

        return query.getResultList();
    }
}
