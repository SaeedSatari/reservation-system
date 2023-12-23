package com.softwaveco.clients.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AmadeusFlightAvailabilityRequest {
    private List<OriginDestination> originDestinations;
    private List<Traveler> travelers;
    private List<String> sources;
}
