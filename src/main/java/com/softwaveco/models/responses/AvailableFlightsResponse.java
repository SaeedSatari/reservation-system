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
public class AvailableFlightsResponse {
    private String id;
    private String duration;
    private List<SegmentResponse> segments;
}
