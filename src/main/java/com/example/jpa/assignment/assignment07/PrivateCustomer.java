package com.example.jpa.assignment.assignment07;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class PrivateCustomer extends Customer4 {
    private Integer driverLicenceNumber;

    public Integer getDriverLicenceNumber() {
        return driverLicenceNumber;
    }

    public void setDriverLicenceNumber(final Integer driverLicenceNumber) {
        this.driverLicenceNumber = driverLicenceNumber;
    }
}
