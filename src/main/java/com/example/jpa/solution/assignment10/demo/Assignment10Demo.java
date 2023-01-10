package com.example.jpa.solution.assignment10.demo;

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
    final ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
    final Validator validator = validatorFactory.getValidator();

    public final List<MyUser> entityList = List.of(
            new MyUser(1L, "myName", List.of("note1", "note2")),
            new MyUser(null, "m", List.of())
    );

    public List<String> validateMyUser(final MyUser myUser) {
        final var constraintViolations = validator.validate(myUser);
        return constraintViolations.stream().map(ConstraintViolation::getMessage).collect(Collectors.toList());
    }

}
