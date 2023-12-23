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
public class ListAvailableFlightsResponse {
    private List<AvailableFlightsResponse> responseList;
}
