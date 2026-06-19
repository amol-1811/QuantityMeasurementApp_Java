package com.main.service;

import com.main.request.dto.QuantityDTO;

public interface QuantityMeasurementService {

    public double add(QuantityDTO q1, QuantityDTO q2);

    public boolean compare(QuantityDTO q1, QuantityDTO q2);
}
