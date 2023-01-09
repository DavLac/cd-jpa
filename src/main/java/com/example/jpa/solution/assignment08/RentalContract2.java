package com.example.jpa.solution.assignment08;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "rental_contract2")
@NamedQuery(name = "RentalContract2.findByCustomerAddress",
        query = "SELECT rc FROM RentalContract2 rc JOIN rc.customer5 c WHERE c.address = ?1")
public class RentalContract2 {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "customer5_id", nullable = false) // owning side
    private Customer5 customer5;

    @ManyToOne
    @JoinColumn(name = "car5_id", nullable = false) // owning side
    private Car5 car5;
    @Column(name = "contract_start_date")
    private Integer startDate;
    @Column(name = "contract_end_date")
    private Integer endDate;

    public RentalContract2(Customer5 customer5, Car5 car5, Integer startDate, Integer endDate) {
        this.customer5 = customer5;
        this.car5 = car5;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public RentalContract2() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public Customer5 getCustomer5() {
        return customer5;
    }

    public void setCustomer5(Customer5 customer5) {
        this.customer5 = customer5;
    }

    public Car5 getCar5() {
        return car5;
    }

    public void setCar5(Car5 car5) {
        this.car5 = car5;
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
    public String toString() {
        return "RentalContract2{" +
                "id=" + id +
                ", customer5=" + customer5 +
                ", car5=" + car5 +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
