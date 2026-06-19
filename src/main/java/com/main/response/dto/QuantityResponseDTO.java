package com.main.response.dto;

import java.util.Objects;

public class QuantityResponseDTO {

    private Double result;

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        QuantityResponseDTO that = (QuantityResponseDTO) o;
        return Objects.equals(result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(result);
    }

    @Override
    public String toString() {
        return "QuantityResponseDTO{" +
                "result=" + result +
                '}';
    }
}
