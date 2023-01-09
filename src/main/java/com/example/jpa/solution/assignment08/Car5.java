package com.example.jpa.solution.assignment08;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Car5 {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String make;
    private String model;
    private Integer mileage;
    private Integer value;
    @Column(name = "last_cleaned")
    private Long lastCleaned;

    @OneToMany(mappedBy = "car5")
    private List<RentalContract2> rentalContract2List = new ArrayList<>();

    public Car5(String make, String model, Integer mileage, Integer value, Long lastCleaned) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.value = value;
        this.lastCleaned = lastCleaned;
    }

    public Car5() {
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

    public void setLastCleaned(Long lastCleaned) {
        this.lastCleaned = lastCleaned;
    }

    public List<RentalContract2> getRentalContract2List() {
        return rentalContract2List;
    }

    public void setRentalContract2List(List<RentalContract2> rentalContract2List) {
        this.rentalContract2List = rentalContract2List;
    }

    @Override
    public String toString() {
        return "Car5{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                ", value=" + value +
                ", lastCleaned=" + lastCleaned +
                '}';
    }
}
