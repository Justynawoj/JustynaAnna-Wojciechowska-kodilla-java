package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;


public class FlightFinder {

    public boolean findFlight(Flight flight) throws RouteNotFoundException{

        boolean flightAvailability = false;

        HashMap<String, Boolean> flights = new HashMap<>();
        flights.put("WRO", true);
        flights.put("FRA", true);
        flights.put("NAP", false);
        flights.put("BAR", true);
        flights.put("WAW", false);
        flights.put("UDE", true);
        flights.put("KLP", false);

        String searchedAirport = flight.getArrivalAirport();
        HashMap<Flight,Boolean> flightFounded = new HashMap<>();

            for(Map.Entry<String, Boolean> entry: flights.entrySet()) {
                if (entry.getKey().equalsIgnoreCase(searchedAirport)) {
                    flightFounded.put(new Flight("current airport",entry.getKey()),entry.getValue());
                    }
                }

        for(Map.Entry<Flight, Boolean> entry: flightFounded.entrySet()) {
            flightAvailability = entry.getValue();
        }
        if(flightFounded.size()==0){
            throw new RouteNotFoundException();
        }

        return flightAvailability;
    }
}
