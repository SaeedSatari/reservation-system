package com.softwaveco.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OriginDestination {
    private String id;
    private String originLocationCode;
    private String destinationLocationCode;
    private DepartureDateTime departureDateTime;
}
