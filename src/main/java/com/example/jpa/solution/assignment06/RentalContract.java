package com.example.jpa.solution.assignment06;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "rental_contract")
public class RentalContract {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "customer3_id", nullable = false, foreignKey=@ForeignKey(name = "Fk_rentalcontract_customer3")) // owning side
    private Customer3 customer3;

    @ManyToOne
    @JoinColumn(name = "car3_id", nullable = false, foreignKey=@ForeignKey(name = "Fk_rentalcontract_car3")) // owning side
    private Car3 car3;
    @Column(name = "contract_start_date")
    private Integer startDate;
    @Column(name = "contract_end_date")
    private Integer endDate;

    public RentalContract(Customer3 customer3, Car3 car3, Integer startDate, Integer endDate) {
        this.customer3 = customer3;
        this.car3 = car3;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public RentalContract() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public Customer3 getCustomer3() {
        return customer3;
    }

    public void setCustomer3(Customer3 customer3) {
        this.customer3 = customer3;
    }

    public Car3 getCar3() {
        return car3;
    }

    public void setCar3(Car3 car3) {
        this.car3 = car3;
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
    public String toString() {
        return "RentalContract{" +
                "id=" + id +
                ", customer3=" + customer3 +
                ", car3=" + car3 +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
