package com.softwaveco;

import com.amadeus.Amadeus;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightAvailability;
import com.google.gson.Gson;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ReservationSystemApplication {

    //	public static void main(String[] args) {
//		SpringApplication.run(ReservationSystemApplication.class, args);
//	}
    public static void main(String[] args) throws ResponseException {

        Amadeus amadeus = Amadeus
                .builder("gyB2Ay8kXpy9G7KgX2u1hZPEvFUOLnGt", "0ayTWMXfp4CYjfPK")
                .build();

        String body = "{\"originDestinations\":[{\"id\":\"1\",\"originLocationCode\":\"THR\",\"destinationLocationCode\":\"MCT\",\"departureDateTime\":{\"date\":\"2023-12-24\",\"time\":\"21:15:00\"}}],\"travelers\":[{\"id\":\"1\",\"travelerType\":\"ADULT\"}],\"sources\":[\"GDS\"]}";

        FlightAvailability[] flightAvailabilities = amadeus.shopping.availability.flightAvailabilities.post(body);

        if (flightAvailabilities[0].getResponse().getStatusCode() != 200) {
            System.out.println("Wrong status code: " + flightAvailabilities[0].getResponse().getStatusCode());
            System.exit(-1);
        }

        Gson gson = new Gson();
        List<String> result = new ArrayList<>();
        for (FlightAvailability flightAvailability: flightAvailabilities){
            String json = gson.toJson(flightAvailability);
            result.add(json);
        }
        System.out.println(result);
    }
}
