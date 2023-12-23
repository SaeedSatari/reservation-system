package com.softwaveco.services;

import com.amadeus.resources.FlightAvailability;
import com.softwaveco.clients.AmadeusClient;
import com.softwaveco.utils.ConvertUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class FlightService {

    private final AmadeusClient amadeusClient;

    public List<String> getFlightAvailabilities(String body) {
        FlightAvailability[] flightAvailabilities = amadeusClient.getFlightAvailabilities(body);
        List<String> result = new ArrayList<>();
        for (FlightAvailability flightAvailability : flightAvailabilities) {
            String flightAvailabilityJson = ConvertUtils.objectToString(flightAvailability);
            result.add(flightAvailabilityJson);
        }
        return result;
    }
}