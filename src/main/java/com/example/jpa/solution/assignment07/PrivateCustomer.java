package com.example.jpa.solution.assignment07;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name="private_customer")
@DiscriminatorValue("ProductOwner")
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
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final PrivateCustomer customer = (PrivateCustomer) o;

        if (!Objects.equals(id, customer.id)) return false;
        if (!Objects.equals(name, customer.name)) return false;
        return Objects.equals(driverLicenceNumber, customer.driverLicenceNumber);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (driverLicenceNumber != null ? driverLicenceNumber.hashCode() : 0);
        return result;
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
