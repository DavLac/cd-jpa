package com.example.jpa.solution.assignment10.demo;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name="my_user_2")
public class MyUser2 {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Size(min = 2, max = 75, message = "Name should be between 2 and 75 characters")
    private String name;

    public MyUser2(String name) {
        this.name = name;
    }

    public MyUser2() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
