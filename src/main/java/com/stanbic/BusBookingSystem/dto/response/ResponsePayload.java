package com.stanbic.BusBookingSystem.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponsePayload {
    private String responseCode;
    private String responseMsg;
    private String responseDesc;
}
