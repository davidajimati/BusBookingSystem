package com.stanbic.BusBookingSystem.controller;

import com.stanbic.BusBookingSystem.dto.request.BusDto;
import com.stanbic.BusBookingSystem.service.BusManagementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("bus-booking-system/admin/")
public class BusesController {
    /**
     * enroll bus
     * list available buses
     * view bookings
     * revoke user
     * reset user
     * enroll user(s)
     * remove user(s)
     */

    private final BusManagementService busManagementService;

    @PostMapping("enroll-bus")

    public ResponseEntity<?> enrollNewBus(@Validated(BusDto.class) @RequestBody BusDto newBusDto) {
        return busManagementService.enrolNewBus(newBusDto);
    }
}
