package com.example.jpa.assignment.assignment09;

import javax.persistence.*;
import java.util.Objects;

@Entity
@EntityListeners(DatabaseEventListener.class)
public class Car6 {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "make")
    private String make;
    @Basic
    @Column(name = "model")
    private String model;
    @Basic
    @Column(name = "mileage")
    private Integer mileage;
    @Basic
    @Column(name = "value")
    private Integer value;
    @Basic
    @Column(name = "lastcleaned")
    private Long lastCleaned;

    public Car6() {
    }

    public Car6(String make, String model, Integer mileage, Integer value, Long lastCleaned) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.value = value;
        this.lastCleaned = lastCleaned;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(final String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(final String model) {
        this.model = model;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(final Integer mileage) {
        this.mileage = mileage;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(final Integer value) {
        this.value = value;
    }

    public Long getLastCleaned() {
        return lastCleaned;
    }

    public void setLastCleaned(final Long lastCleaned) {
        this.lastCleaned = lastCleaned;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Car6 car = (Car6) o;

        if (!Objects.equals(id, car.id)) return false;
        if (!Objects.equals(make, car.make)) return false;
        if (!Objects.equals(model, car.model)) return false;
        if (!Objects.equals(mileage, car.mileage)) return false;
        if (!Objects.equals(value, car.value)) return false;
        return Objects.equals(lastCleaned, car.lastCleaned);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (make != null ? make.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (mileage != null ? mileage.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (lastCleaned != null ? lastCleaned.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car6{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                ", value=" + value +
                ", lastCleaned=" + lastCleaned +
                '}';
    }
}
