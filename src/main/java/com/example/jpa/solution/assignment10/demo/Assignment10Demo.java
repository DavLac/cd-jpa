package com.example.jpa.solution.assignment10.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Assignment 10: Bean Validation
 **/
public class Assignment10Demo {

    private static final EntityManagerFactory entityManagerFactory = Persistence
            .createEntityManagerFactory("assignment-09");
    private static final EntityManager entityManager = entityManagerFactory
            .createEntityManager();
    final ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
    final Validator validator = validatorFactory.getValidator();

    public final List<MyUser> entityList = List.of(
            new MyUser(1L, "myName", List.of("note1", "note2")),
            new MyUser(null, "m", List.of())
    );

    public final List<MyUser2> entityList2 = List.of(
            new MyUser2("myName"),
            new MyUser2( "m")
    );

    public void persistNewEntities() {
        try{
            entityManager.getTransaction().begin();
            entityList2.forEach(entityManager::persist);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<String> validateMyUser(final MyUser myUser) {
        final var constraintViolations = validator.validate(myUser);
        return constraintViolations.stream().map(ConstraintViolation::getMessage).collect(Collectors.toList());
    }

}
