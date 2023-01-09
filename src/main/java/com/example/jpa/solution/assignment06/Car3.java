package com.example.jpa.solution.assignment06;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Car3 {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String make;
    private String model;
    private Integer mileage;
    private Integer value;
    @Column(name = "last_cleaned")
    private Long lastCleaned;

    @OneToMany(mappedBy = "car3")
    private List<RentalContract> rentalContractList = new ArrayList<>();

    public Car3(String make, String model, Integer mileage, Integer value, Long lastCleaned) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.value = value;
        this.lastCleaned = lastCleaned;
    }

    public Car3() {
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

    public List<RentalContract> getRentalContractList() {
        return rentalContractList;
    }

    public void setRentalContractList(List<RentalContract> rentalContractList) {
        this.rentalContractList = rentalContractList;
    }

    @Override
    public String toString() {
        return "Car3{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                ", value=" + value +
                ", lastCleaned=" + lastCleaned +
                '}';
    }
}
