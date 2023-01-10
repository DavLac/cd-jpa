package com.example.jpa.solution.assignment07;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="company_customer")
@PrimaryKeyJoinColumn(foreignKey=@ForeignKey(name = "fk_customer4"))
public class CompanyCustomer extends Customer4 {
    @Column(name="vat_number")
    private Long vatNumber;

    public CompanyCustomer() {
    }

    public CompanyCustomer(String name, Long vatNumber) {
        super(name);
        this.vatNumber = vatNumber;
    }

    public Long getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(final Long vatNumber) {
        this.vatNumber = vatNumber;
    }

    @Override
    public String toString() {
        return "CompanyCustomer{" +
                "vatNumber=" + vatNumber +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
