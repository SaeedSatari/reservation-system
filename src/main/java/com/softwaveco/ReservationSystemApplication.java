package com.softwaveco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReservationSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReservationSystemApplication.class, args);
    }
//    public static void main(String[] args) throws ResponseException {
//
//        Amadeus amadeus = Amadeus
//                .builder("gyB2Ay8kXpy9G7KgX2u1hZPEvFUOLnGt", "0ayTWMXfp4CYjfPK")
//                .build();
//
//        String body = "{\"originDestinations\":[{\"id\":\"1\",\"originLocationCode\":\"THR\",\"destinationLocationCode\":\"MCT\",\"departureDateTime\":{\"date\":\"2023-12-24\",\"time\":\"21:15:00\"}}],\"travelers\":[{\"id\":\"1\",\"travelerType\":\"ADULT\"}],\"sources\":[\"GDS\"]}";
//
//        FlightOfferSearch[] flightOffersSearches = amadeus.shopping.flightOffersSearch.get(
//                Params.with("originLocationCode", "SYD")
//                        .and("destinationLocationCode", "BKK")
//                        .and("departureDate", "2023-12-25")
//                        .and("returnDate", "2023-12-31")
//                        .and("adults", 1)
//                        .and("max", 2));
//
//        // We price the 2nd flight of the list to confirm the price and the availability
//        FlightPrice flightPricing = amadeus.shopping.flightOffersSearch.pricing.post(body);
//
//        if (flightOffersSearches[0].getResponse().getStatusCode() != 200) {
//            System.out.println("Wrong status code: " + flightOffersSearches[0].getResponse().getStatusCode());
//            System.exit(-1);
//        }
//
//        Gson gson = new Gson();
//        List<String> result = new ArrayList<>();
//        for (FlightOfferSearch flightAvailability : flightOffersSearches) {
//            String json = gson.toJson(flightAvailability);
//            result.add(json);
//        }
//        System.out.println(result);
//    }
}
