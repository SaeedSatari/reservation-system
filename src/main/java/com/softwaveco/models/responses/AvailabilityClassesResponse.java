package com.softwaveco.models.responses;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AvailabilityClassesResponse {
    private String numberOfBookableSeats;
    @SerializedName("class")
    private String seatClass;
}
