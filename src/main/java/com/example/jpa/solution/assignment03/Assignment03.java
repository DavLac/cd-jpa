package com.example.jpa.solution.assignment03;

import com.example.jpa.solution.assignment03.demo.Beer;
import com.example.jpa.solution.assignment03.demo.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Assignment 03: SELECT queries
 * Add correct queries to the class methods
 **/
public class Assignment03 {
    private static final EntityManagerFactory entityManagerFactory = Persistence
            .createEntityManagerFactory("assignment-03");

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

    private final List<Customer2> customer2List = List.of(
            new Customer2("paul", 25),
            new Customer2("john", 35),
            new Customer2("david", 15),
            new Customer2("gabriel", 45),
            new Customer2("eva", 40),
            new Customer2("lucy", 33),
            new Customer2("mary", 34)
    );

    public void persistNewCustomers() {
        customer2List.forEach(c -> {
            entityManager.getTransaction().begin();
            entityManager.persist(c);
            entityManager.getTransaction().commit();
        });
    }

    public List<Customer2> findAll() {
        final var query = entityManager.createQuery("SELECT c FROM Customer2 c", Customer2.class);

        return query.getResultList();
    }

    public Customer2 getById(final int id) {
        final var query = entityManager.createQuery("SELECT c FROM Customer2 c WHERE c.id = :id", Customer2.class);

        return query
                .setParameter("id", id)
                .getSingleResult();
    }

    public List<Customer2> getByMaxAge(final int maxAge) {
        final var query = entityManager.createQuery("SELECT c FROM Customer2 c WHERE c.age <= :maxAge", Customer2.class);

        return query
                .setParameter("maxAge", maxAge)
                .getResultList();
    }
}
