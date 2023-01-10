package com.example.jpa.assignment.assignment06;

import com.example.jpa.assignment.assignment03.Customer2;
import com.example.jpa.assignment.assignment05.Car2;

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
    private List<Customer3> customer3List = List.of(
            new Customer3("Jasper"),
            new Customer3("Niels"),
            new Customer3("David"),
            new Customer3("Marc"),
            new Customer3("Ollie"),
            new Customer3("Tim"),
            new Customer3("Niek")
    );
    private List<Car3> car3List = List.of(
            new Car3("Ford", "Focus", 937, 460, 560L),
            new Car3("Volkswagen", "Golf", 480, 358, 295L),
            new Car3("Tesla", "S", 395, 894, 823L)
    );


    public void persistNewCustomers() {
        customer3List.forEach(c -> {
            entityManager.getTransaction().begin();
            entityManager.persist(c);
            entityManager.getTransaction().commit();
        });
    }

    public void persistNewCars() {
        car3List.forEach(c -> {
            entityManager.getTransaction().begin();
            entityManager.persist(c);
            entityManager.getTransaction().commit();
        });
    }

    public void persistNewRentalContracts() {
        List<RentalContract> rentalContractList = List.of(
                new RentalContract(getEntityById(1, Customer3.class), getEntityById(1, Car3.class), 5, 6),
                new RentalContract(getEntityById(2, Customer3.class), getEntityById(2, Car3.class), 12, 21),
                new RentalContract(getEntityById(3, Customer3.class), getEntityById(3, Car3.class), 10, 14),
                new RentalContract(getEntityById(4, Customer3.class), getEntityById(1, Car3.class), 2, 31),
                new RentalContract(getEntityById(5, Customer3.class), getEntityById(2, Car3.class), 8, 19)
        );
        rentalContractList.forEach(c -> {
            entityManager.getTransaction().begin();
            entityManager.persist(c);
            entityManager.getTransaction().commit();
        });
    }

    private <T> T getEntityById(final Integer id, Class<T> clazz) {
        final var query = entityManager
                .createQuery("SELECT c FROM " + clazz.getName() + " c WHERE c.id = :id", clazz);

        T response = query
                .setParameter("id", id)
                .getSingleResult();
        entityManager.refresh(response);
        return response;
    }

    public List<Customer3> findAllCustomers() {
        final var query = entityManager.createQuery("SELECT c FROM Customer3 c", Customer3.class);

        return query.getResultList();
    }

    public List<Car3> findAllCars() {
        final var query = entityManager.createQuery("SELECT c FROM Car3 c", Car3.class);

        return query.getResultList();
    }

    public List<RentalContract> findAllRentalContracts() {
        final var query = entityManager.createQuery("SELECT c FROM RentalContract c", RentalContract.class);

        return query.getResultList();
    }
}
