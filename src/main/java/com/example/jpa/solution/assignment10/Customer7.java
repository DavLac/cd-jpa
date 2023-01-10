package com.example.jpa.solution.assignment10;

import javax.validation.constraints.*;

public class Customer7 {

    @NotNull
    private Integer id;

    @Size(min = 2, max = 45, message = "Name should be between 2 and 45 characters")
    private String name;

    @Min(18)
    @Max(150)
    private int age;

    @Email
    private String email;

    public Customer7(Integer id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

}