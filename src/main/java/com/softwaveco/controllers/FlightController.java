package com.softwaveco.controllers;

import com.softwaveco.mappers.FlightMapper;
import com.softwaveco.models.requests.FlightAvailabilityRequest;
import com.softwaveco.models.responses.ListAvailableFlightsResponse;
import com.softwaveco.services.FlightService;
import com.softwaveco.utils.ConvertUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@Slf4j
@RequestMapping(path = "/api/v1/flights")
public class FlightController {

    private final FlightService flightService;
    private final FlightMapper flightMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ListAvailableFlightsResponse listFlights(@RequestBody FlightAvailabilityRequest request) {
        log.info("listFlights API...");
        String stringBodyRequest = ConvertUtils.objectToString(request);
        List<String> flightAvailabilities = flightService.getFlightAvailabilities(stringBodyRequest);
        return flightMapper.mapToListAvailableFlightsResponse(flightAvailabilities);
    }
}
