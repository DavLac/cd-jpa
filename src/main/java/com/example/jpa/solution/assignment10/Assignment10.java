package com.example.jpa.solution.assignment10;

import com.example.jpa.solution.assignment10.demo.MyUser;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Assignment 10: Bean Validation
 * Annotate the Customer class correctly so that the following validations are correctly performed:
 *
 * • name should be between 2 and 45 characters
 * • age should be between 18 and 150
 * • email field should be valid
 **/
public class Assignment10 {
    final static ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
    final static Validator validator = validatorFactory.getValidator();

    public final List<Customer7> entityList = List.of(
            new Customer7(1, "bob", 25, "bob.moran@google.com"),
            new Customer7(null, "m", 17, "google.com")
    );

    public List<String> validateCustomer(final Customer7 customer) {
        final var constraintViolations = validator.validate(customer);

        return constraintViolations.stream().map(ConstraintViolation::getMessage).collect(Collectors.toList());
    }

}
