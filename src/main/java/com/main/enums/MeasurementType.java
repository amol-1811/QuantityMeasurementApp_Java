package com.main.enums;

public enum MeasurementType {

    LENGTH("LENGTH"), WEIGHT("WEIGHT");

    private final String measurementType;

    MeasurementType(String measurementType) {
        this.measurementType = measurementType;
    }

    public String getMeasurementType() {
        return measurementType;
    }
}
