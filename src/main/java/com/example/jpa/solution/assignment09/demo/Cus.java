package com.example.jpa.solution.assignment09.demo;

import javax.persistence.*;

@Entity
public class Cus {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String name;

    @PrePersist
    public void prePersist() {
        System.out.println("Saving " + this.name);
    }

    public Cus(String name) {
        this.name = name;
    }

    public Cus() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cus{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
