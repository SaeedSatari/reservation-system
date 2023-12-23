package com.softwaveco.clients;

import com.amadeus.Amadeus;
import com.amadeus.resources.FlightAvailability;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AmadeusClient {

    private Amadeus getAmadeus() {
        return Amadeus
                .builder("gyB2Ay8kXpy9G7KgX2u1hZPEvFUOLnGt", "0ayTWMXfp4CYjfPK")
                .build();
    }

    public FlightAvailability[] getFlightAvailabilities(String body) {
        try {
            log.info("getting flight availabilities...");
            FlightAvailability[] flightAvailabilities = getAmadeus().shopping.availability.flightAvailabilities.post(body);
            if (flightAvailabilities[0].getResponse().getStatusCode() != 200) {
                log.warn("Wrong status code: " + flightAvailabilities[0].getResponse().getStatusCode());
            }
            return flightAvailabilities;
        } catch (Exception e) {
            log.error("Error in getFlightAvailabilities: {}", e.getMessage());
            throw new RuntimeException("Error in getFlightAvailabilities: ", e);
        }
    }
}
