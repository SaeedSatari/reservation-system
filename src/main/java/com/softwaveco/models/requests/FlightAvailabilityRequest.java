package com.softwaveco.models.requests;

import com.softwaveco.models.OriginDestination;
import com.softwaveco.models.Traveler;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FlightAvailabilityRequest {
    private List<OriginDestination> originDestinations;
    private List<Traveler> travelers;
    private List<String> sources;
}
