package com.example.jpa.solution.assignment02;

import javax.persistence.*;
import java.util.Objects;

/**
 * Assignment 02: JPA Annotations
 * Add correct JPA entity annotations to Customer class
 **/

@Entity
@Table(name = "CUSTOMERS")
public class Customer {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "name")
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
