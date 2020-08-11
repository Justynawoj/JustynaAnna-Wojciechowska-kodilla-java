package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {

    public boolean findFlight(Flight flight) throws RouteNotFoundException{

        HashMap<String, Boolean> flights = new HashMap<>();
        flights.put("WRO", true);
        flights.put("FRA", true);
        flights.put("NAP", false);
        flights.put("BAR", true);
        flights.put("WAW", false);
        flights.put("UDE", true);
        flights.put("KLP", false);

        Boolean departureAirportAvailable = flights.get(flight.getDepartureAirport());
        if(departureAirportAvailable == null){
            throw new RouteNotFoundException();
        }

        Boolean arrivalAirportAvailable = flights.get(flight.getArrivalAirport());
        if(arrivalAirportAvailable == null){
            throw new RouteNotFoundException();
        }

        return departureAirportAvailable && arrivalAirportAvailable;
    }
}
