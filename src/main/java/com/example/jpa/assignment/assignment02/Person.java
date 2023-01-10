package com.example.jpa.assignment.assignment02;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "persons") // optionally specify custom table name
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Column(name = "dob") // optionally specify custom column name
    private Date dateOfBirth;

    public Person() {
    }
}