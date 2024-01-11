package com.stanbic.BusBookingSystem.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Date;

@Data
public class BusDto {
    @NotBlank
    private String busName;
    private String travelRoute;

    @NotBlank
    private String PlateNumber;

    @NotBlank
    private int seatingCapacity;
    private Date timeAvailable;

    private String driverName;
    private String driverContact;

    private String marshalName;
    private String marshalContact;
    private String marshallEmail;
}
