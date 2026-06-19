package com.main.service;

import com.main.entity.Quantity;
import com.main.entity.QuantityMeasurement;
import com.main.enums.ArithmeticOperationEnum;
import com.main.enums.LengthUnit;
import com.main.enums.MeasurementType;
import com.main.enums.WeightUnit;
import com.main.exception.QuantityMeasurementException;
import com.main.repository.QuantityMeasurementRepository;
import com.main.request.dto.QuantityDTO;
import org.springframework.stereotype.Service;

@Service
public class QuantityMeasurementServiceImpl implements QuantityMeasurementService{

    @Override
    public double add(QuantityDTO q1, QuantityDTO q2) {
        return 0d;
    }

    @Override
    public boolean compare(QuantityDTO q1, QuantityDTO q2) {
        return true;
    }
}
