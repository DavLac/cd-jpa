package com.example.jpa.assignment.assignment07;

import javax.persistence.Entity;

@Entity
public class CompanyCustomer extends Customer4 {
    private Long vatNumber;

    public Long getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(final Long vatNumber) {
        this.vatNumber = vatNumber;
    }
}
