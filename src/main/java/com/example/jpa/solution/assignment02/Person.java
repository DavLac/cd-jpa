package com.example.jpa.solution.assignment02;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PERSONS") // optionally specify custom table name
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Column(name = "DOB") // optionally specify custom column name
    private Date dateOfBirth;

    public Person() {}
}
