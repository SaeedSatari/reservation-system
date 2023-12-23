package com.softwaveco.controllers;

import com.google.gson.GsonBuilder;
import com.softwaveco.models.requests.FlightAvailabilityRequest;
import com.softwaveco.models.responses.AvailableFlightsResponse;
import com.softwaveco.models.responses.ListAvailableFlightsResponse;
import com.softwaveco.services.FlightService;
import com.softwaveco.utils.ConvertUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@Slf4j
@RequestMapping(path = "/api/v1/flights")
public class FlightController {

    private final FlightService flightService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ListAvailableFlightsResponse listFlights(@RequestBody FlightAvailabilityRequest request) {
        log.info("listFlights API...");
        String stringBodyRequest = ConvertUtils.objectToString(request);
        List<String> flightAvailabilities = flightService.getFlightAvailabilities(stringBodyRequest);
        ListAvailableFlightsResponse response = new ListAvailableFlightsResponse();
        List<AvailableFlightsResponse> availableFlightsResponses = new ArrayList<>();
        for (String flightAvailability : flightAvailabilities) {
            AvailableFlightsResponse availableFlightsResponse = new GsonBuilder()
                    .create()
                    .fromJson(flightAvailability, AvailableFlightsResponse.class);
            availableFlightsResponses.add(availableFlightsResponse);
        }
        response.setResponseList(availableFlightsResponses);
        return response;
    }
}
