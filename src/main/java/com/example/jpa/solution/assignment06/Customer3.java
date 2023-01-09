package com.example.jpa.solution.assignment06;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer3 {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "customer3")
    private List<RentalContract> rentalContractList = new ArrayList<>();

    public Customer3(String name) {
        this.name = name;
    }

    public Customer3() {
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

    public List<RentalContract> getRentalContractList() {
        return rentalContractList;
    }

    public void setRentalContractList(List<RentalContract> rentalContractList) {
        this.rentalContractList = rentalContractList;
    }

    @Override
    public String toString() {
        return "Customer3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
