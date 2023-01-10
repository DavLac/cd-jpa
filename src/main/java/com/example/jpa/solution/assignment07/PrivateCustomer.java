package com.example.jpa.solution.assignment07;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="private_customer")
@PrimaryKeyJoinColumn(foreignKey=@ForeignKey(name = "fk_customer4"))
public class PrivateCustomer extends Customer4 {
    @Column(name="driver_licence_number")
    private Integer driverLicenceNumber;

    public PrivateCustomer(String name, Integer driverLicenceNumber) {
        super(name);
        this.driverLicenceNumber = driverLicenceNumber;
    }

    public PrivateCustomer() {
    }

    public Integer getDriverLicenceNumber() {
        return driverLicenceNumber;
    }

    public void setDriverLicenceNumber(final Integer driverLicenceNumber) {
        this.driverLicenceNumber = driverLicenceNumber;
    }

    @Override
    public String toString() {
        return "PrivateCustomer{" +
                "driverLicenceNumber=" + driverLicenceNumber +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
