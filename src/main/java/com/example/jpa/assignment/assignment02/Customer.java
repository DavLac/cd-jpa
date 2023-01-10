package com.example.jpa.assignment.assignment02;

import java.util.Objects;

/**
 * Assignment 02: JPA Annotations
 * Add correct JPA entity annotations to Customer class
 **/

public class Customer {

    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

}
