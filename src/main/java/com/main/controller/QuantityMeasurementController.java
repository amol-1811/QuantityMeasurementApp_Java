package com.main.controller;

import com.main.request.dto.QuantityRequestDTO;
import com.main.service.QuantityMeasurementService;
import org.hibernate.internal.util.StringHelper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuantityMeasurementController {

    private final QuantityMeasurementService quantityMeasurementService;

    QuantityMeasurementController(QuantityMeasurementService quantityMeasurementService) {
        this.quantityMeasurementService = quantityMeasurementService;
    }

    @GetMapping("/quantity_measurement")
    public ResponseEntity<?> getUnit(@PathVariable String unit) {
        if (!StringHelper.isBlank(unit)) {
            return ResponseEntity.ok("Your request unit is: " + unit);
        } else {
            return ResponseEntity.badRequest()
                    .body("Your requested unit is not valid");
        }
    }

    @RequestMapping(path = "/quantity_measurement/add", method = RequestMethod.POST)
    public ResponseEntity<?> performAdd(@RequestBody QuantityRequestDTO quantityRequestDTO) {
        Double result = quantityMeasurementService.add(quantityRequestDTO.getQuantity1(), quantityRequestDTO.getQuantity2());
        return ResponseEntity.ok(result);
    }

    @RequestMapping(path = "/quantity_measurement/compare", method = RequestMethod.POST)
    public ResponseEntity<?> performCompare(@RequestBody QuantityRequestDTO quantityRequestDTO) {
        Boolean result = quantityMeasurementService.compare(quantityRequestDTO.getQuantity1(), quantityRequestDTO.getQuantity2());
        return ResponseEntity.ok(result);
    }
}
