package com.main.repository;

import com.main.entity.QuantityMeasurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuantityMeasurementRepository extends JpaRepository<QuantityMeasurement, Long> {
}
