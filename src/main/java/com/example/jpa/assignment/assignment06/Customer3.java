package com.example.jpa.assignment.assignment06;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Customer3 {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String name;
    @OneToMany(mappedBy = "customer3")
    private List<RentalContract> rentalContractList = new ArrayList<>();

    public Customer3() {
    }

    public Customer3(String name) {
        this.name = name;
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

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Customer3 customer = (Customer3) o;

        if (!Objects.equals(id, customer.id)) return false;
        return Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Customer3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
