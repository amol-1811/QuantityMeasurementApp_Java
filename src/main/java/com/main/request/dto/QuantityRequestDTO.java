package com.main.request.dto;

import java.util.Objects;

public class QuantityRequestDTO {

    private QuantityDTO quantity1;
    private QuantityDTO quantity2;

    public QuantityDTO getQuantity1() {
        return quantity1;
    }

    public void setQuantity1(QuantityDTO quantity1) {
        this.quantity1 = quantity1;
    }

    public QuantityDTO getQuantity2() {
        return quantity2;
    }

    public void setQuantity2(QuantityDTO quantity2) {
        this.quantity2 = quantity2;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        QuantityRequestDTO that = (QuantityRequestDTO) o;
        return Objects.equals(quantity1, that.quantity1) && Objects.equals(quantity2, that.quantity2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity1, quantity2);
    }

    @Override
    public String toString() {
        return "QuantityRequestDTO{" +
                "quantity1=" + quantity1 +
                ", quantity2=" + quantity2 +
                '}';
    }
}
