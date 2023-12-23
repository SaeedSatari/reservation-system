package com.softwaveco.models.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SegmentResponse {
    private List<AvailabilityClassesResponse> availabilityClasses;
    private String id;
    private String numberOfStops;
    private AirportInfoResponse departure;
    private AirportInfoResponse arrival;
    private String carrierCode;
    private String number;
    private AircraftResponse aircraft;
}
