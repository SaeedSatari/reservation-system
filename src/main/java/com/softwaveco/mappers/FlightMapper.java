package com.softwaveco.mappers;

import com.google.gson.GsonBuilder;
import com.softwaveco.models.responses.AvailableFlightsResponse;
import com.softwaveco.models.responses.ListAvailableFlightsResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FlightMapper {

    public ListAvailableFlightsResponse mapToListAvailableFlightsResponse(List<String> flightAvailabilities) {
        List<AvailableFlightsResponse> availableFlightsResponses = mapToAvailableFlightsResponses(flightAvailabilities);
        return getListAvailableFlightsResponse(availableFlightsResponses);
    }

    private ListAvailableFlightsResponse getListAvailableFlightsResponse(List<AvailableFlightsResponse> availableFlightsResponses) {
        ListAvailableFlightsResponse response = new ListAvailableFlightsResponse();
        response.setResponseList(availableFlightsResponses);
        return response;
    }

    private List<AvailableFlightsResponse> mapToAvailableFlightsResponses(List<String> flightAvailabilities) {
        return flightAvailabilities.stream().map(flightAvailability -> new GsonBuilder()
                .create()
                .fromJson(flightAvailability, AvailableFlightsResponse.class)).collect(Collectors.toList());
    }
}
