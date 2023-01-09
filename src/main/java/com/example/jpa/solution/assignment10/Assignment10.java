package com.example.jpa.solution.assignment10;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Assignment 10: Bean Validation
 **/
public class Assignment10 {
    final static ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
    final static Validator validator = validatorFactory.getValidator();


    public List<String> validateCustomer(final Customer7 customer) {
        final var constraintViolations = validator.validate(customer);

        return constraintViolations.stream().map(ConstraintViolation::getMessage).collect(Collectors.toList());
    }

}
