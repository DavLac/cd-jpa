package com.example.jpa.assignment.assignment08;

import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "rental_contract2")
@NamedQuery(name = "RentalContract2.findByCustomerAddress", query = "SELECT rc " +
                                                                    "FROM RentalContract2 rc " +
                                                                    "JOIN Customer5 AS cus ON rc.customer = cus.id " +
                                                                    "WHERE address = ?1")
@ToString
public class RentalContract2 {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "customer")
    private Customer5 customer;
    @ManyToOne
    @JoinColumn(name = "car")
    private Car5 car;
    @Column(name = "contract_start_date")
    private Integer startDate;
    @Column(name = "contract_end_date")
    private Integer endDate;

    public RentalContract2() {
    }

    public RentalContract2(Customer5 customer, Car5 car, Integer startDate, Integer endDate) {
        this.customer = customer;
        this.car = car;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public Customer5 getCustomer() {
        return customer;
    }

    public void setCustomer(final Customer5 customer) {
        this.customer = customer;
    }

    public Car5 getCar() {
        return car;
    }

    public void setCar(final Car5 car) {
        this.car = car;
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

        final RentalContract2 that = (RentalContract2) o;

        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(customer, that.customer)) return false;
        if (!Objects.equals(car, that.car)) return false;
        if (!Objects.equals(startDate, that.startDate)) return false;
        return Objects.equals(endDate, that.endDate);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + (car != null ? car.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        return result;
    }


}
