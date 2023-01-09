package com.example.jpa.solution.assignment08.demo;

import javax.persistence.*;

@Entity
@NamedQuery(name = "Customr.findByName", query = "FROM Customr WHERE name = ?1")
public class Customr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;
    protected String name;

    public Customr(String name) {
        this.name = name;
    }

    public Customr() {
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
        return "Customr{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

