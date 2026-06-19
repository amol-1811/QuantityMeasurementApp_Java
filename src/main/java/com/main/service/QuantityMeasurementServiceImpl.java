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

    private final QuantityMeasurementRepository quantityMeasurementRepository;

    QuantityMeasurementServiceImpl(QuantityMeasurementRepository quantityMeasurementRepository) {
        this.quantityMeasurementRepository = quantityMeasurementRepository;
    }

    private double convertToBase(QuantityDTO dto) {
        if (MeasurementType.LENGTH.getMeasurementType().equalsIgnoreCase(dto.getType())) {
            return LengthUnit.valueOf(dto.getUnit()).toBase(dto.getValue());
        } else if (MeasurementType.WEIGHT.getMeasurementType().equalsIgnoreCase(dto.getType())) {
            return WeightUnit.valueOf(dto.getUnit()).toBase(dto.getValue());
        }
        throw new QuantityMeasurementException("Invalid Type");
    }

    @Override
    public double add(QuantityDTO q1, QuantityDTO q2) {
        if (!q1.getType().equals(q2.getType())) {
            throw new QuantityMeasurementException("Different types not allowed");
        }

        double result = convertToBase(q1) + convertToBase(q2);

        quantityMeasurementRepository.save(new QuantityMeasurement(
                new Quantity(q1.getValue(), q1.getUnit(), q1.getType()),
                new Quantity(q2.getValue(), q2.getUnit(), q2.getType()),
                ArithmeticOperationEnum.ADD.getOperation(),
                result
        ));

        return result;
    }

    @Override
    public boolean compare(QuantityDTO q1, QuantityDTO q2) {
        if (!q1.getType().equals(q2.getType())) {
            throw new QuantityMeasurementException("Different types not allowed");
        }

        return convertToBase(q1) == convertToBase(q2);
    }
}
