package com.example.jpa.solution.assignment05.demo;

import org.hibernate.annotations.Formula;

import javax.persistence.*;

@Entity
public class Beer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Long fullprice;
    private Long tax;

    // Hibernate way
    @Formula("fullprice * tax")
    private Long finalprice;

    public Beer(Long fullprice, Long tax) {
        this.fullprice = fullprice;
        this.tax = tax;
    }

    public Beer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getFullprice() {
        return fullprice;
    }

    public void setFullprice(Long fullprice) {
        this.fullprice = fullprice;
    }

    public Long getTax() {
        return tax;
    }

    public void setTax(Long tax) {
        this.tax = tax;
    }

    public Long getFinalprice() {
        return finalprice;
    }

    public void setFinalprice(Long finalprice) {
        this.finalprice = finalprice;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "id=" + id +
                ", fullprice=" + fullprice +
                ", tax=" + tax +
                ", finalprice=" + finalprice +
                '}';
    }
}