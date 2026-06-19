package com.main.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "quantity_measurement")
public class QuantityMeasurement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "first_quantity_id")
    private Quantity firstQuantityObject;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "second_quantity_id")
    private Quantity secondQuantityObject;

    private String operation;
    private Double result;
    private String error;

    public QuantityMeasurement(Quantity firstQuantityObject, Quantity secondQuantityObject, String operation, Double result) {
        this.firstQuantityObject = firstQuantityObject;
        this.secondQuantityObject = secondQuantityObject;
        this.operation = operation;
        this.result = result;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public QuantityMeasurement(String error) {
        this.error = error;
    }

    public Quantity getFirstQuantityObject() {
        return firstQuantityObject;
    }

    public void setFirstQuantityObject(Quantity firstQuantityObject) {
        this.firstQuantityObject = firstQuantityObject;
    }

    public Quantity getSecondQuantityObject() {
        return secondQuantityObject;
    }

    public void setSecondQuantityObject(Quantity secondQuantityObject) {
        this.secondQuantityObject = secondQuantityObject;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Objects.equals(id, that.id) && Objects.equals(firstQuantityObject, that.firstQuantityObject) && Objects.equals(secondQuantityObject, that.secondQuantityObject) && Objects.equals(operation, that.operation) && Objects.equals(result, that.result) && Objects.equals(error, that.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstQuantityObject, secondQuantityObject, operation, result, error);
    }

    @Override
    public String toString() {
        return "QuantityMeasurement{" +
                "id=" + id +
                ", firstQuantityObject=" + firstQuantityObject +
                ", secondQuantityObject=" + secondQuantityObject +
                ", operation='" + operation + '\'' +
                ", result=" + result +
                ", error='" + error + '\'' +
                '}';
    }
}
