package com.main.request.dto;


import java.util.Objects;

public class QuantityDTO {

    private Double value;
    private String unit;
    private String type;

    public QuantityDTO() {}

    public QuantityDTO(Double value, String unit, String type) {
        this.value = value;
        this.unit = unit;
        this.type = type;
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
        QuantityDTO that = (QuantityDTO) o;
        return Objects.equals(value, that.value) && Objects.equals(unit, that.unit) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit, type);
    }

    @Override
    public String toString() {
        return "QuantityDTO{" +
                "value=" + value +
                ", unit='" + unit + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
