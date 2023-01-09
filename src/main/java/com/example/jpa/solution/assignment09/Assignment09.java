package com.example.jpa.solution.assignment09;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Assignment09 {

    private static final EntityManagerFactory entityManagerFactory = Persistence
            .createEntityManagerFactory("assignment-09");
    private static final EntityManager entityManager = entityManagerFactory
            .createEntityManager();

    public static void main(final String[] args) {

        final var cars = findAll();
        cars.forEach(System.out::println);
    }

    public static List<Car6> findAll() {
        final var query = entityManager.createQuery("SELECT c FROM Car c", Car6.class);

        return query.getResultList();
    }
}
