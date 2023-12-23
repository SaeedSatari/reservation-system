package com.softwaveco.clients;

import com.amadeus.Amadeus;
import org.springframework.stereotype.Component;

@Component
public class AmadeusClient {

    private Amadeus getAmadeus() {
        return Amadeus
                .builder("gyB2Ay8kXpy9G7KgX2u1hZPEvFUOLnGt", "0ayTWMXfp4CYjfPK")
                .build();
    }
}
