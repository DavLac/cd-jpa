package com.example.jpa.solution.assignment04;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Car {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "make")
    private String make;
    @Basic
    @Column(name = "model")
    private String model;
    @Basic
    @Column(name = "mileage")
    private Integer mileage;
    @Basic
    @Column(name = "value")
    private Integer value;
    @Basic
    @Column(name = "last_cleaned")
    private Long lastCleaned;

    public Car(String make, String model, Integer mileage, Integer value, Long lastCleaned) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.value = value;
        this.lastCleaned = lastCleaned;
    }

    public Car() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(final String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(final String model) {
        this.model = model;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(final Integer mileage) {
        this.mileage = mileage;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(final Integer value) {
        this.value = value;
    }

    public Long getLastCleaned() {
        return lastCleaned;
    }

    public void setLastCleaned(final Long lastCleaned) {
        this.lastCleaned = lastCleaned;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                ", value=" + value +
                ", lastCleaned=" + lastCleaned +
                '}';
    }
}
