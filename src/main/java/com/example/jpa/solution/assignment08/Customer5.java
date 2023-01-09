package com.example.jpa.solution.assignment08;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@NamedQuery(name = "Customer5.findByRentedCarMake",
        query = "SELECT cus " +
                "FROM RentalContract2 rc " +
                "JOIN rc.car5 c " +
                "JOIN rc.customer5 cus " +
                "WHERE c.make = ?1")
@NamedQuery(name = "Customer5.findAllPeopleThatRentedAtLeastXDifferentCars",
        query = "SELECT cus " +
                "FROM RentalContract2 rc " +
                "JOIN rc.customer5 cus " +
                "GROUP BY cus " +
                "HAVING COUNT(DISTINCT rc.car5) >= ?1")
/*
select rc.customer5_id
from rental_contract2 rc
join customer5 AS cus ON rc.customer5_id = cus.id
group by rc.customer5_id
having count(distinct rc.car5_id) >= 2
 */
public class Customer5 {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String name;
    private String address;

    @OneToMany(mappedBy = "customer5")
    private List<RentalContract2> rentalContract2List = new ArrayList<>();

    public Customer5(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Customer5() {
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
    public String toString() {
        return "Customer5{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}