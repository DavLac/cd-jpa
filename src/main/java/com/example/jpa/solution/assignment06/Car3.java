package com.example.jpa.solution.assignment06;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Car3 {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String make;
    private String model;
    private Integer mileage;
    private Integer value;
    private Integer lastCleaned;

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

    public Integer getLastCleaned() {
        return lastCleaned;
    }

    public void setLastCleaned(final Integer lastCleaned) {
        this.lastCleaned = lastCleaned;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Car3 car = (Car3) o;

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
}
