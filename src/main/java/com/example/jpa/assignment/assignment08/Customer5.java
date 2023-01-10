package com.example.jpa.assignment.assignment08;

import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

@Entity
@ToString
@NamedQuery(name = "Customer5.findByRentedCarMake" , query =    "SELECT cus " +
                                                                "FROM Customer5 cus " +
                                                                "JOIN RentalContract2 AS rc ON cus.id = rc.customer " +
                                                                "JOIN Car5 AS car ON rc.car = car.id " +
                                                                "WHERE make = ?1")
@NamedQuery(name = "Customer5.findAllPeopleThatRentedAtLeastXDifferentCars" , query =   "SELECT cus " +
                                                                                        "FROM Customer5 cus " +
                                                                                        "JOIN RentalContract2 AS rc ON cus.id = rc.customer " +
                                                                                        "GROUP BY cus " +
                                                                                        "HAVING COUNT(DISTINCT rc.car) >= ?1")

public class Customer5 {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String name;
    private String address;

    public Customer5() {
    }

    public Customer5(String name, String address) {
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Customer5 customer = (Customer5) o;

        if (!Objects.equals(id, customer.id)) return false;
        if (!Objects.equals(name, customer.name)) return false;
        return Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}