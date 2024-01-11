package com.stanbic.BusBookingSystem.service;

import com.stanbic.BusBookingSystem.dto.request.BusDto;
import com.stanbic.BusBookingSystem.dto.response.ResponsePayload;
import com.stanbic.BusBookingSystem.entity.Buses;
import com.stanbic.BusBookingSystem.exception.defined.InternalServerError;
import com.stanbic.BusBookingSystem.repository.BusesRepo;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import static org.slf4j.LoggerFactory.getLogger;

@Service
@RequiredArgsConstructor
public class FleetManagementService {
    private final Logger LOGGER = getLogger(FleetManagementService.class);
    private final BusesRepo busesRepo;

    public ResponseEntity<?> enrolNewBus(BusDto busDto) {
        try {
            LOGGER.info("\t--> Building new Bus entity from supplied busDto");
            Buses newBus = Buses.builder()
                    .busName(busDto.getBusName())
                    .PlateNumber(busDto.getPlateNumber())
                    .travelRoute(busDto.getTravelRoute())
                    .timeAvailable(busDto.getTimeAvailable())
                    .seatingCapacity(busDto.getSeatingCapacity())
                    .driverContact(busDto.getDriverContact())
                    .driverName(busDto.getDriverName())
                    .marshalContact(busDto.getMarshalContact())
                    .marshalName(busDto.getMarshalName())
                    .marshallEmail(busDto.getMarshallEmail())
                    .build();

            busesRepo.save(newBus);
            LOGGER.info("\t--> Saved new bus to DB");
            return new ResponseEntity<>(
                    new ResponsePayload("00", "Bus '" + newBus.getBusName() + "' enrolled successfully", null),
                    HttpStatus.OK);
        } catch (Exception e) {
            throw new InternalServerError(e);
        }
    }
}
