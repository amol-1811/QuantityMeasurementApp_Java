package com.main.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "quantity")
public class Quantity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double value;
    private String unit;
    private String type;

    public Quantity() {

    }
    public Quantity(Double value, String unit, String type) {
        this.value = value;
        this.unit = unit;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return Objects.equals(id, quantity.id) && Objects.equals(value, quantity.value) && Objects.equals(unit, quantity.unit) && Objects.equals(type, quantity.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value, unit, type);
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "id=" + id +
                ", value=" + value +
                ", unit='" + unit + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
