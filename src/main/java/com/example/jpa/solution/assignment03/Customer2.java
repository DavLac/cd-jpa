package com.example.jpa.solution.assignment03;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Customer2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;

    @Transient
    private String customField;

    public Customer2() {
    }

    public Customer2(String name, Integer age) {
        this.name = name;
        this.age = age;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(final Integer age) {
        this.age = age;
    }

    public String getCustomField() {
        return customField;
    }

    public void setCustomField(String customField) {
        this.customField = customField;
    }

    @Override
    public String toString() {
        return "Customer2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", customField='" + customField + '\'' +
                '}';
    }
}
