package com.example.jpa.assignment.assignment07;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class CompanyCustomer extends Customer4 {
    private Long vatNumber;

    public Long getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(final Long vatNumber) {
        this.vatNumber = vatNumber;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final CompanyCustomer customer = (CompanyCustomer) o;

        if (!Objects.equals(id, customer.id)) return false;
        if (!Objects.equals(name, customer.name)) return false;
        return Objects.equals(vatNumber, customer.getVatNumber());
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (vatNumber != null ? vatNumber.hashCode() : 0);
        return result;
    }
}
