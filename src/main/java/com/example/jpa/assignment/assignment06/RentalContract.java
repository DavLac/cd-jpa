package com.example.jpa.assignment.assignment06;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "rental_contract")
public class RentalContract {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private transient Customer3 customer;
    private transient Car3 car3;
    private Integer startDate;
    private Integer endDate;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public Customer3 getCustomer() {
        return customer;
    }

    public void setCustomer(final Customer3 customer) {
        this.customer = customer;
    }

    public Car3 getCar() {
        return car3;
    }

    public void setCar(final Car3 car) {
        this.car3 = car;
    }

    public Integer getStartDate() {
        return startDate;
    }

    public void setStartDate(final Integer startDate) {
        this.startDate = startDate;
    }

    public Integer getEndDate() {
        return endDate;
    }

    public void setEndDate(final Integer endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final RentalContract that = (RentalContract) o;

        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(customer, that.customer)) return false;
        if (!Objects.equals(car3, that.car3)) return false;
        if (!Objects.equals(startDate, that.startDate)) return false;
        return Objects.equals(endDate, that.endDate);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + (car3 != null ? car3.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        return result;
    }
}
